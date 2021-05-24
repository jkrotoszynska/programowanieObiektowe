package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String linia = "Zamówiono 3000 produktów posiadających kod ABCD.";
        String wzor = "(\\d+) produktów (.*) kod (\\S+).";

        Pattern p = Pattern.compile(wzor);
        Matcher m = p.matcher(linia);

        if(m.find()) {
            System.out.println("Ilość: " + m.group(1));
            System.out.println("Kod: " + m.group(3));
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.printf("grupa=%d, wartosc=%s\n", i, m.group(i));
            }

        }else{
            System.out.println("[NIE ZNALEZIONO]");
        }

    }
}
