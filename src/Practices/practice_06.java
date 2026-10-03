package Practices;

import java.util.Arrays;

public class practice_06 {
    public static void main(String[] args) {
        int[] original = {10, 30, 30,};

        System.out.println(" Before original: " + Arrays.toString(original));

        int[] copied = Arrays.copyOf(original, 5);

        System.out.println(" After original: " + Arrays.toString(copied));
    }
}