package com.java.generic;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        // Interface juga ada yang menggunakan Generic
        // yakni Comparable dan Comparator (interface ini termasuk Generic)
        // Comparable digunakan untuk perbandingan >= atau <=
        // syaratnya adalah Object kita harus mewariskan Interface Generic Comparable
        // Turunan dari Comparable Interface sangat banyak
        // Sebenarnya di Comparable hanya satu method, yakni compareTo()

        // urutkan nama orang
        Person[] people = {
                new Person("Faraday","United Kingdom"),
                new Person("Tesla","United States"),
                new Person("Albert Einstein","Germany"),
                new Person("Galileo","Italy")
        };

        // sebenarnya method sort menggunakan ComparableTo
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
