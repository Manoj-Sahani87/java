package Exercise;
// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class exercise_05 {
    public static double printCircumference(double r){
        return 2 * 3.14 * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = sc.nextDouble();

        System.out.println("The circumference is : " + printCircumference(r));
    }
}