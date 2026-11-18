package codedaily;

import java.util.Scanner;

public class P27_SumOfAllOddNumber {
    public static void main(String[] args) {
        sumOddNumber();
    }

    static void sumOddNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                if (i != 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}