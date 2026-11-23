package codedaily;

import java.util.Scanner;

public class P32_DisplayNumbersDivisibleBy3Or5 {
    public static void main(String[] args) {
        divisible();
    }

    static void divisible() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}