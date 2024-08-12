package org.example.copy;

public class Shallow{
    ABC abc= new ABC();

    public static void main(String[] args) {
        ABC abc1= new ABC();
        ABC abc2 = abc1;
        abc2.x=6;
        System.out.println(abc1.x);

    }

}
