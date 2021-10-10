package pl.lukaszkarulek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        WypozyczalniaSamochodow wypozyczalniaSamochodow = new WypozyczalniaSamochodow();

        while (shouldContinue) {
            System.out.println("");
            System.out.println("System wypożyczalni samochodów. Wybierz działanie:");
            System.out.println("1. Pokaż listę samochodów");
            System.out.println("2. Wprowadz do systemu nowy samochód");
            System.out.println("3. Wyszukaj samochód po numerze rejestracyjnym:");
            System.out.println("4. Wyszukaj samochód po numerze VIN:");
            System.out.println("9. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> wypozyczalniaSamochodow.displayAuta();
                case 2 -> {wypozyczalniaSamochodow.addSamochod(); System.out.println("Wprowadzanie nowej pozycji zakończyło się sukcesem"); System.out.println();}
                case 3 -> wypozyczalniaSamochodow.displaySamochodPoNrRejestracyjnym();
                case 4 -> wypozyczalniaSamochodow.displaySamochodPoNrVin();
                case 9 -> {System.out.println("Wyłączanie systemu"); shouldContinue = false;}
                default -> System.out.println("Wybrałeś niepoprawne działanie. Spróbuj jeszcze raz");
            }
        }
    }
}

// projekt wymaga jeszcze wielu usprawnień