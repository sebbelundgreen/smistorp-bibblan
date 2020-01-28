package com.company;

import java.util.Scanner;

public class Inputs {
    public static Scanner scanner = new Scanner(System.in);

    private Inputs() {
    }

    public static int nummerVal(int arrayListSize) {
        int answer;
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Fel input!");
                continue;
            }
            if (answer <= arrayListSize && answer >= 0) {
                return answer-1;
            } else
                System.out.println("Felaktigt nummer!");
        }
    }

    public static void felmeddelande() {
        System.out.println("Felaktig inskrift, försök igen.");
        System.out.println("Enter för att fortsätta . . .");
        scanner.nextLine();
    }

    public static String kontoInputs(String type) {
        String answer;
        while (true) {
            System.out.println("Skriv in  " + type);
            answer = scanner.nextLine();
            if (answer.equals("") || answer.length() < 4) {
                System.out.println(type + " kan inte vara kortare än 4 tecken.");
                continue;
            }
            break;
        }
        return answer;
    }
}
