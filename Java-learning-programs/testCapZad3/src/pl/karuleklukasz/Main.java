package pl.karuleklukasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.println("Tablica wielowymiarowa przyjmującą String, do drugiej tablicy przenosi wartość DŁUGOŚCI Stringów w liczbach całkowitych");
        System.out.println();

//  wprowadzanie wartości liczby kolum w tablicy1
        System.out.println("Wprowadź wymiary tablicy wielowymiarowej");
        System.out.print("Liczba kolumn:  ");
        int tableDim1Length = scanner.nextInt();
        System.out.print("Liczba argumentów w poszczególnych kolumnach:  ");
        int tableDim2Length = scanner.nextInt();
        scanner.nextLine();
        System.out.println();


//  tworzenie tabeli tableStrings (zawierającą wartości String- czyli tekst)
        String[][] tableStrings = new String[tableDim1Length][tableDim2Length];

//  wprowadzanie wartości liczby argumentów
        for (int indexT1 = 0; indexT1 < tableStrings.length; indexT1++) {
            for (int indexT2 = 0; indexT2 < tableStrings[indexT1].length; indexT2++) {
                System.out.print("Podaj " + (indexT2 + 1) + " argument (typu String) z " + (indexT1 + 1) + " kolumny:  ");
                tableStrings[indexT1][indexT2] = scanner.nextLine();
            }
        }

// wyświetlanie wprowadzonej tablicy
        System.out.println("Wyświetlanie zawartości tablicy przechowujacej tekst: ");
        for (int indexT1 = 0; indexT1 < tableStrings.length; indexT1++) {
            for (int indexT2 = 0; indexT2 < tableStrings[indexT1].length; indexT2++) {
                System.out.print(tableStrings[indexT1][indexT2] + "  ");
            }
            System.out.println();
        }

// tworzenie 2giej tablicy tableHowLongString przechowującej wartości długości tekstów
        int[][] tableHowLongString = new int[tableStrings.length][tableDim2Length];
        for (int indexT1 = 0; indexT1 < tableStrings.length; indexT1++) {
            for (int indexT2 = 0; indexT2 < tableStrings[indexT1].length; indexT2++) {
            tableHowLongString[indexT1][indexT2] = tableStrings[indexT1][indexT2].length();
            }
        }

//  wyświetlanie zawartości tablicy przechowującej wartości int
        System.out.println("Wyświetlanie zawartości tablicy przechowujacej liczbę znaków: ");
        for (int indexT1 = 0; indexT1 < tableStrings.length; indexT1++) {
            for (int indexT2 = 0; indexT2 < tableStrings[indexT1].length; indexT2++) {
                System.out.print(tableHowLongString[indexT1][indexT2] + "  ");
            }
            System.out.println();
        }

// wyświetlenie porówania zawartości tablic
        System.out.println("Wyświetlanie porównania zawartości tablic: ");
        for (int indexT1 = 0; indexT1 < tableStrings.length; indexT1++) {
            for (int indexT2 = 0; indexT2 < tableStrings[indexT1].length; indexT2++) {
                System.out.println(tableStrings[indexT1][indexT2] + " - " + tableHowLongString[indexT1][indexT2] + "   ");
            }
        }
    }
}
