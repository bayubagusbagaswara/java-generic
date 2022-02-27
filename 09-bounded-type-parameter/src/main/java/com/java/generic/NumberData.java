package com.java.generic;

/**
 * NumberData adalah class yang memiliki type parameter generic
 * akan tetapi, generic parameternya adalah yang extends class Number
 * @param <T> generic type parameter yang extends ke Class Number
 * Class Number dan turunannya lah yang bisa digunakan dalam class ini
 * untungnya adalah semua method/function didalam class ini bisa menggunakan fungsi dari tipe data Number
 * misal byteValue(), doubleValue() dll
 * extends Number artinya T bernilai tipe parameternya dari Number beserta kelas turunan dari Number
 */
public class NumberData<T extends Number> {

    private T data;

    public NumberData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
        // bisa akses method milik Number
        // data.doubleValue();
        // data.byteValue();
    }
}
