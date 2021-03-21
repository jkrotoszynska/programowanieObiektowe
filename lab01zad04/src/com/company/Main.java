package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        int wiersze = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn: ");
        int kolumny = scanner.nextInt();

        for(int i = 1; i <= wiersze ; i++){
            for(int j = 1; j <= kolumny; j++){
                System.out.print(i*j + "   ");
            }
            System.out.println();
        }
    }
}
