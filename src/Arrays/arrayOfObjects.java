package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "shark";
        System.out.println(Arrays.toString(str));
    }
}