package com.company;

public class Main {

    static void rysujUtil(int x1, int y1, int x2, int y2, Grafika g){
        g.setPoczatek(x1, y1);
        g.setKoniec(x2, y2);
        g.rysuj();
    }

    public static void main(String[] args) {
        rysujUtil(30,30,40,40, new Linia());
        rysujUtil(50,50,60,60, new Prostokat());
    }
}
abstract class Grafika{

    protected int x1, y1;
    protected int x2, y2;

    public void setPoczatek(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setKoniec(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
    }

    public abstract void rysuj();

}

class Linia extends Grafika{

    @Override
    public void rysuj(){
        System.out.printf("Rysuj Linie od (%d, %d) do (%d, %d) %n", x1, y1, x2, y2 );
    }

}

class Prostokat extends Grafika{

    @Override
    public void rysuj(){
        System.out.printf("Rysuj Prostokat od (%d, %d) do (%d, %d) %n", x1, y1, x2, y2 );
    }

}