package Arrays;

public class SecondMax {
    private static int secondMaxElement(int[] arr){
        if (arr.length==1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (secondMax < j) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,60,7,8,80,10};
        System.out.println(secondMaxElement(arr));
    }
}
