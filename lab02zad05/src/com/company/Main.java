package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.x = 1;
        p1.y = 2;

        Punkt p2 = new Punkt();
        p2.x = 3;
        p2.y = 4;

        Linia l1 = new Linia();
        l1.poczatek = p1;
        l1.koniec = p2;

        System.out.println(l1.koniec.x);
        System.out.println(l1.poczatek.y);
    }
}

class Punkt{
    public int x;
    public int y;

}

class Linia{
    public Punkt poczatek;
    public Punkt koniec;
}