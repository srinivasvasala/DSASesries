package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int x,int n){
//        if(n=0){
//            return 1;
//        }
//        return n*fact(x, n-1);

        if(n==0){
            return 1;
        }
        int temp = fact(x,n/2);
        int ans =  temp*temp;
        if(n%2==1){
            ans = ans*x;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(2,10));

    }
}
