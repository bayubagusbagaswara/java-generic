package com.java.generic;

/**
 * Generic di Method
 * Method akan jadi Independent bisa akses generic type parameternya
 * atau hanya bisa diakses di method itu sendiri
 * cara nya langsung deklarasikan generic type parameternya dalam nama method
 */
public class ArrayHelper {

    // Method Generic Type Parameter
    // jadi khusus method ini yang bisa akses Type Parameter Generic
    // Umumnya penulisan method : public static int count(){}

    /**
     * Method count
     * @param paramsArray adalah nilai parameter yang dikirim saat pemanggilan method count
     * @param <T> adalah tipe parameter Generic untuk tipe data balikan method count
     * @return berupa int nilai panjang dari paramsArray
     */
    public static <T> int count(T[] paramsArray){
        return paramsArray.length;
    }
}
