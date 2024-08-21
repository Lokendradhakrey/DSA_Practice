package array;

import java.util.Arrays;

public class SortBinaryArr {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1,1,0,0};
        System.out.println("Array before sorting");
        printArr(nums);
        System.out.println("Array after sorting");
        printArr(sortedArr(nums));
    }
    static void printArr(int[] nums){
        System.out.println(Arrays.toString(nums));
    }
    static int[] sortedArr(int[] nums){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            if (nums[i]==1 && nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i]==0) {
                i++;
            } else if (nums[j]==1) {
                j--;
            }
        }
        return nums;
    }
}
