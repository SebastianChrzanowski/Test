package Strumienie_zadania;

public class Policjant {

    String name_policjantw;
    String nazwisko;
    int wiek;
    char plec;
    int ID;
    Stopien stopien;

    public Policjant(String name_policjantw, String nazwisko, int wiek, char plec, int ID, Stopien stopien) {
        this.name_policjantw = name_policjantw;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
        this.ID = ID;
        this.stopien = stopien;
    }

    public String getName_policjantw() {
        return name_policjantw;
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
