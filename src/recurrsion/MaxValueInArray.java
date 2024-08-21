package recurrsion;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] nums = {5,6,3,7,9,1};
        int idx = 0;
        System.out.println(maxValur(nums, idx));
    }

    static int maxValur(int[] nums, int idx){
        if (idx==nums.length){
            return nums[idx-1];
        }
        int num = maxValur(nums, idx+1);
        if(nums[idx]>num){
            return nums[idx];
        }
        return num;
    }
}
