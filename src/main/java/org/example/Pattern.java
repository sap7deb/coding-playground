package org.example;

import java.util.HashMap;

public class Pattern {

    public static void main(String[] args) {

        /*int d=0;
        boolean flag=false;
        for (int i=0; i<10; i++){
            for (int j=9-i; j>=0;j--){
                System.out.print(" ");
            }
            d=i;
            flag=false;
            for (int k=0;k<=d;k++){
                System.out.print("*");
                if (k==d&&flag!=true){
                    d=d+(i-1);
                    flag=true;
                }
            }
            System.out.println();

        }*/

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


            // Create a HashMap and add some values
            HashMap<String, Integer> map
                    = new HashMap<>();
            map.put("a", 100);
            map.put("b", 200);
            map.put("c", 300);
            map.put("d", 400);

            // print map details
            System.out.println("HashMap: "
                    + map.toString());

            // provide key whose value has to be obtained
            // and default value for the key. Store the
            // return value in k
            int k = map.getOrDefault("b", 500);

            // print the value of k returned by
            // getOrDefault(Object key, V defaultValue) method
            System.out.println("Returned Value: " + k);

    }
}

