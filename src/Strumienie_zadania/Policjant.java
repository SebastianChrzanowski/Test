package Strumienie_zadania;

public class Policjant {

    String imieKONFLIKT;
    String nazwisko;
    int wiek;
    char plec;
    int ID;
    Stopien stopien;

    public Policjant(String imieKONFLIKT, String nazwisko, int wiek, char plec, int ID, Stopien stopien) {
        this.imieKONFLIKT = imieKONFLIKT;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.ID = ID;
        this.stopien = stopien;
    }

    public String getImieKONFLIKT() {
        return imieKONFLIKT;
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
