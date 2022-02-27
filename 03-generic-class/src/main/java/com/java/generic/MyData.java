package com.java.generic;

/**
 * MyData adalah class yang punya type data parameter generic
 * @param <T> adalah Generic Parameter Type
 * sehingga properties dan method di dalam class MyData memiliki tipe data T
 * Misal saat instance object nya kita memasukkan tipe data String, maka semua method atau field di class ini akan bertipe data String
 */
public class MyData<T> {

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
