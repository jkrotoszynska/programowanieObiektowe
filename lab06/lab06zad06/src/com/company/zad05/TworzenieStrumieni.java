package com.company.zad05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import com.company.util.Student;

public class TworzenieStrumieni {
        public static void main(String[] args) {
            Stream<Student> s;

            s = budujStrumien();
            s.forEach(System.out::println);

            s = budujStrumienDodawaniem();
            s.forEach(System.out::println);

            s = utworzStrumienZElementow();
            s.forEach(System.out::println);

            s = utworzStrumienZListy();
            s.forEach(System.out::println);

            s = utworzStrumienZTablicy();
            s.forEach(System.out::println);

        }

        // zapoznać się z budową v i wywolywaniem ^ strumieni

        public static Stream<Student> budujStrumien() {
            Stream.Builder<Student> sb = Stream.builder();
            sb.accept(new Student("Kacper", "Szymański", 27));
            sb.accept(new Student("Marta", "Nalinowska", 23));
            sb.accept(new Student("Grzegorz", "Dziczek", 30));
            return sb.build();
        }

        public static Stream<Student> budujStrumienDodawaniem() {
            Stream.Builder<Student> sb = Stream.builder();
            return sb
                    .add(new Student("Kacper", "Szymański", 27))
                    .add(new Student("Marta", "Nalinowska", 23))
                    .add(new Student("Grzegorz", "Dziczek", 30))
                    .build();
        }

        public static Stream<Student> utworzStrumienZElementow() {
            return Stream.of(
                    new Student("Kacper", "Szymański", 27),
                    new Student("Marta", "Nalinowska", 23),
                    new Student("Grzegorz", "Dziczek", 30));
        }

        public static Stream<Student> utworzStrumienZListy() {
            ArrayList<Student> l = new ArrayList<>();
            l.add(new Student("Jan", "Dzban", 28));
            l.add(new Student("Kacper", "Szymański", 27));
            l.add(new Student("Michał", "Zwiefka", 22));
            l.add(new Student("Piotr", "Kristowski", 26));
            l.add(new Student("Marta", "Nalinowska", 23));
            l.add(new Student("Grzegorz", "Dziczek", 30));
            l.add(new Student("Tomasz", "Gałązka", 21));
            return l.stream();
        }

        public static Stream<Student> utworzStrumienZTablicy() {
            Student[] l = new Student[3];
            l[0] = new Student("Jan", "Dzban", 28);
            l[1] = new Student("Kacper", "Szymański", 27);
            l[2] = new Student("Michał", "Zwiefka", 22);
            return Arrays.stream(l);
        }
}
