package array;

public class UniqueEleInArray {
    public static void main(String[] args) {
        int[] nums = {2,5,7,7,2,3,5};
        System.out.println(uniqueEle(nums));
    }
    static int uniqueEle(int[] nums){
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=-1){
                return nums[i];
            }
        }
        return -1;
    }
}
