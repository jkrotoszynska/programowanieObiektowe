package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        KsiazkaTelefoniczna pb = new KsiazkaTelefonicznaMap();
        //KsiazkaTelefoniczna pb = new KsiazkaTelefonicznaList();

        pb.dodajOsoba(new Osoba("Marek", "Karpiński", "14567"));
        pb.dodajOsoba(new Osoba("Krzysztof", "Kulfon", "25243"));
        pb.dodajOsoba(new Osoba("Luiza", "Mielcarek", "34564"));

        System.out.println(pb.szukajPoprzezImie("Luiza"));
        System.out.println(pb.szukajPoprzezNazwisko("Mielcarek"));

        // nie występuje
        System.out.println(pb.szukajPoprzezNumer("1111"));

        // usuwamy
        // pb.usunPoprzezNumer("25243");
        // System.out.println(pb.szukajPoprzezNazwisko("Kulfon"));
    }
}

interface KsiazkaTelefoniczna{
    void dodajOsoba(Osoba p);
    Osoba szukajPoprzezImie(String imie);
    Osoba szukajPoprzezNazwisko(String nazwisko);
    Osoba szukajPoprzezNumer(String telefon);
    void usunPoprzezNumer(String telefon);
}

class Osoba implements Comparable<Osoba>, Serializable {
    private String imie;
    private String naziwsko;
    private String telefon;

    public Osoba(String imie, String naziwsko, String telefon) {
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.telefon = telefon;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNaziwsko() {
        return naziwsko;
    }

    public void setNaziwsko(String naziwsko) {
        this.naziwsko = naziwsko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int compareTo(Osoba o) {
        int cmp = naziwsko.compareTo(o.naziwsko);
        if(cmp != 0){
            return cmp;
        }
        return imie.compareTo(o.imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) && Objects.equals(naziwsko, osoba.naziwsko) && Objects.equals(telefon, osoba.telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, naziwsko, telefon);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", naziwsko='" + naziwsko + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}

class KsiazkaTelefonicznaList implements KsiazkaTelefoniczna{
    ArrayList<Osoba> pb;

    public KsiazkaTelefonicznaList() {
        pb = new ArrayList<>();
    }

    @Override
    public void dodajOsoba(Osoba p) {
        pb.add(p);
    }

    @Override
    public Osoba szukajPoprzezImie(String imie) {
        for(Osoba p : pb){
            if (p.getImie().equals(imie)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Osoba szukajPoprzezNazwisko(String nazwisko) {
        for(Osoba p : pb){
            if(p.getNaziwsko().equals(nazwisko)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Osoba szukajPoprzezNumer(String telefon) {
        for(Osoba p : pb){
            if(p.getTelefon().equals(telefon)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void usunPoprzezNumer(String telefon) {
        Osoba p = szukajPoprzezNumer(telefon);
                if(p != null){
                    pb.remove(p);
                }
    }

    public void dodajOsoba(String imie, String nazwisko, String telefon){
        pb.add(new Osoba(imie,nazwisko,telefon));
    }
}

class KsiazkaTelefonicznaMap implements KsiazkaTelefoniczna{
    HashMap<String, Osoba> map;

    public KsiazkaTelefonicznaMap() {
        map = new HashMap<>();
    }

    @Override
    public void dodajOsoba(Osoba s) {
        map.put(s.getTelefon(), s);
    }

    @Override
    public Osoba szukajPoprzezImie(String imie) {
        for(Osoba s : map.values()) {
            if(s.getImie().equals(imie)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Osoba szukajPoprzezNazwisko(String nazwisko) {
        for(Osoba s : map.values()){
            if(s.getNaziwsko().equals(nazwisko)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Osoba szukajPoprzezNumer(String telefon) {
        if(map.containsKey(telefon)){
            return map.get(telefon);
        }
        return null;
    }

    @Override
    public void usunPoprzezNumer(String telefon) {
        map.remove(telefon);
    }
}