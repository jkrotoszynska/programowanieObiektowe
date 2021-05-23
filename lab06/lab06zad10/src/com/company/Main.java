package com.company;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("rtr6y8i0u0e");
        l.add("r5r0y8i0u0e");
        l.add("r3r6y8i0u00");
        l.add("z1z6y8i1u7d");

        SprawdzanieTekstu st = new SprawdzanieTekstu();
        for(String s : l){
            try{
                System.out.printf("Sprawdzanie %s ", s);
                st.sprawdz(s);
                System.out.println("[OK]");
            }catch(ParseException e){
                System.out.println("[BŁĄD!!!]");

            }
        }
    }

}

class SprawdzanieTekstu{
    public void sprawdz(String s) throws ParseException {
        boolean oczekiwaneLitery = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) && (oczekiwaneLitery)){
                throw new ParseException(s, i);
            }
            if(Character.isLetter(c) && !(oczekiwaneLitery)){
                throw new ParseException(s,i);
            }
            oczekiwaneLitery = !oczekiwaneLitery;
        }
    }
}