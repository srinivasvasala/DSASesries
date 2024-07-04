package ReverseString;

public class ReverseString {
//    public static String reversed(String str){
//        StringBuilder reverse = new StringBuilder();
//        for(int i= str.length()-1;i<=0;i--){
//            reverse.append(str.charAt(i));
//        }
//        return reverse.toString();
//    }
    public static void main(String[] args) {
        String str = "srinivas";
        System.out.println(reverseStr(str));
    }
    public static String reverseStr(String str){
        if(str.isEmpty()){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }
}
