package Exercise;
// Two number are entered by the user, x and n. Write a function to
// find the value of one number raised to the power of another.
import java.util.Scanner;

public class exercise_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int n = sc.nextInt();

        int result = 1;
        for (int i = 0; i < n; i++){
            result = result * x;
        }
        System.out.println("X to the power n is : "+ result);
    }
}