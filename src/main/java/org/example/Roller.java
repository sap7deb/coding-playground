package org.example;

public class Roller {

    public static void main(String[] args) {
        String word = "Saptarshi";
        System.out.println("Minimum time taken to write \"" + word + "\": " + getTimeToWrite(word) + " seconds");
    }

    public static int getTimeToWrite(String word) {
        // The starting position is assumed to be 'A'
        char currentChar = 'A';
        int totalTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char nextChar = word.charAt(i);
            totalTime += getMinimumTime(currentChar, nextChar);
            currentChar = nextChar; // Move to the next character
        }

        return totalTime;
    }

    public static int getMinimumTime(char from, char to) {
        int fromPos = from - 'A';
        int toPos = to - 'A';

        // Calculate clockwise distance
        int clockwiseDistance = Math.abs(toPos - fromPos); // 0-19=-19
        // Calculate counter-clockwise distance
        int counterClockwiseDistance = 26 - clockwiseDistance; // 7

        // Return the minimum of the two distances
        return Math.min(clockwiseDistance, counterClockwiseDistance);
    }
}

