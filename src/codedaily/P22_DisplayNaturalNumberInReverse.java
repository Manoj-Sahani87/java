package codedaily;

import java.util.Scanner;

public class P22_DisplayNaturalNumberInReverse {
    public static void main(String[] args) {
        reverse();
    }

    static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Enter a positive number!!");
            } else {
                for (int i = n; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input!!");
        }
        sc.close();
    }
}