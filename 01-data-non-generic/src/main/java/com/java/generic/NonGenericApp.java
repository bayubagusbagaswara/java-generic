package com.java.generic;

public class NonGenericApp {
    public static void main(String[] args) {

        DataNonGeneric dataNonGeneric = new DataNonGeneric();

        // bisa diset terserah tipe datanya, karena menggunakan Object untuk tipe data field nya
        // jadi field data bisa kita isi dengan tipe String atau Integer

        // bisa diisi string
        // dataNonGeneric.setData("ini data string");

        // bisa juga diisi integer
        dataNonGeneric.setData(100);

        // Problemnya,
        // jika kita ingin ambil data atau getData(), maka kita perlu konversi secara manual data nya
        // ketika di compile tidak terjadi masalah
        // tetapi saat runtime akan muncul error nya
        // misal kita setData() nya adalah Integer,
        // lalu kita paksa konversi menjadi String, maka itu akan menyebabkan ERROR

        String value = (String) dataNonGeneric.getData();

        // pasti Error, karena saat setData() kita set dengan tipe data integer
        System.out.println(value);
    }
}
