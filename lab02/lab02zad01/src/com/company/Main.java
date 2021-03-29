package com.company;

public class Main {

    public static void main(String[] args) {
     Rower rowerPierwszy = new Rower();
     Rower rowerDrugi = new Rower();

     rowerPierwszy.start();
     rowerDrugi.start();

     rowerDrugi.przyspiesz(50);

     rowerPierwszy.wyswietlStan();
     rowerDrugi.wyswietlStan();

     rowerDrugi.stop();

     rowerDrugi.wyswietlStan();

    }
}

class Rower {
    boolean wRuchu;
    int predkosc;


    public void start() {
        wRuchu = true;
        predkosc = 0;
    }

    public void stop() {
        wRuchu = false;
        predkosc = 0;
    }

    public void przyspiesz(int nowaPredkosc) {
        predkosc = nowaPredkosc;
    }

    public void wyswietlStan() {
        System.out.println("Obecny stan");
        System.out.println("Prędkość wynosi " + predkosc);
        System.out.println("Czy rower jest w ruchu?" + (wRuchu ? " Tak" : " Nie"));
    }
}