package Conditional_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: 1.Add 2.Sub 3.Mul 4.Div 5.Mod");
        int choice = sc.nextInt();

        double result;

        if (choice == 1) {
            result = a + b;
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            result = a - b;
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            result = a * b;
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero");
            } else {
                result = a / b;
                System.out.println("Result: " + result);
            }
        } else if (choice == 5) {
            if (b == 0) {
                System.out.println("Error: Cannot perform modulo by zero");
            } else {
                result = a % b;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}