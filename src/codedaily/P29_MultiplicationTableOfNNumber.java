package codedaily;

import java.util.Scanner;

public class P29_MultiplicationTableOfNNumber {
    public static void main(String[] args) {
        multiplicationN();
    }

    static void multiplicationN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }
        sc.close();
    }
}