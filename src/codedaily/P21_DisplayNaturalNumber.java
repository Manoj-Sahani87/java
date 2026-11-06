package codedaily;

import java.util.Scanner;

public class P21_DisplayNaturalNumber {
    public static void main(String[] args) {
        display();
    }

    static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Enter a positive number!!");
            } else {
                for (int i = 1; i <= n; i++) {
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