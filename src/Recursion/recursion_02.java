package Recursion;
// print number 1 to 5
public class recursion_02 {
    public static void printNum(int n){
        if (n == 6){ // Base case
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}