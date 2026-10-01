package Arrays;
// Take an array as input from the user.
// Search for a given number x and print the index art which it occurs.
import java.util.Scanner;

public class Array_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++){
            if (number[i] == x){
                System.out.println("X found at index : "+ i);
            }
        }
    }
}