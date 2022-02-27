package com.java.generic;

/**
 * Class Person akan implements Interface Comparable
 * interface comparable sendiri adalah interface yang menerapkan type parameter generic
 * jadi type parameter generic bisa di set terserah, bahkan bisa juga berupa sebuah Object
 * karena Comparable ini berfungsi untuk membandingkan antar object, maka generic nya juga berupa object
 * dia akan di compare dengan Person juga
 */
public class Person implements Comparable<Person> {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // method compareTo milik Interface Comparable
    @Override
    public int compareTo(Person person) {
        // compare pake namanya aja
        // this mengacu ke object saat ini
        // person adalah parameter berupa object person
        // jadi person saat ini dibanding person yang lain
        return this.name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
