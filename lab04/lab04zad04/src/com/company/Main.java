package com.company;

public class Main {

    public static void main(String[] args) {

        Punkt2D p1 = new Punkt2D();
        p1.wypisz();

        Punkt2D p2 = new Punkt2D(2,3);
        p2.wypisz();

        Punkt3D p3 = new Punkt3D();
        p3.wypisz();

        Punkt3D p4 = new Punkt3D(5,1,7);
        p4.wypisz();

    }
}

class Punkt2D{

    int x, y;

    public Punkt2D(){

    }

    public Punkt2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void wypisz(){
        System.out.printf(" (%d, %d) %n", x, y); //sprawdzic
    }
}

class Punkt3D extends Punkt2D{

    int z;

    public Punkt3D(){

    }

    public Punkt3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void wypisz() {
        System.out.printf(" (%d, %d, %d) %n", x, y, z);
    }
}