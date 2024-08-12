package org.example;

import java.util.HashMap;

public class DuoDigit {
    public static void duodigits(int input) {
        String[] inputArray = String.valueOf(input).split("");
        HashMap<String, Integer> resultHM = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            // System.out.println(inputArray[i]);

            if (!resultHM.containsKey(inputArray[i])) {
                resultHM.put(inputArray[i], 1);
            } else {
                resultHM.put(inputArray[i], resultHM.get(inputArray[i]) + 1);

            }
            // System.out.println(resultHM);
        }

        // System.out.println(resultHM);
        // for (Map.Entry entry : resultHM.entrySet()) {
        //     System.out.println(entry.getKey() + ", " + entry.getValue());
        //     if()
        // }
        if (resultHM.size() == 2) {
            System.out.println('y');
        } else {
            System.out.println('n');
        }
    }

        public static void main(String[] args) {
            duodigits(12);
            duodigits(2020);
            duodigits(-3333);
           duodigits(123);


        }
}
