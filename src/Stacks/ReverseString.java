package Stacks;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            stack.push(c);
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("srinivas"));
    }

}
