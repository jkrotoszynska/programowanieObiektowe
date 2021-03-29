package com.company;

public class Main {

    public static void main(String[] args) {
        Przyklad pierwszy = new Przyklad();
        Przyklad drugi = new Przyklad(19);

        pierwszy.wypisz();
        drugi.wypisz();
    }
}

class Przyklad{
    int wlasciwosc ;

    public void wypisz(){
        System.out.println(wlasciwosc);
    }

    Przyklad(){
        wlasciwosc = 10;
    }
    Przyklad(int a){
        wlasciwosc = a;
    }
}
