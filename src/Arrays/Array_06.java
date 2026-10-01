package Arrays;
// Take an array of name as input from the user and print them on the screen.

import java.util.Scanner;

public class Array_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();

       String name[] = new String[size];

       for (int i = 0; i < size; i++){
           System.out.print("Enter name : ");
           name[i] = sc.next();
       }
       for (int i = 0; i < name.length; i++){
           System.out.println("Name "+ (i + 1) + " is : " + name[i]);
       }
    }
}