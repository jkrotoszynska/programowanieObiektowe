package com.company;

public class Main {

    public static void main(String[] args) {
        GenerycznaKlasa<Integer> iOb = new GenerycznaKlasa<Integer>(79);
        iOb.pokazTyp();
        System.out.println(iOb.zworcObiekt());

        GenerycznaKlasa<String> strOb = new GenerycznaKlasa<String>("To jest przyklad");
        strOb.pokazTyp();
        System.out.println(strOb.zworcObiekt());
    }
}

class GenerycznaKlasa<T>{
    T obiekt;

    public GenerycznaKlasa(T obiekt) {
        this.obiekt = obiekt;
    }

    T zworcObiekt(){
        return obiekt;
    }

    void pokazTyp(){
        System.out.println("Typ T to: "+ obiekt.getClass().getName());
    }
}