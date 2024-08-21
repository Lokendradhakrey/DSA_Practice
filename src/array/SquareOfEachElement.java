package array;

import java.util.Arrays;

public class SquareOfEachElement {
    public static void main(String[] args) {
        int[] nums = {-11,-9,-2,1,5,6,7};
        System.out.println("Array before sorting");
        printArr(nums);
        System.out.println("Array after sorting");
        int[] res = reveseArr(sortedArr(nums));
        printArr(res);
    }
    static void printArr(int[] nums){
        System.out.println(Arrays.toString(nums));
    }

    static int[] sortedArr(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int[] ans = new int[nums.length];
        int k =0;
        while (i<=j){
            if (nums[i]*nums[i]>nums[j]*nums[j]){
                ans[k++] = nums[i]*nums[i];
                i++;
            }else {
                ans[k++] = nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
    static int[] reveseArr(int[] nums){
        int i =0;
        int j=nums.length-1;
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
