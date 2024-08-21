package array;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArr(int[] nums){
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {5,51,5,7,6,1,3};
        reverseArr(nums);
    }
}
