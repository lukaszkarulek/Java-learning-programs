package pl.karuleklukasz;

public class Main {

    public static void main(String[] args) {

       int[] oldTable = {20, 30, 40};
       int[] newTable = new int[3];
       int lastTableIndex = oldTable.length -1;

       for (int i=0; i < oldTable.length; i++) {
           if (i == 0) {
               newTable[lastTableIndex] = oldTable[i];
           } else {
               newTable[i-1] = oldTable[i];
           }
       }

        System.out.println();
       System.out.println("Zadanie: przesuń wszystkie liczby w tablicy o jedno miejsce w lewo.");
        System.out.println();
        System.out.println();
        System.out.println("Rozwiązanie nr 1: poprzez utworzenie nowej tabeli");
        System.out.println();
        System.out.println("Stara tablica: ");
       for (int oldTableElement : oldTable) {
           System.out.print(oldTableElement + " ");
       }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Nowa tablica:");
       for (int newTableElement : newTable) {
           System.out.print(newTableElement + " ");
       }

        System.out.println();
        System.out.println();
        System.out.println("Rozwiązanie nr 2: poprzez następne przeniesienie danych spowrotem do starej tabeli");
        System.out.println();
        System.out.println("Stara tablica po implementacji:");
       for (int i=0; i < oldTable.length; i++) {
           oldTable[i]=newTable[i];
       }

        for (int newTableElement : newTable) {
            System.out.print(newTableElement + " ");
        }
        System.out.println();
    }
}
