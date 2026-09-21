package Conditional_statement;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Its a EVEN");
        }else{
            System.out.println("Its a ODD");
        }
    }
}
