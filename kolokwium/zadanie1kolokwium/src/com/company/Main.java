package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ksztalt> ksztalty = new ArrayList<>();
        ksztalty.add(new Kwadrat(5));
        ksztalty.add(new Kolo(5));

        for(Ksztalt k : ksztalty){
            System.out.println("Powierzchnia kształtu to: " + k.obliczPowierzchnie());
        }

    }
}

abstract class Ksztalt{

    abstract double obliczPowierzchnie();
    abstract double obliczObwod();
}

class Kwadrat extends Ksztalt{
    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPowierzchnie(){
        return dlugoscBoku*dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku*4;
    }
}

class Kolo extends Ksztalt{
    double dlugoscR;

    public Kolo(double dlugoscR) {
        this.dlugoscR = dlugoscR;
    }

    @Override
    public double obliczPowierzchnie(){
        return Math.PI * dlugoscR * dlugoscR;
    }

    @Override
    public double obliczObwod(){
        return 2 * Math.PI * dlugoscR;
    }
}