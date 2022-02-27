package com.java.generic;

public class InvariantApp {
    public static void main(String[] args) {
        // Invariant artinya tidak bisa di subtitusi ke Child Class dan Parent Class nya
        // jadi tidak bisa melakukan subtype ataupun supertype
        // INGAT yang di subtype itu adalah TIPE PARAMETER GENERIC nya

        // 1. create object myData dengan tipe generic String
        MyData<String> stringMyData = new MyData<>("Albert");

        // ini ERROR, karena hanya bisa type Object
        // Invariant.doIt(stringMyData);

        // meskipun method doIt dibuat dari Generic Type Parameter Object dimana itu adalah Parent semua class, itu tetap menyebabkan Error
        // karena Invariant, tidak bisa subtitusi dari Child (String) ke Parent (Object)

        // 2. create object myData dari (assign) object stringMyData bertipe String
        // kalau polymorphism ini bisa, karena string adalah turunan dari object

        // ini ERROR
        // MyData<Object> objectMyData = stringMyData;

        // 3. create object myData dengan tipe generic Object
        MyData<Object> objectMyData = new MyData<>(1000);

        // 4. create object myData dari (assign) object myData bertipe Object

        // ini ERROR
        // MyData<String> stringMyData1 = objectMyData;

        // Kalau biasanya kita bisa menggunakan Polymorphism, di generic tidak berlaku Polymorphism
        // jadi di Generic tidak ada hubungannya dengan Parent ataupun Child (harus Independent)
    }
}
