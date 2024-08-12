package org.example.threading;

public class RunnableDemo {
    public static void main(String[] args) {
        int n = 8;
        for (int i=0; i<n; i++)
        {
            Thread t1= new Thread(new RunnableImpl());
            t1.start();

            // start() is replaced with run() for
            // seeing the purpose of start

        }
    }
}
