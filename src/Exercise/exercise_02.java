package Exercise;

import java.util.Scanner;
// Enter 3 number from the user & make a function to print their average.

public class exercise_02 {
    public static void printAverage(int a, int b, int c){
        int average = (a + b + c) / 3;
        System.out.println("Total Average is : " + average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        printAverage(a, b, c);
    }
}