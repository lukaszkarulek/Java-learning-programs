package pl.karuleklukasz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość drzewka:");
        int treeLength = scanner.nextInt();

        System.out.println("Podaj górną liczbę gwiazdek:");
        int treeWidth = scanner.nextInt();

        // utworzenie "ślepej" części choinki z jej lewej strony
        for (int i = treeLength; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for ( int k = 2*(treeLength - i) + treeWidth; k > 0; k--) {
                System.out.print("^");
            }
            System.out.println();
        }


    }
}
