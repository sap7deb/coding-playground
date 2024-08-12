package org.example;

public class LongstPalindrom {

    public String longestPalindrome(String s) {
        String pal="";
        int size=0;
        boolean isPal=false;
        String longest = "";

        if (s.length()==1){
            return s;
        }

        for (int i=0; i<s.length();i++){
            pal="";
            for (int j=i; j<s.length();j++){
                pal= pal + s.charAt(j);
                if (pal.length()<=1 && s.length()==1){
                    continue;
                }
                isPal=findPalindrom(pal);
                if(isPal && pal.length()>size){
                    size=pal.length();
                    longest=pal;
                }
            }

        }
        return longest;
    }
    public boolean findPalindrom(String p){
        /*String rev="";

        for (int i=p.length()-1; i>=0;i--){
            rev=rev + p.charAt(i);
        }
        if(rev.equalsIgnoreCase(p)){
            return true;
        }
        else {
            return false;
        }*/
        int left = 0;
        int right = p.length() - 1;

        while (left < right) {
            if (p.charAt(left) != p.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        LongstPalindrom longstPalindrom = new LongstPalindrom();

        System.out.println("---> "+longstPalindrom.longestPalindrome("ac"));
    }
}
