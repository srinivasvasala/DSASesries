package Maths;

public class Armstrong {
    public static boolean isArmstrong(int number) {
        int orginalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number!=0){
            int rem = number%10;
            sum+=Math.pow(rem,digits);
            number = number/10;
        }
        return sum==orginalNumber;
    }
    public static void main(String[] args) {
        int number=120;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
