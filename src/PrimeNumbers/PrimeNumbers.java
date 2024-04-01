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
    public static void main(String args []){
        if(isPrime()){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not a prime000+");
        }
    }
}
