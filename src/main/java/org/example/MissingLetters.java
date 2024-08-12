package org.example;

import java.util.*;

public class MissingLetters {

    public static void main(String[] args) {
        String l= "SAPTARSHI";
        Set<Character> c = new HashSet<>();
        for(char a:l.toCharArray()){
            c.add(a);
        }
        for (int i=0; i<26; i++){
            if(!c.contains((char)(i+'A'))){
                System.out.println((char)(i+'A'));
            }
        }
    }
}
