package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 10, 20};
        int ele = 30;

        Wyszukiwanie algo = new WyszukiwanieRownych();

        int index = algo.szukaj(a, ele);

        if (index == -1) {
            System.out.println("Nie znaleziono");
        }else{
            System.out.println("Znaleziono " + ele +  " na indeksie: " + index);
        }


    }
}

abstract class Wyszukiwanie{

    public abstract boolean porownaj(int a, int b);

    public final int szukaj(int a[], int ele){
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }

}

class WyszukiwanieRownych extends Wyszukiwanie{

    @Override
    public boolean porownaj(int a, int b){
        return a == b;
    }

}

class WyszukiwanieNierownych extends Wyszukiwanie{

    @Override
    public boolean porownaj(int a, int b){
        return a != b;
    }
}

