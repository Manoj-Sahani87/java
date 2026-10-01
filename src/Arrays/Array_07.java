package Arrays;
// Find the maximum & minimum number in an array of integers.
import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number : ");
            number[i] = sc.nextInt();
        }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i< number.length; i++) {
                if (number[i] > max) {
                    max = number[i];
                }
                if (number[i] < min) {
                    min = number[i];
                }
            }
                System.out.println("Maximum number is : " + max);
                System.out.println("Minimum number is : " + min);
    }
}