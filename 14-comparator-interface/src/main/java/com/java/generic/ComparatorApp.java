package com.java.generic;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        // semisal class Person itu milik orang lain, tidak bisa kita ubah-ubah
        // misal class Person itu tidak implement Comparable
        Person[] people = {
                new Person("Faraday","United Kingdom"),
                new Person("Tesla","United States"),
                new Person("Albert","Germany"),
                new Person("Galileo","Italy")
        };

        // kita ingin membandingkan Object, dari class Person
        // sedangkan class Person tidak implement Comparable
        // maka kita bisa menggunakan Comparator, dan override method nya langsung
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                // compare(T person1, T person2),
                // jadi compare ini menggunakan generic untuk tipe data parameter nya
                // bandingkan 2 Objectnya berdasarkan nama
                return person1.getName().compareTo(person2.getName());
            }
        };

        // Kemudian urutkan datanya dengan Array
        // people adalah data, dan comparator adalah cara atau metode compare nya
        Arrays.sort(people, comparator);

        // cetak menggunakan toString()
        System.out.println(Arrays.toString(people));
    }
}
