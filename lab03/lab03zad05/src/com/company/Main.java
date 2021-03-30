package com.company;

public class Main {

    public static void main(String[] args) {
        Operacje pierwsza = new Operacje(8,8);
        System.out.println(pierwsza.wykonajOperacjeMatematycznaDodawanie());
        System.out.println(pierwsza.wykonajOperacjeMatematycznaDodawanie(2));

        Operacje druga = new Operacje(3,-5);
        System.out.println(druga.wykonajOperacjeMatematycznaDodawanie(6));
        System.out.println(druga.wykonajOperacjeMatematycznaMnozenie(2,1));
    }
}

class Operacje{
    int a;
    int b;

    public Operacje(int a){
        this.a = a;
    }

    public Operacje(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(){
        return a + b;
    }
    public int wykonajOperacjeMatematycznaDodawanie(int a){
        return a + b;
    }
    public int wykonajOperacjeMatematycznaMnozenie(int a, int b){
        return a + b;
    }

}