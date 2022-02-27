package com.java.generic;

/**
 * Pair adalah class yang memiliki Type Parameter Generic Multiple
 * artinya tipe data generic nya lebih dari satu
 * syaratnya untuk multiple generic cukup buat dua karakter yang berbeda di generic nya,
 * misal T dan U
 * jadi T dan U bisa kita gunakan untuk tipe data di tiap properties atau method class Pair ini
 */
public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
