package com.java.generic;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<>(100)); // tipe integer
        print(new MyData<>("Albert")); // tipe string

        // ini berguna jika hanya ingin menerima datanya doang
        // tidak ingin melakukan konversi datanya jadi tipe data tertentu
    }

    // method pring dengan tipe parameternya MyData
    // MyData sendiri memiliki tipe parameter generic Wildcard
    public static void print(MyData<?> myData){
        // jangan pernah melakukan konversi tipe data dalam wilcard
        // karena kita tidak tahu data apa yang dikirimkan
        // kalau kita paksa konversi, kalau tidak benar cara konversinya, maka terjadi error

        // getData bertipe Object, jadi akan menampilkan apapun datanya
        System.out.println(myData.getData());
    }
}
