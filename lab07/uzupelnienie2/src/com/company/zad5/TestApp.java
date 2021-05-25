package com.company.zad5;

public class TestApp {
    public static void main(String[] args){
        KontoBankowe konto = new KontoBankowe(150);
        Thread t1 = new Thread(new Osoba(konto), "T1");
        Thread t2 = new Thread(new Osoba(konto), "T2");

        t1.start();
        t2.start();
    }
}
