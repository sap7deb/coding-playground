package org.example;

public class Temperature {

    public static void main(String[] args) {
        int[] temperatures = {3, -1, 5, -2, 0, 4};

        /*for (int i=0;i<temperatures.length;i++){
            if()
        }*/

        if (temperatures.length == 0) {
            // Handle edge case if the array is empty
           // return 0; // Or you can throw an exception here
        }

        int closestTemperature = temperatures[0]; // Assume the first temperature is closest initially

        for (int temperature : temperatures) {
            // Check if the absolute value of the current temperature is closer to zero than the previously closest temperature
            if (Math.abs(temperature) < Math.abs(closestTemperature)) {
                closestTemperature = temperature;
            } else if (Math.abs(temperature) == Math.abs(closestTemperature)) {
                // If the absolute values are equal, choose the positive one
                closestTemperature = Math.max(closestTemperature, temperature);
            }
        }

        System.out.println(closestTemperature);
    }
}
