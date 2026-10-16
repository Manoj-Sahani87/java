package codedaily;

import java.util.Scanner;

public class P05_RectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth : ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (length < 0 || breadth < 0) {
            System.out.println("Length & Breadth can't be negative!");
        } else {
            System.out.printf("Area of the rectangle is : %.2f%n", area);
            System.out.printf("Perimeter of the rectangle is : %.2f%n", perimeter);
        }
        sc.close();
    }
}