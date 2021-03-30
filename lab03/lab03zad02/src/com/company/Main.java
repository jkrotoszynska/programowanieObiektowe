package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Punkt pierwszy = new Punkt(10, 20);
        System.out.println(pierwszy);

        Linia pierwsza = new Linia(0,0,3,4);
        System.out.println(pierwsza);

        Punkt drugi = new Punkt(4, 20);
        Punkt trzeci = new Punkt(10, 20);
        Linia druga = new Linia(drugi, trzeci);
        System.out.println(druga);
    }
}

class Punkt{
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter i setter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    // --------------------

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}

class Linia{
    private Punkt poczatek;
    private Punkt koniec;

    public Linia(Punkt poczatek, Punkt koniec){
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public Linia(int poczatekX, int koniecX, int poczatekY,int koniecY){
        this.poczatek = new Punkt(poczatekX, poczatekY);
        this.koniec = new Punkt(koniecX, koniecY);
    }


    public Punkt getPoczatek() {
        return poczatek;
    }

    public void setPoczatek(Punkt poczatek) {
        this.poczatek = poczatek;
    }

    public Punkt getKoniec() {
        return koniec;
    }

    public void setKoniec(Punkt koniec) {
        this.koniec = koniec;
    }

    @Override
    public String toString() {
        return "Linia {" +
                "poczatek = " + poczatek.toString() +
                ", koniec = " + koniec.toString() +
                '}';
    }
}