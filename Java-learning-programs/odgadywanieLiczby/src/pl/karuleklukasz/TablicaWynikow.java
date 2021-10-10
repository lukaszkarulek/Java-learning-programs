package pl.karuleklukasz;

// niestety na tym etapie nie wiem jeszcze jak załadować wyniki do zewnętrzego pliku, a następnie je stamtąd wczytywać.

public class TablicaWynikow {


    private String nazwa;
    private int wynik;

    public String getNazwa() {
        return nazwa;
    }

    public int getWynik() {
        return wynik;
    }

    public TablicaWynikow(String nazwa, int wynik) {
        this.nazwa = nazwa;
        this.wynik = wynik;
    }
}
