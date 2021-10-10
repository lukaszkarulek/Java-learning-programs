package pl.lukaszkarulek;

import java.util.*;

public class WypozyczalniaSamochodow {
    private List<Samochod> auta = new ArrayList<>();
    private Map<String, Samochod> nrRejAutaHash = new HashMap<>();
    private Map<Integer, Samochod> nrVinAutaHash = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void addSamochod() {
        System.out.println("Podaj numer VIN:");
        int nrVin = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj markę:");
        String marka = scanner.nextLine();

        System.out.println("Podaj model:");
        String model = scanner.nextLine();

        System.out.println("Podaj numer rejestracyjny:");
        String nrRejestracyjny = scanner.nextLine();

        System.out.println("Podaj rok produkcji:");
        int rocznik = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj typ napędu (silnik benzynowy/diesel/elektryczny)");
        String typNapedu = scanner.nextLine();

        System.out.println("Czy aktualnie wypożyczone (T/N)");
        String czyWypoczyczoneString = scanner.nextLine();

        boolean czyWypozyczone;

        if (czyWypoczyczoneString.equals("T") || czyWypoczyczoneString.equals("t")) {
            czyWypozyczone = true;
        } else {
            czyWypozyczone = false;
        }

        Samochod samochod = new Samochod(nrVin, marka, model, nrRejestracyjny, rocznik, typNapedu, czyWypozyczone);

        nrVinAutaHash.put(nrVin, samochod);
        nrRejAutaHash.put(nrRejestracyjny, samochod);
        auta.add(samochod);
    }

    public void displaySamochodPoNrVin() {
        System.out.println("Podaj numer VIN:");
        int nrVin = Integer.valueOf(scanner.nextLine());
        Samochod samochod = nrVinAutaHash.get(nrVin);


        samochod.displaySamochodInformation();
    }

    public void displaySamochodPoNrRejestracyjnym() {
        System.out.println("Podaj numer rejestracyjny:");
        String nrRejestracyjny = scanner.nextLine();
        Samochod samochod = nrRejAutaHash.get(nrRejestracyjny);

        samochod.displaySamochodInformation();
    }

    public void displayAuta() {
        for (Samochod samochod : auta) {
            samochod.displaySamochodInformation();
        }
    }
}
