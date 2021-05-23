package com.company.util;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable {
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

    public String getNazwisko() {
        return naziwsko;
    }

    public void setNazwisko(String naziwsko) {
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
