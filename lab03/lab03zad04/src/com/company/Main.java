package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie PrzykladPrzeciazanie = new PrzykladPrzeciazanie();
        PrzykladPrzeciazanie.wypisz(10);
        PrzykladPrzeciazanie.wypisz(19.5);
        PrzykladPrzeciazanie.wypisz("Przeciążenie argument tekst");
    }
}

class PrzykladPrzeciazanie{

    public void wypisz(int arg){
        System.out.println("Int: " + arg);
    }

    public void wypisz(double arg){
        System.out.println("Double: " + arg);
    }

    public void wypisz(String arg){
        System.out.println("Strgin: " + arg);
    }

}