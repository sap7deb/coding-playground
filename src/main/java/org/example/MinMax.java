package org.example;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {-1,6,2,7,13,15,3,10,0};

        int max=arr[0],min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);

        /*int j=0;
        int k=arr.length-1;
        int m=0;
        while (j<k){
            if(arr[j]<arr[k]){
                m=arr[k];
                j++;
            }else {
                m=arr[j];
                k--;
            }
        }
        System.out.println(m);*/
    }
}
