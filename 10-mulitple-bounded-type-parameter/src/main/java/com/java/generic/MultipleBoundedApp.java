package com.java.generic;

public class MultipleBoundedApp {
    public static void main(String[] args) {

        // Manager dan VP adalah turunan dari Employee, jadi bisa dibuat objectnya
        // Data<Manager> managerData = new Data<>(new Manager()); // berubah jadi Error, karena Manager tidak implement CanSayHello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    // interface SayHello
    public static interface CanSayHello {
        void sayHello(String name);
    }

    // class Employee
    public static abstract class Employee {
    }

    // class Manager
    public static class Manager extends Employee {
    }

    // class VicePresident
    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    // class Data bertipe generic dengan parameter MultipleBounded
    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            // bisa akses method dari interface CanSayHello
            // this.data.sayHello("Albert");
        }
    }

}
