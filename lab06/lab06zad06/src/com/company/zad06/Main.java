package com.company.zad06;

import com.company.util.Student;
import com.company.zad05.TworzenieStrumieni;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Student> s;

        /* Filtrowanie */
        System.out.println("Filtrowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        s.filter(student -> student.getSrednia() > 25)
                .forEach(System.out::println);

        /* Mapowanie */
        System.out.println("Mapowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        s.map(Student::getSrednia)
                .forEach(System.out::println);

        /* Mapowanie */
        System.out.println("Mapowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        s.map(student -> {
            double avg = student.getSrednia();
            return student.getImie().equals("Piotr") ? avg + 2 : avg;
        })
                .forEach(System.out::println);

        /* Agregacja (srednia) */
        System.out.println("Agregacja...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        System.out.println(s.mapToDouble(Student::getSrednia).average());

        /* Agregacja (ilosc) */
        System.out.println("Agregacja...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        System.out.println(s.mapToDouble(Student::getSrednia).count());

        /* Kolekcjonowanie */
        System.out.println("Kolekcjonowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        List<Student> l = s.filter(student -> student.getSrednia() > 25)
                .collect(Collectors.toList());
        System.out.println(l);

        /* Kolekcjonowanie */
        System.out.println("Kolekcjonowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        List<String> l2 = s.filter(student -> student.getSrednia() > 25)
                .map(Student::getNazwisko)
                .collect(Collectors.toList());
        System.out.println(l2);

        /* Kolekcjonowanie */
        System.out.println("Kolekcjonowanie...");
        s = TworzenieStrumieni.utworzStrumienZListy();
        Map<String, Double> m1 = s.filter(student -> student.getSrednia() > 18)
                .collect(Collectors.toMap(Student::getNazwisko, Student::getSrednia));
        System.out.println(m1);
    }
}
