package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        KoszykProduktow koszyk = new KoszykProduktow();

        koszyk.dodajProduktDoKoszyka("masło");
        koszyk.dodajProduktDoKoszyka("mleko");
        koszyk.dodajProduktDoKoszyka("chleb");

        koszyk.pokazZamowienie();

    }
}

class KoszykProduktow{
    private LinkedList produkty = new LinkedList();

    public void pokazZamowienie(){
        System.out.println("Twój koszyk:");
        System.out.println(produkty);
    }

    public void dodajProduktDoKoszyka(String produkt){
        produkty.add(produkt);
    }
}