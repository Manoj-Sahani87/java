package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        // for each loop
////        for (int num : arr) { // for every element in array, print the element
////            System.out.print(num + " "); // here num represents element of the array
//        }
    }
}