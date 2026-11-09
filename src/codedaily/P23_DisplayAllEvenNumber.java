package codedaily;

import java.util.Scanner;

public class P23_DisplayAllEvenNumber {
    public static void main(String[] args) {
        evenNumber();
    }

    static void evenNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}