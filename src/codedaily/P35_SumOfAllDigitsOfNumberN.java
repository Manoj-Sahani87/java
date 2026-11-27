package codedaily;

import java.util.Scanner;

public class P35_SumOfAllDigitsOfNumberN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter only positive number!!, Enter again");
            }
        }
        while (n <= 0);

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}