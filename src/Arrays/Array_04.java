package Arrays;

import java.util.Scanner;

public class Array_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int size = sc.nextInt();

        int number[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your Value : ");
            number[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }
}