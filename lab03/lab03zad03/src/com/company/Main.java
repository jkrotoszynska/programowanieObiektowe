package com.company;

public class Main {

    public static void main(String[] args) {
        Przyklad pierwszy = new Przyklad();
        Przyklad drugi = new Przyklad(10);
        Przyklad trzeci = new Przyklad(50,4.5);

        pierwszy.wypisz();
        drugi.wypisz();
        trzeci.wypisz();

    }
}

class Przyklad{
    double polePierwsze;
    double poleDrugie;

    public void wypisz(){
        System.out.println(polePierwsze + " +i " + poleDrugie);
    }

    Przyklad(){
        polePierwsze = 0;
        poleDrugie = 0;
    }

    Przyklad(double a){
        polePierwsze = a;
    }

    Przyklad(double x, double y){
        polePierwsze = x;
        poleDrugie = y;
    }
}