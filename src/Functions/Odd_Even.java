package Functions;

import java.util.Scanner;

public class Odd_Even {
    public static int printOdd_Even(int n){
        if (n % 2 == 0){
            System.out.println("It's a EVEN Number");
        } else {
            System.out.println("It's a ODD Number");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Value : ");
        int n = sc.nextInt();
        printOdd_Even(n);
    }
}