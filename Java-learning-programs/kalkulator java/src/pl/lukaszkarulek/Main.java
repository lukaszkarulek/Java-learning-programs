package pl.lukaszkarulek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Witaj w kalkulatorze java. Wybierz działanie jakie chcesz wykonać na liczbach.");
        System.out.println("Wybierz 1, 2, 3, 4, 5, 6 lub 7 aby uzyskać interesujący Cię wynik:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Potęgowanie");
        System.out.println("6. Pierwiastek z liczby (można pominąć wpisywanie drugiej liczby)");
        System.out.println("7. Pokaż wyniki wszystkich powyższych działań");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Proszę podać pierwszą liczbę:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Proszę podać drugą liczbę");
        double secondNumber = scanner.nextDouble();

        double dodawanie = firstNumber + secondNumber;
        double odejmowanie = firstNumber - secondNumber;
        double mnozenie = firstNumber * secondNumber;
        double dzielenie = firstNumber / secondNumber;
        double potega = Math.pow(firstNumber, secondNumber);
        double pierwiastek = Math.sqrt(firstNumber);

        switch (choice) {
            case 1 -> {
                System.out.println("");
                System.out.println("Wynik dodawania to " + dodawanie);
                System.out.println(firstNumber + " + " + secondNumber + " = " + dodawanie);
            }

            case 2 -> {
                System.out.println("");
                System.out.println("Wynik odejmowania to " + odejmowanie);
                System.out.println(firstNumber + " - " + secondNumber + " = " + odejmowanie);
            }

            case 3 -> {
                System.out.println("");
                System.out.println("Wynik mnożenia to " + mnozenie);
                System.out.println(firstNumber + " * " + secondNumber + " = " + mnozenie);
            }

            case 4 -> {
                System.out.println("");
                System.out.println("Wynik dzielenia to " + dzielenie);
                System.out.println(firstNumber + " / " + secondNumber + " = " + dzielenie);
            }

            case 5 -> {
                System.out.println("");
                System.out.println("Wynik potęgowania to " + potega);
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + potega);
            }

            case 6 -> {
                System.out.println("");
                System.out.println("Pierwiastek z " + firstNumber + " to " + pierwiastek);
            }

            case 7 -> {
                System.out.println("");
                System.out.println("Wynik dodawania to " + dodawanie);
                System.out.println(firstNumber + " + " + secondNumber + " = " + dodawanie);
                System.out.println("");
                System.out.println("Wynik odejmowania to " + odejmowanie);
                System.out.println(firstNumber + " - " + secondNumber + " = " + odejmowanie);
                System.out.println("");
                System.out.println("Wynik mnożenia to " + mnozenie);
                System.out.println(firstNumber + " * " + secondNumber + " = " + mnozenie);
                System.out.println("");
                System.out.println("Wynik dzielenia to " + dzielenie);
                System.out.println(firstNumber + " / " + secondNumber + " = " + dzielenie);
                System.out.println("");
                System.out.println("Wynik potęgowania to " + potega);
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + potega);
                System.out.println("");
                System.out.println("Pierwiastek z " + firstNumber + " to " + pierwiastek);
            }

            default -> {
                System.out.println("");
                System.out.println("Wprowadziłeś błędny numer żądania.");
                System.out.println("Wpisz: 1, 2, 3 lub 4.");
            }
        }


    }
}
