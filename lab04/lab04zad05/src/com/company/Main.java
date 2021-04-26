package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nazwa silnika to: ");

        Samochod samochod = new Samochod();
        int seria = samochod.getSeriaSilnika();
        System.out.println(seria);
    }
}

class Silnik{
    private int seria;

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }
}

// Napisz klasę Samochod. Klasa ma posiadać pole silnik (wykorzystaj klasę silnik) z publicznymi akcesorem serii silnika.
// Silnik ma być przydzielany samochodowi przy tworzeniu obiektu (tzn. w konstruktorze),
// po przydzieleniu silnika ma on otrzymać serię.

class Samochod{
    private Silnik silnik;

    public Samochod(){
        this.silnik = new Silnik();
        silnik.setSeria(1234);
    }

    public int getSeriaSilnika() {
        return silnik.getSeria();
    }
}