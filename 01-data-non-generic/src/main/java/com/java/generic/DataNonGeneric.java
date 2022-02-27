package com.java.generic;

/**
 * Jika kita ingin mengubah-ubah tipe data, maka biasanya kita set sebagai tipe data Object
 * karena Object adalah tipe data Parent Class di Java
 * sehingga bisa dikonversi atau diubah-ubah tipe datanya
 * misal dari tipe data String menjadi tipe data Integer, itu bisa jika menggunakan Object
 */
public class DataNonGeneric {

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
