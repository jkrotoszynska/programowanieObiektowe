package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader plik = new FileReader(new File("c:\\1.TXT"));
            int bufor;
            // -1 oznacza brak znaków dalej
            while((bufor = plik.read()) != -1){
                System.out.print((char) bufor);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Zepsulo sie!");
        }


    }
}
