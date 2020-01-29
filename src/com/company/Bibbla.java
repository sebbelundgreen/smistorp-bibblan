package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Bibbla implements Serializable {
    private ArrayList<Bibliotekarie> bibliotekaries = new ArrayList<Bibliotekarie>();
    private ArrayList<Kund> kunds = new ArrayList<Kund>();
    private BooksInSmistorp booksInSmistorp = new BooksInSmistorp();

    public void meny() {
        while (true) {
            System.out.println("Välkommen till Smistorps bibliotek");
            System.out.println("1. Logga in");
            System.out.println("2. Skapa konto");
            System.out.println("3. Avbryt");
            String alternativ = Inputs.scanner.nextLine();

            switch (alternativ) {
                case "1":
                    loggaIn();
                    break;
                case "2":
                    skapaKonto();
                    break;
                case "3":
                    System.out.println("Välkommen åter!");
                    return;
                default:
                    Inputs.felmeddelande();
                    break;
            }
        }
    }

    private void skapaKonto() {
        while (true) {
            System.out.println("1. Skapa användarkonto");
            System.out.println("2. Tillbaka");
            String alternativ = Inputs.scanner.nextLine();

            String användarnamn = "";
            String lösenord = "";
            if (alternativ.equals("1")) {
                användarnamn = Inputs.kontoInputs("användarnamn");
                lösenord = Inputs.kontoInputs("lösenord");
            }

            switch (alternativ) {
                case "1":
                    kunds.add(new Kund(användarnamn, lösenord));
                    return;
                case "2":
                    return;
            }
        }
    }

    private void loggaIn() {
        ArrayList<Konto> kontos = new ArrayList<>();
        kontos.addAll(users);
        kontos.addAll(admins);
        
        System.out.println("Välj ett konto att logga in med.");
        for (int i = 0; i < kontos.size(); i++) {
            System.out.printf("%d, %s %n");
        }
        int answer = Inputs.nummerVal(kontos.size());
        if (answer == -1)
            return;
        Konto konto = kontos.get(answer);

    }



}