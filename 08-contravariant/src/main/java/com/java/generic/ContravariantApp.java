package com.java.generic;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Bayu");

        // create object myData bertipe String dari objectMyData bertipe Object
        // ini boleh karena Object itu super nya dari String
        MyData<? super String> myData = objectMyData;

        // panggil method dengan mengirimkan object bertipe parameter Object
        process(objectMyData);

        // get data
        System.out.println(objectMyData.getData());
    }

    /**
     * Method process yang menggunakan Contravariant
     * apapun tipe parameter yang penting adalah Parent dari String tetap bisa
     * @param myData parameter type nya apapun super dari String atau parent dari String
     */
    public static void process(MyData<? super String> myData){

        /**
         * coba melakukan getData
         * ini akan error, karena getData itu harus super dari String, yakni Object
         * untuk mengakali bisa konversi paksa
         * INI SEBENARNYA BAHAYA, BAHAYA KALAU SALAH KONVERSI DATANYA
         * Misalnya ternyata yang kita kirim di dalam Object parameter nya itu adalah nilai integer
         * sedangkan di dalam method ini hanya melakukan konversi dari Object ke String
         * ya pasti terjadi error konversi tipe datanya
         * itulah tidak boleh getData
         */
        // String value = (String) myData.getData();
        // System.out.println("Process Parameter: " + value);

        /**
         * PROBLEM NYA JIKA DI GET DATA
         * karena Method ini type genericnya String dan Contravariant dengan Parentnya yakni Object
         * maka apapun yang kita kirim ke method ini dalam bentuk Type Object bisa diterima
         * sehingga data pada method ini bisa berubah-ubah
         * MASALAHNYA akan terjadi pada saat Konversi tipe datanya
         * jika kita tidak tau jenis tipe data yang dikirim
         * maka kita tidak boleh asal konversi datanya
         * MISAL kita kirim data ke method ini berupa Integer, dan ternyata kita konversi ke String
         * maka akan terjadi error cannot be cast
         * CONTRAVARIANT GAK AMAN GET DATA
         */

        // disini set data akan aman
        myData.setData("Bayu Bagus Bagaswara");
    }
}
