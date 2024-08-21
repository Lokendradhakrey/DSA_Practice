package array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5};
        System.out.println("Array before sorting");
        printArr(nums);
        System.out.println("Array after sorting");
        int[] ans = prifixSum(nums);
        printArr(ans);
    }
    static void printArr(int[] nums){
        System.out.println(Arrays.toString(nums));
    }

    static int[] prifixSum(int[] nums){

        for (int i=1; i<nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

}
