package pl.karuleklukasz;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random1 = new Random();
        int randNumber = random1.nextInt(1000) + 1;
        int i = 15;

        boolean wasNumberGuessed = false;

        System.out.println("Podaj swoje imię:");

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Witaj " + name + "! Twoim zadaniem będzie odgadnięcie losowo wygenerowanej liczby z przedziału od 1 do 1000. Masz 15 prób. Powodzenia!");

        while (!wasNumberGuessed && i > 0) {
            System.out.println("Podaj szukaną liczbę:");
            Scanner scanner2 = new Scanner(System.in);
            int getNumber = scanner2.nextInt();
            i--;
            if (i == 0) {
                System.out.println("Podana liczba (" + getNumber + ") NIE JEST SZUKANĄ LICZBĄ. Wyczerpałeś limit prób! Spróbuj ponownie");
            } else if (randNumber > getNumber) {
                System.out.println("Podana liczba (" + getNumber + ") JEST ZA MAŁA! Pozostało prób: " + i);
            } else if (randNumber < getNumber) {
                System.out.println("Podana liczba (" + getNumber + ") JEST ZA DUŻA! Pozostało prób: " + i);
            } else if (randNumber == getNumber) {
                int w = 15 - i;
                System.out.println("Gratulacje " + name + "! Szukana liczba to " + getNumber + "!");
                System.out.println("Liczba wykorzystanych prób: " + w);
                System.out.println("Liczba pozostałych prób: " + i);
                wasNumberGuessed = true;
            } else {
                System.out.println("Wpisz liczbę z przedziału od 1 do 1000");
            }

        }

    }
}
