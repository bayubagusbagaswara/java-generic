package com.java.generic;

public class GenericApp {
    public static void main(String[] args) {

        // Dengan Generic, bisa tentukan Type Parameter terserah kita saat instance object nya
        // Jika kita set type genericnya misal String, maka otomatis object tersebut memilik tipe data String
        // sehingga field atau method akan bertipe String
        // apabila kita set atributnya bertipe Integer, maka akan langsung error, dan errornya pun tidak saat Runtime
        // Jadi, kita tidak perlu konversi manual tipe datanya, dan aplikasi kita lebih aman

        DataGeneric<String> dataGeneric = new DataGeneric<>();
        dataGeneric.setData("Ini type parameter generic String");

        String value = dataGeneric.getData();
        System.out.println(value);
    }
}
