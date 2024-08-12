package org.example.threading;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        for (int i=0; i<n; i++)
        {
            ThreadTest object = new ThreadTest();

            // start() is replaced with run() for
            // seeing the purpose of start
            object.run();
        }
    }
}
