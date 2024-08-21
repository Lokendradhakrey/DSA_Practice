package array;

public class IsArraySort {
    public static void main(String[] args) {
        int[] nums = {2,4,8,8,9};
        boolean ans = checkArrSorting(nums);
        System.out.println(ans);
    }
    static boolean checkArrSorting(int[] nums){
        for (int i=1; i<nums.length; i++){
            if (nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
