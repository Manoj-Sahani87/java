package Functions;

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n){
        if (n < 0){
            System.out.println("negative number!!");
            return;
        }
        // loop
        int factorial = 1;
        for (int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}