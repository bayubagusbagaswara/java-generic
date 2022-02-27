package com.java.generic;

public class CovariantApp {
    public static void main(String[] args) {

        // Covariant hanya bisa read-only, tidak bisa mengubah data
        // kalau maksa untuk set data, bisa-bisa datanya rusak, kalau sampai salah ngirim data
        // yang tadinya kita mengirim data string malah jadi integer

        // create object myDate bertipe generic String
        MyData<String> data = new MyData<>("Albert");

        // panggil method process
        // ini boleh (covariant)
        process(data);

        // ini boleh
        // karena data bertipe string dan kita assign ke tipe object
        // ini namanya covariant, diperbolehkan subtype dari  child ke parent
        MyData<? extends Object> myData = data;

        // method process() dibuat dari type parameter extends Object Class
        // sedangkan kita mengirim ke method berupa Type Parameter String, itu boleh dinamakan Covariant
    }

    /**
     * Method process adalah covariant yang extends ke type parameter generic Object (parent Class di Java)
     * artinya kita bisa mengextends tipe data apapun, dimana tipe data tersebut adalah child dari Object
     * Sehingga tipe data yang boleh adalah turunan dari Object, misal String, Integer dll
     * @param data adalah turunan dari class Object
     */
    public static void process(MyData<? extends Object> data){
        System.out.println(data.getData());
        // didalam method yang mengimplementasikan covariant tidak boleh ada setData()
        // hanya boleh read-only

        // data.setData(1); // tidak boleh, karena berbahaya
    }
}
