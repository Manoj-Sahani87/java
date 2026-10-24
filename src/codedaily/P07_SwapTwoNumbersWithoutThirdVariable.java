package codedaily;

import java.util.Scanner;

public class P07_SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of B : ");
        int b = sc.nextInt();

        System.out.println("Before Swap Value of A is : " + a);
        System.out.println("Before Swap Value of B is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap Value of A is : " + a);
        System.out.println("After Swap Value of b is : " + b);

        sc.close();
    }
}