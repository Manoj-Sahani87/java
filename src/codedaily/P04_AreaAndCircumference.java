package codedaily;

import java.util.Scanner;

public class P04_AreaAndCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;

        if ( r < 0){
            System.out.println("Radius can't be Negative ");
        }else {
            System.out.printf("Area of a circle is : %.2f%n", area);
            System.out.printf("Area of a circumference is : %.2f%n", circumference);
        }
        sc.close();
    }
}