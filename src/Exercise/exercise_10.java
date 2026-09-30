package Exercise;
// Write a function that calculates the greatest Common Divisor of 2 number
import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a  = sc.nextInt();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();

        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD is : " + b);
    }
}