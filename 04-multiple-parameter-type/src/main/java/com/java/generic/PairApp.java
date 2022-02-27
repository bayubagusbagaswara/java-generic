package com.java.generic;

public class PairApp {
    public static void main(String[] args) {

        // instance object dari class Pair
        // kita harus menambahkan tipe data yang kita inginkan pada generic type nya
        // misal type parameter Generic yang kita inginkan adalah String dan Integer
        // field First di class Pair sekarang punya tipe data String
        // field Second di class Pair sekarang punya tipe data Integer

        Pair<String, Integer> pair = new Pair<>("Bayu Bagus Bagaswara", 24);

        // saat get data maka tipe data nya sudah sesuai dengan generic nya
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
