package Arrays;

public class SecondLowest {
    private static int secondMin(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                secMin = min;
                min = num;
            } else if (num < secMin && num != min) {

                    secMin = num;
            }
        }
        return secMin;
    }
    public static void main (String[]args){
            int[] arr = {1, 2, 3, 4, 5, 9, 60, 7, 8, 80, 10};
            System.out.println(secondMin(arr));
    }

}
