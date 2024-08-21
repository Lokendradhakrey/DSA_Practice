package array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {4,5,8,7,3,2};
        System.out.println(secondLargestEle(nums));
    }
    static int secondLargestEle(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if (nums[i]>largest){
                largest = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]==largest){
                nums[i]= Integer.MIN_VALUE;
            }
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
