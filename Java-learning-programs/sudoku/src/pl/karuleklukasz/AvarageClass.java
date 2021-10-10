package pl.karuleklukasz;

import java.util.Scanner;

// program obliczający średnią ocen z przedmiotów szkolnych

public class AvarageClass {

    private int[][] table;

    public AvarageClass(int numberOfClasses, int numberOfNotes) {
        table = new int [numberOfClasses][numberOfNotes];
    }
    

    public void getNotesFromUser() {
        Scanner scanner = new Scanner(System.in);

        for (int classIndex = 0; classIndex < table.length; classIndex++) {
            for (int noteIndex = 0; noteIndex < table[classIndex].length; noteIndex++) {
                System.out.println("Podaj ocenę numer " + (noteIndex + 1) + " dla przedmiotu numer " + (classIndex + 1) + ": ");
                table[classIndex][noteIndex] = scanner.nextInt();
            }
        }
    }

    public void printAverage() {
        double totalAverage = 0;
        for (int classIndex = 0; classIndex < table.length; classIndex++) {
            double classAverage = 0;
            for ( int note: table[classIndex]) {
                classAverage += note;
            }
            classAverage /= table[classIndex].length;
            System.out.print("Średnia dla przedmiotu " + (classIndex + 1) + " wynosi: " + classAverage);
            totalAverage = totalAverage + classAverage;
            if (classAverage == 1) {
                System.out.print(" - przedmiot niezaliczony!");
                System.out.println();
            } else {
                System.out.println();
                continue;
            }
        }
        totalAverage /= table.length;
        System.out.println("Średnica dla wszystkich przedmiotów wynosi: " + totalAverage);
    }
}
