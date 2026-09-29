package Functions;

import java.util.Scanner;

public class CalculateProduct {
    public static int CalculateOfProduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Product of 2 number is : " + CalculateOfProduct(a, b));
    }
}