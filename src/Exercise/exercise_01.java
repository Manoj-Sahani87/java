package Exercise;
// Enter 3 number from the user & print their average.
import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a  = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b  = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c  = sc.nextInt();

        int average = ( a + b + c) / 3;
        System.out.println("Total average is : "+ average);
    }
}