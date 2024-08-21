package array;

import java.util.Arrays;

public class SmallestAndGreatestValueInArr {
    public static void main(String[] args) {
        int[] nums = {5,9,3,5,7,5,3};
        System.out.println(Arrays.toString(smallestAndGreatest(nums)));
    }
    static int[] smallestAndGreatest(int[] nums){
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            if (nums[i]<smallest){
                smallest = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]>greatest){
                greatest = nums[i];
            }
        }
        return new int[]{smallest, greatest};
    }
}
