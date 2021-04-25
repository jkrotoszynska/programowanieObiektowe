package com.company;

public class Main {

    public static void main(String[] args) {

        Podstawowa podstawowa = new Podstawowa();
        podstawowa.wypiszTekstF();
        podstawowa.wypiszTekstG();

        Pochodna pochodna1 = new Pochodna();
        pochodna1.wypiszTekstF();
        pochodna1.wypiszTekstG();
        pochodna1.wypiszTekstH();

        Podstawowa pochodna2 = new Pochodna();
        pochodna2.wypiszTekstF();
        pochodna2.wypiszTekstG();
    }
}

//klasa
class Podstawowa{

    //metoda
    public void wypiszTekstF(){
        System.out.println("f() w Podstawowa");
    }

    public void wypiszTekstG(){
        System.out.println("g() w Podstawowa");
    }
}

class Pochodna extends Podstawowa{

    public void wypiszTekstG(){
        System.out.println("g() w Pochodna");
    }

    public void wypiszTekstH(){
        System.out.println("h() w Pochodna");
    }
}