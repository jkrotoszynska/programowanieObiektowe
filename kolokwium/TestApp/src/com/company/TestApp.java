package com.company;

public class TestApp {

    public static void main(String[] args) {
        MenuGlowne MG = new MenuGlowne();

        MG.MenuPomocPole.InformacjeOProgramie();
        MG.MenuWidokPole.MenuPowiekszeniePole.normalny();
        MG.MenuWidokPole.pokazMapeBitowa();
        MG.MenuEdycjaPole.ponow();
        MG.MenuPlikPole.zamknij();

    }
}

class MenuGlowne{
    MenuPomoc MenuPomocPole = new MenuPomoc();
    MenuWidok MenuWidokPole = new MenuWidok();
    MenuPlik MenuPlikPole = new MenuPlik();
    MenuEdycja MenuEdycjaPole = new MenuEdycja();

    public MenuGlowne() {
    }
}

class MenuPomoc{

    public MenuPomoc() {
    }

    void InformacjeOProgramie(){
        System.out.println("Informacje: Zadanie 3");
    }

    void tematPomocy(){
        System.out.println("Nie wybrano tematu...");
    }
}

class MenuPlik{

    public MenuPlik() {
    }

    void otworz(){
        System.out.println("Trwa otwieranie, proszę czekac...");
    }

    void zakoncz(){
        System.out.println("Kończenie procesu...");
    }
    void zamknij(){
        System.out.println("Trwa zamykanie...");
    }

    void zapisz(){
        System.out.println("Zapisano");
    }

    void zapiszJako(){
        System.out.println("Zapisano plik");
    }
}

class MenuEdycja{

    public MenuEdycja() {
    }

    void cofnij(){
        System.out.println("Trwa cofanie, proszę o chwilę cierpliwości...");
    }

    void kopiuj(){
        System.out.println("Skopiowano do schowka");
    }

    void ponow(){
        System.out.println("Ponawiam próbę...");
    }

    void usun(){
        System.out.println("Usuwanie...");
    }

    void wklej(){
        System.out.println("Brak elementów do wklejenia...");
    }

    void wytnij(){
        System.out.println("Wycięto");
    }

    void znajdz(){
        System.out.println("Przeglądanie plików...");
    }
}

class MenuWidok{

    MenuPowiekszenie MenuPowiekszeniePole = new MenuPowiekszenie();

    public MenuWidok() {
    }

    void PasekStanu(){
        System.out.println("Trwa ładowanie paska stanu, może to chwilę potrwać...");
    }

    void pokazMapeBitowa(){
        System.out.println("Ładowanie mapy bitowej, proszę czekać...");
    }

    void powiekszenie(){
        System.out.println("Powiększono");
    }

    void przybornik(){
        System.out.println("Trwa ładowanie przybornika, proszę nie opuszczać strony...");
    }

    void selektorKoloru(){
        System.out.println("Trwa ładowanie selektora koloru, proszę nie opuszczać strony...");
    }

}

class MenuPowiekszenie{

    public MenuPowiekszenie() {
    }

    void duzy(){
        System.out.println("Zastosowano widok: duzy");
    }

    void niestandardowy(){
        System.out.println("Zastosowano widok: niestandardowy");
    }

    void normalny(){
        System.out.println("Zastosowano widok: normalny");
    }

    void pokazMiniature(){
        System.out.println("Ładowanie miniatury...");
    }

    void pokazSiatke(){
        System.out.println("Trwa ładowanie siatki, proszę czekać...");
    }
}