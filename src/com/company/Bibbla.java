package com.company;

import java.util.Scanner;

public class Bibbla {

    private boolean exitBibbla = false;


    private void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Welcome to Smistorps Bibbla ----");
        int choice;

        while (true) {
            System.out.println("1. Logga in " + "\n" +
                    "2. Avbryt " + "\n" +
                    "3. Exit game " + "\n");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Enbart nummer!");
                continue;
            }

            if (choice > 0 && choice <= 2) {
                break;
            } else {
                System.out.println("Enbart 1 eller 2, försök igen!");
            }

        }

        switch (choice) {

            case 1:
                logIn();
                break;
            case 2:
                exitBibbla();
                break;
        }
    }

    private void exitBibbla() {
        System.out.println("Välkommen åter!");
        exitBibbla = true;
    }

}
