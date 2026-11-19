package codedaily;

import java.util.Scanner;

public class P28_FactorialOfN {
    public static void main(String[] args) {
        factorialN();
    }

    static void factorialN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else if (n > 20) {
            System.out.println("Value too large, enter a number up to 20");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial is : " + fact);
        }
        sc.close();
    }
}