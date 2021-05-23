package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Publikacja ksiazka = new Ksiazka("Programowanie w systemie linux", new GregorianCalendar(1990, Calendar.APRIL, 24), "978-3-16-148410-0");
	Publikacja czasopismo = new Czasopismo("Teoria programowania komputerów", new GregorianCalendar(1995, Calendar.MAY, 13), 74);

	czasopismo.dodajCytowanie(ksiazka);

	System.out.println(czasopismo);

	for(Publikacja p: czasopismo.getCytowania())
        System.out.println(p);
    }
}

abstract class Publikacja {
    String tytul;
    GregorianCalendar dataPublikacji;
    List<Publikacja> cytowania;

    public Publikacja(String tytul, GregorianCalendar dataPublikacji) {
        this.tytul = tytul;
        this.dataPublikacji = dataPublikacji;
        cytowania = new ArrayList<>();
    }

    public void dodajCytowanie(Publikacja p){
        cytowania.add(p);
    }

    public List<Publikacja> getCytowania(){
        return cytowania;
    }

    @Override
    public String toString() {
        return "Publikacja{" +
                "tytul='" + tytul + '\'' +
                '}';
    }
}

class Ksiazka extends Publikacja{
    String ISBN;

    public Ksiazka(String tytul, GregorianCalendar dataPublikacji, String ISBN) {
        super(tytul, dataPublikacji);
        this.ISBN = ISBN;
    }
}

class Czasopismo extends Publikacja{
    int wydanie;

    public Czasopismo(String tytul, GregorianCalendar dataPublikacji, int wydanie) {
        super(tytul, dataPublikacji);
        this.wydanie = wydanie;
    }
}