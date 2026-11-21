package codedaily;

import java.util.Scanner;

public class P30_DisplayAllMultiplesOfNumberMUpToNTerms {
    public static void main(String[] args) {
        multipleMUtoN();
    }

    static void multipleMUtoN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number M : ");
        int m = sc.nextInt();
        System.out.print("Enter how many terms (N) : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int multiple = m * i;
            System.out.print(multiple + " ");
        }
        System.out.println();
        sc.close();
    }
}