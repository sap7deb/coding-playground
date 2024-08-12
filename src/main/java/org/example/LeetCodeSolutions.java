package org.example;

import java.util.*;

public class LeetCodeSolutions {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        // Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]
        int max = 0;
        int sum = 0;
        int maxSoFar = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum >= max) {
                    max = sum;
                }
                System.out.println("max---->" + max + "sum---->" + sum);
            }
            sum = 0;
        }

        return max;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println(arr[0] + arr[1]);
                    break;
                }
            }
        }
        return arr;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // return climbStairs(n-1) + climbStairs(n-2);
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Example 1:
        Input: nums = [1,2,3,1]
        Output: true
*/
    public static boolean containsDuplicate(int[] nums) {

        boolean f = false;
        int i = 0;
        int j = i + 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
            } else {
                return true;
            }
            if (j == nums.length) {
                i++;
                j = i + 1;
            }

        }
        return f;
    }

    public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
//        int res = nums.length;
//
//        for (int i = 0; i < nums.length; i++) {
//            res += i - nums[i];
//        }
//        return res;
        int sum = nums.length * (nums.length + 1) / 2;
        int mis = sum;
        Set<Integer> se = new HashSet<>();
        for (int a : nums) {
            se.add(a);
        }
        for (int i : se) {
            mis = mis - i;
        }
        if (mis == 0) {
            return nums.length + 1;
        } else if (mis > nums.length) {
            return 1;
        } else {
            return mis;
        }

    }


    public static int closetTarget(String[] words, String target, int startIndex) { // {"a","b","c","d","e","f"}, "b", 5
        int res = Integer.MAX_VALUE;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int d = Math.abs(i - startIndex); // 4 4 2
                res = Math.min(res, d);
                res = Math.min(res, (n - d));
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;

        } else {
            return res;
        }
    }

    public static boolean isHappy(int n) {
        Set<Long> seenNumbers = new HashSet<>();
        long m = n;
        while (m != 1 && !seenNumbers.contains(m)) {
            seenNumbers.add(m);
            long sum = 0;
            while (m > 0) {
                long digit = m % 10;
                sum += digit * digit;
                m = m / 10;
            }
            m = sum;
        }
        return m == 1;
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int ans = 0;


        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                ans -= roman.get(s.charAt(i));
            } else {
                ans += roman.get(s.charAt(i));
            }
        }

        return ans;

    }

    public static int strStr(String haystack, String needle) {

        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static int lengthOfLastWord(String s) {

        String newString = s.trim().replace(" ", "-");
        int count = 0;
        for (int i = newString.length() - 1; i >= 0; i--) {
            if (newString.charAt(i) == '-') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {

        int index1 = m - 1;
        int index2 = n - 1;
        int mergedIndex = m + n - 1;

        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
                mergedIndex--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
                mergedIndex--;
            }

        }
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = -1;
                j--;
            } else {
                k++;
                i++;
            }
        }
        return k;
    }

    public static int removeDuplicates(int[] nums) {

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
/* Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    Example
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
*/
    public static int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int val = 0, size = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!m.containsKey(nums[i])) {
                m.put(nums[i], 1);
            } else {
                m.put(nums[i], m.get(nums[i]) + 1);
                if (m.get(nums[i]) > size) {
                    size = m.get(nums[i]);
                    val = nums[i];
                }
            }
        }
        return val;

    }

    public static int maxProfit(int[] prices) {

        int i = 0;
        int j = 0;
        int p = 0;

        while (i < prices.length && j < prices.length) {
            if (prices[j] < prices[i]) {
                i++;
            } else {
                if ((prices[j] - prices[i]) > p) {
                    p = prices[j] - prices[i];
                }
                j++;
            }

        }
        return p;

    }

    public static boolean canConstructRansomeNote(String ransomNote, String magazine) {
        Map<Integer, Character> map = new HashMap<>();

        for (int i = 1; i <= magazine.length(); i++) {
            map.put(i, magazine.charAt(i - 1));

        }
        int p = 0;
        for (int i = 1, j = 0; i <= map.size() && j < ransomNote.length(); i++) {
            if (ransomNote.charAt(j) == map.get(i)) {
                p++;
                j++;
            }
        }
        if (p == ransomNote.length()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> dup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cnum = nums[i];

            if (dup.containsKey(cnum)) {
                if (i - dup.get(cnum) <= k) {
                    return true;
                }
            }
            dup.put(cnum, i);
        }
        return false;

    }

    public static boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length()){
//            return false;
//        }
//        char[] a = s.toCharArray();
//        char[] b= t.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        for(int i=0;i<a.length;i++){
//            if(a[i]!=b[i]){
//                return false;
//            }
//        }
//        return true;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            System.out.println(hm);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hm.containsKey(c)) {
                if (hm.get(c) == 1) hm.remove(c);
                else hm.put(c, hm.get(c) - 1);
            } else return false;
        }
        return hm.isEmpty();

    }

    public static boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;
        String sl = s.toLowerCase();

        while (l < r) {
            if (!Character.isLetterOrDigit(sl.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(sl.charAt(r))) {
                r--;
            } else if (sl.charAt(l) != sl.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static boolean isSubsequence(String s, String t) {

        int p = 0;
        for (int i = 0, j = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                p++;
                j++;
            }
        }
        if (p == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (smap.containsKey(sch) && smap.get(sch) != tch) {
                return false;
            }
            if (tmap.containsKey(tch) && tmap.get(tch) != sch) {
                return false;
            }
            smap.put(sch, tch);
            tmap.put(tch, sch);
        }
        return true;
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> pToStr = new HashMap<>();
        Map<String, Character> strToP = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];
            // Check if there's a conflict in the mapping from pattern to word
            if (pToStr.containsKey(pChar) && !pToStr.get(pChar).equals(word)) {
                return false;
            }
            if (strToP.containsKey(word) && strToP.get(word) != pChar) {
                return false;
            }
            pToStr.put(pChar, word);
            strToP.put(word, pChar);
        }
        return true;
    }

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }
        double s = 1;
        double l = x;
        double m = 0;

        while (s < l) {
            m = s + (l - s) / 2;
            if (m * m > x) {
                l = m - 1;
            } else if (m * m == x) {
                return (int) Math.floor(m);
            } else {
                s = m + 1;
            }
        }
        return (int) Math.floor(l);


    }

    public static void main(String[] args) {
//        System.out.println("Max-----> " + maxSubarraySum(new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1}, 9));
//        System.out.println("Max-----> " + maxSubarraySum(new int[]{10, 20, -30, 40, -50, 60}, 6));
//        System.out.println("Max-----> " + maxSubarraySum(new int[]{-3, -5, -6}, 3));
//
//        System.out.println(Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
//
//        System.out.println(Solution.isValid("([)]"));
//        int[] f = Solution.plusOne(new int[]{9});
//        for (int i : f) {
//            System.out.println(i);
//        }
//        System.out.println(Solution.climbStairs(7));
//
//        System.out.println(Solution.containsDuplicate(new int[]{1, 2, 3, 1}));
//
//        System.out.println(Solution.missingNumber(new int[]{1, 2, 4, 3, 5, 6, 0}));
//
//        System.out.println(Solution.closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0));
//        System.out.println(Solution.closetTarget(new String[]{"a", "b", "c", "d", "e", "f"}, "b", 5));
//
//        System.out.println(Solution.isHappy(19));
//
//        System.out.println(Solution.romanToInt("LVIII"));
//
        System.out.println(LeetCodeSolutions.strStr("leetcode", "leeto"));
        System.out.println(LeetCodeSolutions.strStr("sadbutsad", "sad"));
//
//        System.out.println(Solution.lengthOfLastWord("   fly me   to   the moon  "));
//
//        System.out.println(Solution.removeElement(new int[]{3, 2, 2, 3}, 3));
//
//        Solution.mergeSortedArrays(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
//        Solution.mergeSortedArrays(new int[]{1}, 1, new int[]{}, 0);
//
//        System.out.println(Solution.removeDuplicates(new int[]{1, 1, 2}));
//
//        System.out.println(Solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
//        System.out.println(Solution.majorityElement(new int[]{7, 1, 5, 3, 6, 4}));
//
//        System.out.println(Solution.canConstructRansomeNote("aa", "aab"));
//
//        System.out.println(Solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
//        System.out.println(Solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
//
//        System.out.println(Solution.isAnagram("anagram", "nagaram"));
//
//        System.out.println(Solution.isPalindrome("A man, a plan, a canal: Panama"));
//
//        System.out.println(Solution.isSubsequence("abc", "ahbgdc"));
//
//        System.out.println(Solution.wordPattern("abba", "dog cat cat fish"));
//
//        System.out.println(Solution.isIsomorphic("egg", "add"));
//        System.out.println(Solution.isIsomorphic("foo", "bar"));
//        System.out.println(Solution.isIsomorphic("paper", "title"));

//        System.out.println(Solution.mySqrt(8));
    }
}