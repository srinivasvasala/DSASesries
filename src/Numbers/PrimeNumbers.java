package Numbers;

import static java.lang.Math.sqrt;

public class PrimeNumbers {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static boolean primeOptimized(int num){
        if(num<=1){
            return false;
        }
        if(num<=3){
            return true;
        }
        if(num%2==0 ||num%3==0){
            return false;
        }
        for(int j=5;j<=sqrt(num);j+=6){
            if(num%j==0||num%(j+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        if(isPrime(7)){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not a prime");
        }
        if(primeOptimized(86)){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not a prime");
        }
    }
}
