package com.company;

public class Main {

    public static void main(String[] args) {
        Podstawowa b = new Pochodna1();
        b.f();
        b.g();
        b.h();

        Pochodna d = new Pochodna1();
        d.f();
        d.g();
        d.h();

        Pochodna1 d1 = new Pochodna1();
        d1.f();
        d1.g();
        d1.h();
    }
}

abstract class Podstawowa {
    public abstract void f();
    public abstract void g();
    public void h(){
        System.out.println("h() w Podstawowa");
    }
}

abstract class Pochodna extends Podstawowa{
    @Override
    public void f(){
        System.out.println("f() w Pochodna");
    }
}

class Pochodna1 extends Pochodna{
    @Override
    public void g(){
        System.out.println("g() w Pochodna1");
    }
}