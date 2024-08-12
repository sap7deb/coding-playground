package org.example.threading;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Thread in Runnable "+Thread.currentThread().getName());

        }catch (Exception e){
            System.out.println("Exception is caught"+ e);
        }
    }
}
