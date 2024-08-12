package org.example;

public class FiirstOccuranceOfString {

    public static void main(String[] args) {
       /* String[] s = {"flower","flow","flight"};

       Arrays.sort(s);
        for (String a:s){
            System.out.println(a);
        }*/
        String s= "a";
        System.out.println("-->"+s.substring(0,1));

        FiirstOccuranceOfString e= new FiirstOccuranceOfString();
        System.out.println(e.strStr("a","a"));

    }
    public int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()){
            return -1;
        }
        int f=haystack.length()-1;
        System.out.println(needle.length());
        for(int i=0; i<=f; i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
            if(f-i<needle.length()){
                break;
            }
        }
        return -1;
    }
}
