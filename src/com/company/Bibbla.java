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

    private void logIn {
        System.out.println("Ange användarnamn: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        if (userName == "staff"){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Välkommen bibliotekarie till Smistorps bibblas portal. Vad vill du göra?");
            int choice;

            while (true) {
                System.out.println("1. Söka efter användare " + "\n" +
                        "2. Lägga till bok " + "\n" +
                        "3. Ta bort bok " + "\n" +
                        "4. Se tillgängliga böcker " + "\n" +
                        "5. Se utlånade böcker " + "\n");

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Enbart nummer!");
                    continue;
                }

                if (choice > 0 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Enbart 1 eller 2, försök igen!");
                }

            }

            switch (choice) {

                case 1:
                    searchForUser();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    seeAvailableBooks();
                    break;
                case 5:
                    seeRentedBooks();
                    break;
            }
        }
        }
    }

}
