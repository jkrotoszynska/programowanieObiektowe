package com.company.zad04;

import com.company.util.Student;

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
