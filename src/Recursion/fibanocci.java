package Recursion;

import java.util.Scanner;

public class fibanocci {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    //using DP
       static int fib2(int n){
           if(n==0 || n==1){
               return n;
           }
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fib(20));

        System.out.println(fib2(20));
    }
}
