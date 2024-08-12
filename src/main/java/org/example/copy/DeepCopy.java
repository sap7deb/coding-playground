package org.example.copy;

public class DeepCopy {
    ABC abc= new ABC();

    public static void main(String[] args) throws Exception {
        ABC abc1= new ABC();
        ABC abc2 = new ABC();
        abc2.x=6;
        System.out.println(abc2.x);

        char a= 'Z';
        System.out.println(a-'A');

        try {
            System.out.println("Try");
        }catch (ArithmeticException e){
           throw new ArithmeticException("ArithmeticException");
        }

    }
}
