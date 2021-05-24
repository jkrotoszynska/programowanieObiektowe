package com.company;

import java.io.*;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	CzytnikStron czytnik = new CzytnikStron();
	try{
        System.out.println("Pobieranie strony...");
        czytnik.odczytajStrone("http://www.google.pl");

        System.out.println("Zapisywanie strony...");
        czytnik.zapiszStrone(Paths.get("c:\\temp", "www.google.pl.html").toString());

    }catch (IOException e){
	    e.printStackTrace();
        System.out.println("[BŁĄD]");
    }
    }
}

class CzytnikStron{
    List<String> ostatniaStrona;
    String ostatniAdres = null;

    public CzytnikStron(){
        ostatniaStrona = new ArrayList<>();
    }

    public void odczytajStrone(String adres) throws IOException{
        URL url = new URL(adres);
        BufferedReader wejscie = new BufferedReader(new InputStreamReader(url.openStream()));

        ostatniAdres = adres;
        ostatniaStrona.clear();

        String linia;
        while((linia = wejscie.readLine()) != null){
            ostatniaStrona.add(linia);
        }
        wejscie.close();
    }

    public void zapiszStrone(String nazwaPliku) throws IOException{
        if(ostatniaStrona.isEmpty())
            return;
        PrintWriter out = new PrintWriter(new FileWriter(nazwaPliku));

        for (String l : ostatniaStrona){
            out.println(l);
        }
        out.close();
    }
}