package Strings;

public class ReverseWords {
    public static void main(String[] args) {
       String input = "this is srinivas";
       String[] words = input.split(" ");
       StringBuilder result = new StringBuilder();
       for(String word:words){
           result.append(new StringBuilder(word).reverse().toString()).append(" ");
       }
        System.out.println(result.toString());
    }
}
