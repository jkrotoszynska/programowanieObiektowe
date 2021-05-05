package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 10, 20};
        int ele = 30;

        Wyszukiwanie algo = new Wyszukiwanie();
        int index = algo.szukaj(a, ele, new SprawdzanieRownych());

        if(index == -1){
            System.out.println("Nie znaleziono");
        }else{
            System.out.println("Znaleziono " + ele + " na indeksie o numerze: " + index);
        }
    }
}

interface Sprawdzenie{
    boolean porownaj(int a, int b);
}

class Wyszukiwanie{
    // przeanalizować public final int
    public final int szukaj(int a[], int ele, Sprawdzenie sprawdzenie){
        for(int i=0; i < a.length; i++){
            if ( sprawdzenie.porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class SprawdzanieRownych implements Sprawdzenie{
    public boolean porownaj(int a, int b){
        return a == b;
    }
}