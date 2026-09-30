package Exercise;

import java.util.Scanner;

// Write a function to print the sum of all odd numbers from 1 to n
public class exercise_03 {
    public static void printSum(int n){
        int sum = 0;
        for (int i = 1; i<= n; i++){
            if (1 % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        printSum(n);
    }
}