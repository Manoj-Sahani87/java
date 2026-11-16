package codedaily;

import java.util.Scanner;

public class P25_SumOfNaturalNumber {
    public static void main(String[] args) {
        naturalNumber();
    }

    static void naturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Sum is : " + sum);
        System.out.println();
        sc.close();
    }
}