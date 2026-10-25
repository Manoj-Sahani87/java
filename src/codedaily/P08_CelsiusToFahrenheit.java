package codedaily;

import java.util.Scanner;

public class P08_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        double c = sc.nextDouble();

        double fahrenheit = (c * 9.0 / 5 + 32);

        System.out.printf("Fahrenheit value is : %.2f%n" , fahrenheit);
        sc.close();
    }
}