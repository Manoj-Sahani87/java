package Practices;
import java.util.Arrays;

public class practice_12 {
        public static void moveZeroes(int[] nums) {
            int pos = 0; // next position for a non-zero number

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[pos] = nums[i];
                    pos++;
                }
            }
            while (pos < nums.length) {   // fill the rest with zeroes
                nums[pos] = 0;
                pos++;
            }
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
    }
}