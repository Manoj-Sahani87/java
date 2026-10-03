package Practices;

import java.util.Scanner;

public class practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter " + i + " number : ");
            number[i] = sc.nextInt();
        }
        System.out.print("Enter te number you want to find to search : ");
        int x = sc.nextInt();

        boolean isFound = false;

        for (int i = 0; i < size; i++){
            if (number[i] == x){
                System.out.println(x + " is found at index " + i);
                isFound = true;
            }
        }
        if (isFound == false){
            System.out.println(x + " is not found at array!!");
        }
    }
}