package recurrsion;

public class PrintArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        print(nums,0);
    }
    static void print(int[] nums, int idx){
        if (idx == nums.length){
            return;
        }
        System.out.print(nums[idx]+" ");
        print(nums, idx + 1);
    }
}
