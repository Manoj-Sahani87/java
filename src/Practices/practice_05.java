package Practices;

import java.util.Arrays;

public class practice_05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 8};
        int[] arr3 = {1, 2, 3};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
    }
}