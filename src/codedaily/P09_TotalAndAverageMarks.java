package codedaily;

import java.util.Scanner;

public class P09_TotalAndAverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1 : ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2 : ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3 : ");
        double m3 = sc.nextDouble();
        System.out.print("Enter marks of subject 4 : ");
        double m4 = sc.nextDouble();
        System.out.print("Enter marks of subject 5 : ");
        double m5 = sc.nextDouble();

        if (m1 < 0 || m2 < 0 || m3 < 0 || m4 < 0 || m5 < 0) {
            System.out.println("Marks can't be negative!!");
        } else {
            double total = m1 + m2 + m3 + m4 + m5;
            double average = total / 5;

            System.out.printf("Total marks : %.2f%n", total);
            System.out.printf("Average marks : %.2f%n", average);
        }
        sc.close();
    }
}