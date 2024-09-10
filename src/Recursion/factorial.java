package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int x,int n){
//        if(n=0 ){
//            return 1;
//        }
//        return n*fact(x, n-1);

        if(n==0){
            return 1;
        }
        int ans = fact(x,n/2);
        if(n%2==0){
            ans =  ans*ans;
        }
        else{
            ans = ans*x;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(2,10));

    }
}
