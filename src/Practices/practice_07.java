package Practices;

import java.util.Arrays;

public class practice_07 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 50, 60};

        int index = Arrays.binarySearch(num, 50);

        System.out.println("50 index is : " + index);
    }
}