package codedaily;

import java.util.Scanner;

public class P03_BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value : ");
        int a = sc.nextInt();
        System.out.print("Enter Second value : ");
        int b = sc.nextInt();

        System.out.println("Sum is : " + (a + b));
        System.out.println("Difference is : " + (a - b));
        System.out.println("Product is : " + (a * b));
        System.out.println("Quotient is : " + (a / b));

        sc.close();
    }
}