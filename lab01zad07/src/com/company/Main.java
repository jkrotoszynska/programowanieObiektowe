package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// zadanie 1 - max i min w tablicy
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 3 liczby: ");
        int liczba1 = scan.nextInt();
        int liczba2 = scan.nextInt();
        int liczba3 = scan.nextInt();
        int[] liczby = {liczba1, liczba2, liczba3};

        int max = liczba1;
        int min = liczba1;

        for(int i = 0; i < liczby.length; i++){
            if(max < liczby[i]){
                max = liczby[i];
            }
            if(min > liczby[i]){
                min = liczby[i];
            }
        }
        System.out.println("Największa z trzech: " + max);
        System.out.println("Najmniejsza z trzech: " + min);

        System.out.println("-----------------------------------------");
        System.out.println("Podaj liczbe: ");
        int liczba = scan.nextInt();
        int wynik = 1;
        for (int j = 1; j <= liczba; j++){
            wynik *= j;
        }
        System.out.println("Silnia dla podanej liczby wynosi: " + wynik);

        System.out.println("-----------------------------------------");
        System.out.println("Podaj liczbe: ");
        int czyP = scan.nextInt();

        if(czyP % 2 == 0){
            System.out.println("Podana liczba jest parzysta! :) ");
        }else{
            System.out.println("Podana liczba nie jest parzysta! :(");
        }
    }

}
