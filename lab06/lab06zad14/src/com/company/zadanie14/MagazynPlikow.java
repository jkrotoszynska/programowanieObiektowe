package com.company.zadanie14;

import com.company.util.Student;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class MagazynPlikow {
    public static void main(String[] args){
        MagazynPlikow magazyn = new MagazynPlikow();
        Student student = magazyn.generujStudenta();

        try {
            magazyn.zapiszTekstowy(student, Paths.get("C:\\temp", "student.bin").toString());
            magazyn.zapiszBinarny(student, Paths.get("C:\\temp", "student.txt").toString());
            magazyn.zapiszObiektowy(student, Paths.get("C:\\temp", "student.obj").toString());

            Student odczytany = (Student) magazyn.odczytajObiektZPliku("C:\\temp\\student.obj");
            System.out.println(odczytany.getImie());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public Student generujStudenta(){
        System.out.println("Wprowadz studenta (imie, nazwisko, średnia): ");
        Scanner src = new Scanner(System.in);
        String[] pola = src.nextLine().split(",");
        src.close();

        return new Student(pola[0], pola[1], Double.parseDouble(pola[2]));

    }

    public void zapiszTekstowy(Student s, String nazwaPliku) throws IOException{
        String str = s.getImie() + ',' + s.getNazwisko() + ',' + s.getSrednia() + "\n";
        BufferedWriter out = new BufferedWriter(new FileWriter(nazwaPliku));
        out.write(str);
        out.close();
        System.out.println("[OK] Zapisano jako plik tekstowy");
    }

    public void zapiszBinarny(Student s, String nazwaPliku) throws IOException{
        DataOutputStream out = new DataOutputStream(new FileOutputStream(nazwaPliku));
        out.writeChars(s.getImie());
        out.writeChars(s.getNazwisko());
        out.writeDouble(s.getSrednia());
        out.close();
        System.out.println("[OK] Zapisano jako plik tekstowy");
    }

    public void zapiszObiektowy(Student s, String nazwaPliku) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nazwaPliku));
        out.writeObject(s);
        out.close();
        System.out.println("[OK] Zapisano jako plik tekstowy");
    }

    public Object odczytajObiektZPliku(String sciezka){
        try {
            FileInputStream plikStrumien = new FileInputStream(sciezka);
            ObjectInputStream obiektStrumien = new ObjectInputStream(plikStrumien);

            Object obj = obiektStrumien.readObject();
            obiektStrumien.close();
            System.out.println("[Ok] odczytano z pliku");
            return obj;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
