package GCDEuclidean;

public class GCDeuclidean {
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            temp = a;
        }
        return a;
    }

    public static void main (String[] args){
      int result =  gcd(24,34);
        System.out.println("gcd of a,b is "+result);
    }
}
