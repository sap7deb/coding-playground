package org.example;

public class JavaGenericClass<T> {
    T obj;
    JavaGenericClass(T obj) {
        this.obj = obj;
    } // constructor
    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        JavaGenericClass<Integer> javaGenericClass = new JavaGenericClass<>(15);
        System.out.println(javaGenericClass.getObject());

    }
}
