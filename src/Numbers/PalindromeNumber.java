package Numbers;

import static java.lang.Math.abs;

public class PalindromeNumber {
    public int Palindrome(int num){
        int temp = num;
        boolean isNegative = false;
        if(temp<0){
            isNegative = true;
            temp = abs(temp);
        }
        int palin = 0;
        while(temp>0){
            int digit = temp%10;
            palin = palin*10+digit;
            temp/=10;
        }
        if(isNegative){
            palin = -palin;
        }
        return palin;
    }
    public static void main(String[] args) {
        int num = -1234;
        PalindromeNumber pn = new PalindromeNumber();
        int result = pn.Palindrome(num);
        System.out.println(result);
    }
}
