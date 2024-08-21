package array;

import java.util.Arrays;

public class SortOddEven {
    public static void main(String[] args) {
        int[] nums = {4,5,9,7,2,5,3,1,7,20,102};
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

        while(i<j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i]%2==0) {
                i++;
            } else if (nums[j]%2!=0) {
                j--;
            }
        }

        return nums;
    }
}
