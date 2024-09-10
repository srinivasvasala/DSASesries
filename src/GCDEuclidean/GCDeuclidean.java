package GCDEuclidean;

public class GCDeuclidean {
    static int gcd(int a, int b){
       if(a==0){
           return b;
       }
       if(b==0){
           return a;
       }
        return gcd(b,a%b);
    }

    public static void main (String[] args){
      int result =  gcd(45,25);
        System.out.println("gcd of a,b is "+result);
    }
}
