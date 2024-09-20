package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "srinivas";
        StringBuilder result = new StringBuilder();
        result.append(new StringBuilder(str).reverse().toString());
        System.out.println(result.toString());
    }
}
