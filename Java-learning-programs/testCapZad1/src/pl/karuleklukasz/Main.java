package pl.karuleklukasz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Treść zadania:
Zaimplementuj metodę, która:
1. Jako argument przyjmuje Listę liczb całkowitych.
2. Zwraca sumę najmniejszej i największej z tych liczb.
3. Jeżeli na liście jest tylko jedna liczba, to jest ona jednocześnie najmniejsza i największa.

komentarz własny: wszystko umieszczone w jednej metodzie, jako że polecenie mówi o stworzeniu JEDNEJ metody.
Bez tego ograniczenia uważam, iż lepiej byłoby napisać oddzielne metody do każdej z w.w. funkcji, zgodnie z zasadą
pojedyńczej odpowiedzialności, w celu łatwiejszej możliwości modyfikacji kodu w przyszłości. */

public class Main {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        //argument zliczający sumę wprowadzanych wartości

        double sumOfAllArguments = 0;

        // deklarownie długości listy

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Podaj ilość argumentów, które chcesz wprowadzić do listy: ");
        int numberOfArguments = scanner.nextInt();
        System.out.println();

        // uzupełnianie listy

        for (int i = 0; i < numberOfArguments; i++) {
            System.out.println("Podaj argument (liczbę całkowitą): ("+ (i+1) + "z" + numberOfArguments + ")");
            int argument = scanner.nextInt();
            list.add(argument);
            sumOfAllArguments += argument;
        }

        // wyświetlenie listy

        System.out.println("Wyświetlenie zawartości wprowadzonej listy:");
        for (int i = 0; i < numberOfArguments; i++) {
            System.out.print(list.get(i) + "; ");
        }
        System.out.println();
        System.out.println();

        // sortowanie listy

        Collections.sort(list);

        System.out.println("Wyświetlanie listy po posortowaniu według wartości (rosnąco): ");
        for (int i = 0; i < numberOfArguments; i++) {
            System.out.print(list.get(i) + "; ");
        }
        System.out.println();
        System.out.println();

        // znajdywanie wartości minimalnej i maksymalnej

        int minValue = list.get(0);
        int maxValue = list.get(numberOfArguments - 1);
        int sumMinMax = maxValue + minValue;
        int roznicaValue = maxValue - minValue;
        double avergeValue = sumOfAllArguments / numberOfArguments;

        System.out.println("Suma wszystkich wprowadzonych argumentów: " + sumOfAllArguments);
        System.out.println("Wartość minimalna: " + minValue);
        System.out.println("Wartość maksymalna: " + maxValue);
        System.out.println("Suma wartości maksymalnej i minimalnej: " + sumMinMax);
        System.out.println("Różnica watości maksymalnej i minimalnej: " + roznicaValue);
        System.out.println("Średnia wartość wprowadzonych argumentów: " + avergeValue);

        if (numberOfArguments%2==1) {
            int mediana = list.get((numberOfArguments-1)/2);
            System.out.println("Mediana wynosi: " + mediana);
        } else {
            int mediana1 = list.get((numberOfArguments) / 2);
            int mediana2 = list.get((numberOfArguments - 1) / 2);
            if (mediana1 == mediana2) {
                System.out.println("Mediana wynosi: " + mediana1);
            } else {
                System.out.println("Ponieważ podana liczba argumentów była parzysta, medianę stanowią dwie liczby: " + mediana1 + " oraz " + mediana2);
            }
        }

    }

}
