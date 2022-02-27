package com.java.generic;

public class TypeErasureApp {
    public static void main(String[] args) {

        // PROBLEM TYPE ERASURE
        // karena informasi generic hilang ketika menjadi binary file
        // oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
        // berbahaya karena error nya tidak terjadi saat proses kompilasi
        // error akan terjadi pada saat runtime

        // ini yang terjadi saat kompilasi, informasi generic nya hilang
        Data stringData = new Data("Albert Einstein");

        // kita konversi dari String menjadi Integer
        Data<Integer> integerData = (Data<Integer>) stringData;

        // pada saat kompilasi tidak terjadi error, karena informasi generic nya hilang
        // tapi saat running error nya baru kelihatan
        Integer integer = integerData.getData();

        // error nya karena String tidak bisa dikonversi menjadi integer
    }
}
