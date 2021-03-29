package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Pomoce.pokazGodzine();
        System.out.println(Pomoce.dodajDwieLiczby(2, 5));
    }
}

class Pomoce{
    public static void pokazGodzine(){
        System.out.println(LocalDate.now());
    }

    public static int dodajDwieLiczby(int a, int b){
        return a + b;
    }
}