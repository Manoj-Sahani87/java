package Conditional_statement;

import java.util.Scanner;

public class equal_or_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("First and second numbers are equal");
        }else if (a > b){
            System.out.println("First number is Greater");
        }else{
            System.out.println("Second number is Greater");
        }
    }
}