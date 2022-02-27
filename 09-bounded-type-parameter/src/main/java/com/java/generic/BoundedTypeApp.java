package com.java.generic;

public class BoundedTypeApp {
    public static void main(String[] args) {

        // membatasi data yang boleh digunakan di generic
        // dengan menambahkan tipe yang diperbolehkan

        // buat Object dari class NumberData dengan generic parameter Integer
        NumberData<Integer> integerNumberData = new NumberData<>(12);
        NumberData<Long> longNumberData = new NumberData<>(1L);

        // Kalau kita masukan tipe data String maka akan Error, karena hanya yang extends Number
        // NumberData<String> stringNumberData = new NumberData<String>("aku");
    }
}
