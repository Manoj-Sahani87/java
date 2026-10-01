package Arrays;

import java.util.Scanner;

public class Array_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter number : ");
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < number.length - 1; i++){
            if (number[i] > number[i + 1]){
                isAscending = false;
            }
        }
        if (isAscending){
            System.out.println("The Array is Sorted in Ascending order");
        }else {
            System.out.println("The Array is not Sorted in Ascending order");
        }
    }
}