package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        liczby.add(10);
        liczby.add(23);
        liczby.add(15);
        liczby.add(6);
        liczby.add(1);

        liczby.forEach((n) -> {
            System.out.println(n);
        });
    }
}
