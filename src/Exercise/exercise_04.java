package Exercise;
// write a function which takes in 2 number and return the greater of those

import java.util.Scanner;

public class exercise_04 {
    public static void getGreater(int a, int b){
        if (a > b){
            System.out.println(a + " is Greater then " + b);
        }else{
            System.out.println(b + " is Greater then " + a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        getGreater(a, b);
    }
}