package com.java.generic;

public class ArrayHelperApp {
    public static void main(String[] args) {

        // kita akan menghitung panjang array, dengan menggunakan method count()
        // method count() ini memiliki tipe parameter generic
        // artinya method count() ini dapat menerima parameter apapun tipe datanya

        // misalnya kita buat data Array
        // kita buat Array dengan tipe data String dan Integer
        String[] names = {"Bayu", "Bagus", "Bagaswara"};
        Integer[] values = {1, 2, 3, 4, 5};

        // variable names bertipe data String
        // variable values bertipe data Integer
        // jadi saat otomatis memanggil method dari class ArrayHelper, maka bisa langsung kedeteksi jenis tipe datanya

        // penulisan dibawah tidak disarankan, takutnya salah tipe data nya
        // System.out.println(ArrayHelper.<String>count(names));
        // System.out.println(ArrayHelper.<Integer>count(values));

        // penulisan yang disarankan, karena langsung otomatis mendeteksi tipe data variable nya
        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
