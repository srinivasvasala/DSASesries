package Recursion;

public class Recursion_Basics {
    public static void increfunct(int i){
        if(i<5){
            return;
        }
        System.out.println("Srinivas   "+i);
        increfunct(i+1);
    }
    public static void decrefunct(int i){
        if(i<1){
            return;
        }
        System.out.println("srinivas "+i);
        decrefunct(i-1);
    }

    public static void main(String[] args) {
        increfunct(1);
        decrefunct(5);
    }
}
