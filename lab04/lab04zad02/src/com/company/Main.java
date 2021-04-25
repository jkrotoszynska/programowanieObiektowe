package com.company;

public class Main {

    public static void main(String[] args) {

        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        System.out.println(kalkulatorPodstawowy.dodaj(2,5));
        System.out.println(kalkulatorPodstawowy.odejmij(8,5));

        System.out.println();

        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.dodaj(5,1));
        System.out.println(kalkulatorStatystyczny.odejmij(6,3));
        System.out.println(kalkulatorStatystyczny.sinus(30));
    }
}

class Kalkulator{

    public int dodaj(int a, int b){
        return a + b;
    }

    public int odejmij(int a, int b){
        return a - b;
    }
}

class KalkulatorStatystyczny extends Kalkulator{

    public double sinus(int st){
        double rad = st * 3.14 /180;
        return Math.sin(rad);
    }
}