package org.example;

import java.util.*;

public class Example {

    public static void main(String[] args) {
       /* String[] s = {"flower","flow","flight"};

       Arrays.sort(s);
        for (String a:s){
            System.out.println(a);
        }*/
        String s= "a";
        s.toLowerCase();
       // System.out.println("-->"+s.substring(0,1));
        System.out.println(Character.isLetterOrDigit(';'));

        int pal =141;
        int a=0;
        int j=pal;

      /*  while(j>0){
            a=a*10+j%10;
            j=j/10;
        }
        if(a==pal){
            System.out.println("P");
        }else{
            System.out.println("NP");
        }*/

        int f=0;
        int b=0;
        int in=0;
        for(int i=0; i<5;i++){
            if(i==0 || i==1){
                System.out.print(i+" ");
                f=i;
                b=f-1;
            }else {
                in=f+b;
                System.out.print(in + " ");
                b=f;
                f=in;
            }

            }
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"sa");
        map.put(2,"sp");
        map.put(3,"st");
        map.put(4,"sr");
        map.put(5,"ss");

        List<Map.Entry<Integer, String>> maplist= new ArrayList<>(map.entrySet());
        System.out.println("---------------------->>---->>"+ maplist);

        for (Map.Entry<Integer, String> m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
      //  Example.majorityElement(new int[] {3,2,3});

        String m="aa";
        System.out.println("----->>>>"+m.contains("a"));
        //plusone();
        alphabet();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(30);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("----->>>"+iterator.next());
        }


    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }


    public static void plusone(){
        System.out.println("Plus One-----");
        int[] digit = new int[] {9};
        digit[0]=0;
        digit= new int[2];
        digit[0]=1;
        for(int i:digit){
            System.out.println(i);
        }

    }

    public static void alphabet(){
        for(int i=0;i<26; i++){
            System.out.println(i+" --> "+(char)(i+'A'));
        }
        String s="Saptarshi";
        String revers="";
        for(int i=s.length()-1;i>=0;i--){
            revers= revers+s.charAt(i);
        }
        System.out.println(revers);
    }


}

