package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    private final Path path = Paths.get("booksInSmistorp.txt");

    Books(){
        List<String> nameList = getNames();

        printAllNames(nameList);
        String newName = getUserInput();

        if (!newName.isBlank()) {
            nameList.add(newName);
            saveNewFile(nameList);
        }
    }

    private List<String> getNames(){
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void printAllNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    private String getUserInput(){
        System.out.println("Input a new name:");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private void saveNewFile(List<String> names){
        try {
            Files.write(path, names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}