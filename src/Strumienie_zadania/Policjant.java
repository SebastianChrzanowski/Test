package Strumienie_zadania;

public class Policjant {

    String imie;
    String nazwisko;
    int wiek;
    char plec;
    int ID;
    Stopien stopien;

    public Policjant(String imie, String nazwisko, int wiek, char plec, int ID, Stopien stopien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.ID = ID;
        this.stopien = stopien;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public char getPlec() {
        return plec;
    }

    public int getID() {
        return ID;
    }

    public Stopien getStopien() {
        return stopien;
    }
}
