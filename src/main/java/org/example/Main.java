package org.example;

import java.util.*;
public class Main {
    static int solve(String str) {
        Set < Character > se=null;
        if(str.length()==0)
            return 0;
        int maxans = 0;
        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
        {
            se = new HashSet < > ();
            for (int j = i; j < str.length(); j++) // nested loop for getting different

            {

                if (se.contains(str.charAt(j))) // if element if found so mark it as ans
                {
                        maxans = Math.max(maxans, se.size());
                        System.out.println(se.size());
                        break;


                }
                se.add(str.charAt(j));
                System.out.println(se);
                if(maxans<se.size()){
                    maxans=se.size();
                }
            }
        }
        return maxans;
    }

    public static void main(String args[]) {
        String str = "takeUfomwtrd";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
        Map<String,String> map= new HashMap<>();

    }
}