package com.company;

public class Main {

    public static void main(String[] args) {

        KontoBankowe rachunek = new KontoBankowe();

        rachunek.pokazSaldo();

        rachunek.kredyt(10000);
        rachunek.pokazSaldo();

        rachunek.debet(5000);
        rachunek.pokazSaldo();
    }
}

class KontoBankowe {
    private int saldo;

    public void pokazSaldo(){
        System.out.println("Twoje obecne saldo to: " + saldo);
    }

    public void kredyt(int ilosc){
        saldo += ilosc;
    }

    public void debet(int ilosc){
        saldo -= ilosc;
    }
}
