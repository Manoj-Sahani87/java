package Practices;

import java.util.Arrays;

public class practice_02 {
    public static void main(String[] args) {
        int[] num = {23, 99, 68, 52};

        System.out.println("Before Sorted array : " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("After Sorted array : " + Arrays.toString(num));

        System.out.print("Descending Order : [");
        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}