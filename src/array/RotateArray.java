package array;

import java.util.Arrays;

public class RotateArray {
    static int[] rotatedArr(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k <= 0) {
            return nums;
        }
        reverseArr(n - k, n - 1, nums);
        reverseArr(0, n - k - 1, nums);
        reverseArr(0, n - 1, nums);
        return nums;
    }

    static void reverseArr(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 3, 4, 7, 8, 2};
        int k = 54;
        int[] res = rotatedArr(nums, k);
        System.out.println(Arrays.toString(res));
    }
}
