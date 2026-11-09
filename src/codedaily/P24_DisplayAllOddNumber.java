package codedaily;

import java.util.Scanner;

public class P24_DisplayAllOddNumber {
    public static void main(String[] args) {
        oddNumber();
    }

    static void oddNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}