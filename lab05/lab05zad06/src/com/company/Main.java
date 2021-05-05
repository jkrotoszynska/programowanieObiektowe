package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladowaKlasa przyk = new PrzykladowaKlasa();
        przyk.przykladowaMetoda();
        przyk.innaMetoda();
    }
}

interface PrzykladowyInterfejs{
    void przykladowaMetoda();
}

interface InnyInterfejs{
    void innaMetoda();
}

class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs{

    public void przykladowaMetoda(){
        System.out.println("Implementacja przykladowejMetody");
    }

    public void innaMetoda(){
        System.out.println("Implementacja innejMetody");
    }
}