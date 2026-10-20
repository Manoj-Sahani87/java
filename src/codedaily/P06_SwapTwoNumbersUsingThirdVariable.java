package codedaily;

import java.util.Scanner;

public class P06_SwapTwoNumbersUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of B : ");
        int b = sc.nextInt();

        System.out.println("Before Swap value of A is : " + a);
        System.out.println("Before Swap value of B is : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap value of A is : " + a);
        System.out.println("After Swap value of B is : " + b);

        sc.close();
    }
}