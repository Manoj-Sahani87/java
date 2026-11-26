package codedaily;

import java.util.Scanner;

public class P34_DigitOfNumberNOnePerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number");
        } else {
            while (n != 0) {
                int digit = n % 10;
                n /= 10;
                System.out.println("Digit is : " + digit);
            }
        }
        sc.close();
    }
}