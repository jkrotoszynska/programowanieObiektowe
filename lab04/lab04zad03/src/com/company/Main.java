package com.company;

public class Main {

    public static void main(String[] args) {

        Podstawowa podstawowa = new Podstawowa();
        podstawowa.wypisz();

        System.out.println();

        Pochodna pochodna = new Pochodna();
        pochodna.wypisz();

    }
}
class Podstawowa{

    public void wypisz(){
        System.out.println("Hello");
    }
}

class Pochodna extends Podstawowa{

    @Override
    public void wypisz(){
        super.wypisz();
        System.out.println("World");
    }
}