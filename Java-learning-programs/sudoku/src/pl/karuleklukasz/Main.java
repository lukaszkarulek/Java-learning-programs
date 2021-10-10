package pl.karuleklukasz;

// program obliczający średnią ocen z przedmiotów szkolnych

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę przedmiotów: ");
        int numberOfClasses = scanner.nextInt();
        System.out.println("Podaj liczbę ocen przypadających na przedmiot: ");
        int numberOfNotes = scanner.nextInt();


        AvarageClass avarageClass = new AvarageClass(numberOfClasses, numberOfNotes);
        avarageClass.getNotesFromUser();
        avarageClass.printAverage();




//        // OPERACJE NA STRINGACH (moje notatki pomocnicze):
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj tekst: ");
//        String tekst = scanner.nextLine();
//        System.out.println("Długość- tekst.lenght(); -     " + tekst.length());
//        System.out.println("Wielkie litery - .toUpperCase() -     " + tekst.toUpperCase());
//        System.out.println("Małe litery - .toLowerCase() -     " + tekst.toLowerCase());
//        System.out.println("Wyszukanie pierwszego wystąpienia frazy - .indexOf('a')     " + tekst.indexOf("a"));
//        System.out.println("Wyszukanie ostatniego wystąpienia frazy - lastIndexOf('a')    " + tekst.lastIndexOf("a"));
//        System.out.println("Zamiana każdego 'a' na 'x' - .replace('a','x')    " + tekst.replace("a","x"));
//        System.out.println(tekst);

    }
}
