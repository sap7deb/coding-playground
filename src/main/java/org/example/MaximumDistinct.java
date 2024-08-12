package org.example;
import java.util.*;

public class MaximumDistinct {
    public static int getMaximumDistinctCount(int n, int[] a, int[] b, int k) {
        // Create a frequency map for elements in b
        Map<Integer, Integer> freqB = new HashMap<>();
        for (int num : b) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqB);
        // Remove frequencies of elements already in a
        Set<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
            freqB.remove(num);
        }
        System.out.println(setA);
        // Convert freqB to a list of Map.Entry and sort by frequency descending
        List<Map.Entry<Integer, Integer>> sortedB = new ArrayList<>(freqB.entrySet());
        System.out.println(sortedB);
        sortedB.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println(sortedB);
        int distinctCount = setA.size();  // Initial count of distinct elements in a
        int swaps = 0;

        // Perform swaps
        for (Map.Entry<Integer, Integer> entry : sortedB) {
            if (swaps < k) {
                int elem = entry.getKey();
                if (!setA.contains(elem)) {
                    // Find an element in a to swap
                    for (int i = 0; i < n; i++) {
                        if (!freqB.containsKey(a[i])) {
                            setA.add(elem);
                            a[i] = elem;
                            distinctCount++;
                            swaps++;
                            break;
                        }
                    }
                }
            }
        }

        return distinctCount;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {2, 3, 2, 2, 2};
        int[] b = {1, 3, 2, 4, 1};
        int k = 2;

        int result = getMaximumDistinctCount(n, a, b, k);
        System.out.println(result);  // Output should be the maximum number of distinct elements in array a
    }
}

