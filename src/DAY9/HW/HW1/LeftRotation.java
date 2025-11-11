package DAY9.HW.HW1;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int temp = nums[0]; // store first element
            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1]; // shift left
            }
            nums[nums.length - 1] = temp; // move first to last
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("Final Array: " + Arrays.toString(nums));
    }
}
