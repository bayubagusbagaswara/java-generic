package com.java.generic;

public class GenericClassApp {
    public static void main(String[] args) {

        // create object dari class MyData
        // masukkan tipe data generic nya String
        MyData<String> stringMyData = new MyData<>("Albert Einstein");

        // create object dari class MyData
        // masukkan tipe data generic nya Integer
        MyData<Integer> integerMyData = new MyData<>(100);

        // Tidak perlu lagi melakukan konversi tipe data lagi
        // karena sudah otomatis menyesuaikan terhadap type parameter generic nya

        // ambil data, ini sudah aman, karena tidak akan error saat runtime
        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        // apabila terjadi error, misalnya kita salah tipe data
        // ini akan langsung terdeteksi error, jadi lebih aman daripada konversi tipe data manual
        // Integer integer = stringMyData.getData(); // ERROR

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
