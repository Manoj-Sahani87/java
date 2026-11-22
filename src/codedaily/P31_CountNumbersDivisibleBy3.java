package codedaily;

import java.util.Scanner;

public class P31_CountNumbersDivisibleBy3 {
    public static void main(String[] args) {
        divisible();
    }

    static void divisible() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Count is : " + count);
        sc.close();
    }
}