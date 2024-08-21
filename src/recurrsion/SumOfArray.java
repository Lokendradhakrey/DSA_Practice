package recurrsion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nums = {9,1,5,7};
        int idx = 0;
        System.out.println(sum(nums, idx));
    }

    static int sum(int[] nums, int idx){
        if (idx==nums.length){
            return 0;
        }
        int num = sum(nums, idx+1);

        return num+nums[idx];
    }
}
