package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // przybliżyć sobie BufferedReader
        BufferedReader wejscie = null;
        String tekst;
        int chars = 0;
        int linie = 0;

        try {
            wejscie = new BufferedReader(new FileReader(new File("c:\\1.TXT")));
            while((tekst = wejscie.readLine()) != null){
                chars += tekst.length();
                linie++;
            }
            System.out.println("Linie: " + linie);
            System.out.println("Znaki: " + chars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
