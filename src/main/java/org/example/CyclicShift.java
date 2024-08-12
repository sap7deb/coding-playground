package org.example;

public class CyclicShift {
    public static int solution(int N) {
        int largest = N;
        int shift = 0;
        int temp = N;

        for (int i = 1; i < 30; ++i) {
            int index = (temp & 1);  // Extracts the least significant bit of temp
            temp = ((temp >> 1) | (index << 29));  // Performs the cyclic shift
            System.out.println(index+" "+temp);
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }

        return shift;
    }

    public static void main(String[] args) {
//        System.out.println(solution(9736));         // Expected Output: 11
//        System.out.println(solution(1));            // Expected Output: 0
//        System.out.println(solution(2));            // Expected Output: 1
//        System.out.println(solution(1073741823));   // Expected Output: 0
//        System.out.println(solution(536870912));    // Expected Output: 29
//        System.out.println(solution(268435456));    // Expected Output: 28
//        System.out.println(solution(805306368));    // Expected Output: 0
        System.out.println(solution(2));    // Expected Output: 0
    }
}
