package pl.lukaszkarulek;

public class Samochod {
    private int nrVin;
    private String marka;
    private String model;
    private String nrRejestracyjny;
    private int rocznik;
    private String typNapedu;
    private boolean czyWypozyczone;

    public Samochod(int nrVin, String marka, String model, String nrRejestracyjny, int rocznik, String typNapedu, boolean czyWypozyczone) {
        this.nrVin = nrVin;
        this.marka = marka;
        this.model = model;
        this.nrRejestracyjny = nrRejestracyjny;
        this.rocznik = rocznik;
        this.typNapedu = typNapedu;
        this.czyWypozyczone = czyWypozyczone;
    }

    public int getNrVin() {
        return nrVin;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public int getRocznik() {
        return rocznik;
    }

    public String getTypNapedu() {
        return typNapedu;
    }

    public boolean isCzyWypozyczone() {
        return czyWypozyczone;
    }

    public void setNrVin(int nrVin) {
        this.nrVin = nrVin;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void setTypNapedu(String typNapedu) {
        this.typNapedu = typNapedu;
    }

    public void setCzyWypozyczone(boolean czyWypozyczone) {
        this.czyWypozyczone = czyWypozyczone;
    }

    public void displaySamochodInformation() {
        System.out.println("numer VIN: " + nrVin);
        System.out.println("marka: " + marka);
        System.out.println("model: " + model);
        System.out.println("numer rejestracyjny: " + nrRejestracyjny);
        System.out.println("rok produkcji: " + rocznik);
        System.out.println("typ napędu: " + typNapedu);
        String czyWypozyczoneString = czyWypozyczone ? "tak" : "nie";
        System.out.println("aktualnie wypożyczone: " + czyWypozyczoneString);
        System.out.println("");
    }
}
