package org.example.threading;

public interface TestInterface {

    String s="New";

    default void test(){
        System.out.println("Interface default method");
    }

}
