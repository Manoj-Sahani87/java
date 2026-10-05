package Practices;

import java.util.Scanner;

public class practice_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int toLength = 0;

        for (int i = 0; i < size; i++){
            System.out.print("Enter "+ i + " value : ");
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println(toLength);
    }
}