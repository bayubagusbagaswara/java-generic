package com.java.generic;

/**
 * Invariant adalah class yang memiliki method doIt()
 * method doIt() sendiri memiliki parameter type Generic
 * artinya bisa menerima apapun tipe data dalam parameternya
 * untuk kasus ini kita ingin method doIt() ini memiliki type parameter generic nya berupa Object lain, yakni MyData
 * MyData sendiri adalah class yang bertipe generic pula
 * misalnya MyData memiliki tipe generic Object
 */
public class Invariant {

    public static void doIt(MyData<Object> objectMyData){
        // do something
    }
}
