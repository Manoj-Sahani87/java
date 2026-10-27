package codedaily;

import java.util.Scanner;

public class P11_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("It's an Even number");
        } else {
            System.out.println("It's an Odd number");
        }
        sc.close();
    }
}