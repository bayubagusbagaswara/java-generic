package com.java.generic;

/**
 * Class DataGeneric yang memiliki type parameter generic
 * @param <T> adalah Type Parameter Generic, tipe datanya tergantung saat kita masukkan saat instance object
 */
public class DataGeneric<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
