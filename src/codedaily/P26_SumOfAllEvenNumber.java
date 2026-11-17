package codedaily;

import java.util.Scanner;

public class P26_SumOfAllEvenNumber {
    public static void main(String[] args) {
        SumEvenNumber();
    }

    static void SumEvenNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                if (i != 2) {
                    System.out.print(", ");
                }
                System.out.print(i);
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}