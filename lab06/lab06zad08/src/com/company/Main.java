package com.company;

public class Main {

    public static void main(String[] args) {
	DwaGeneryczne<Integer, String> dg = new DwaGeneryczne<Integer, String>(27, "Przyklad");
	dg.pokazTyp();
        System.out.println(dg.zwrocObiektPierwszy());
        System.out.println(dg.zwrocObiektDrugi());
    }
}

class DwaGeneryczne<T, V> {
    T obiektPierwszy;
    V obiektDrugi;

    public DwaGeneryczne(T obiektPierwszy, V obiektDrugi) {
        this.obiektPierwszy = obiektPierwszy;
        this.obiektDrugi = obiektDrugi;
    }

    T zwrocObiektPierwszy() {
        return obiektPierwszy;
    }

    V zwrocObiektDrugi() {
        return obiektDrugi;
    }

    void pokazTyp(){
        System.out.println("Typ T to " + obiektPierwszy.getClass().getName());
        System.out.println("Typ V to " + obiektDrugi.getClass().getName());
    }
}