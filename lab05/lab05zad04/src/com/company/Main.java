package com.company;

public class Main {

    public static void main(String[] args) {
	Ksztalt kwadrat1 = new Kwadrat(5);
	System.out.println("Kwadrat:");
	System.out.println(kwadrat1.obliczObwod());
	System.out.println(kwadrat1.obliczPowierzchnie());
	Ksztalt kolo1 = new Kolo(5);
	System.out.println("Kolo: ");
	System.out.println(kolo1.obliczObwod());
	System.out.println(kolo1.obliczPowierzchnie());

    }
}
interface Ksztalt{
    double obliczPowierzchnie();
    double obliczObwod();
}

class Kwadrat implements Ksztalt{
    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPowierzchnie(){
        return dlugoscBoku * dlugoscBoku;
    }

    public double obliczObwod(){
        return dlugoscBoku * 4;
    }
}

class Kolo implements Ksztalt{
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPowierzchnie(){
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod(){
        return 2 * Math.PI * promien;
    }
}