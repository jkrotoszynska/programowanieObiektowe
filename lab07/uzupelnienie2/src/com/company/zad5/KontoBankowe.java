package com.company.zad5;

public class KontoBankowe {
    private int saldo;

    public KontoBankowe(int saldo) {
        this.saldo = saldo;
    }

    public void wyplac(int kwota){
        saldo = saldo - kwota;
    }

    public int getSaldo() {
        return saldo;
    }
}
