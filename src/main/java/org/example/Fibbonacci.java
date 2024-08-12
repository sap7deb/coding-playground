package org.example;

public class Fibbonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int sum=0;
        for(int i=0;i<10;i++){
           if(i==0||i==1){
               System.out.print(i+" ");
           }else {
               sum=a+b;
               System.out.print(sum+" ");
               a=b;
               b=sum;
           }
        }

        lcm(15,25);
        hcf(625,125);
    }

    public static void lcm(int a, int b){
        int ans = (a>b)?a:b;
        while (true){
            if(ans%a==0 && ans%b==0){
                break;
            }
            ans++;
        }
        System.out.println("\n"+ans);

    }

    public static void hcf(int a, int b){
        int hcf=0;
        for(int i=1; i<=a||i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
