package org.example.threading;

public class ThreadTest extends Thread{

    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getName());

        }catch (Exception e){
            System.out.println("Exception is caught"+ e);
        }
    }
}
