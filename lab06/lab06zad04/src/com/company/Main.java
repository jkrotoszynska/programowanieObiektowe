package com.company;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        l.add(new Student("Piotr", "Porzuczek", 28));
        l.add(new Student("Kacper", "Szymański", 27));
        l.add(new Student("Dominik", "Sarnecki", 22));
        l.add(new Student("Jakub", "Goralewski", 26));
        l.add(new Student("Jan", "Mehring", 23));
        l.add(new Student("Tomasz", "Gałązka", 30));
        l.add(new Student("Jan", "Drążkowski", 21));

        System.out.println("WypiszStudentowZeSrednia()");

        // #2
        WypiszStudentowZeSrednia(
                l,
                (p) -> p.getSrednia() >= 20 && p.getSrednia() <= 24,
                System.out::println
        );
    }

        // #1
        public static void WypiszStudentowZeSrednia(List<Student> l, Predicate<Student> tester, Consumer<Student> consumer){
            for(Student p : l){
                if(tester.test(p)){
                    consumer.accept(p);
                }
            }
        }
    }


class Student implements Comparable<Student>, Serializable {
    private String imie;
    private String naziwsko;
    private double srednia;

    public Student(String imie, String naziwsko, double srednia) {
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.srednia = srednia;
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

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    @Override
    public int compareTo(Student s) {
        int cmp = naziwsko.compareTo(s.naziwsko);
        if(cmp != 0){
            return cmp;
        }
        return imie.compareTo(s.imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.srednia, srednia) == 0 && Objects.equals(imie, student.imie) && Objects.equals(naziwsko, student.naziwsko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, naziwsko, srednia);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", naziwsko='" + naziwsko + '\'' +
                ", srednia=" + srednia +
                '}';
    }
}