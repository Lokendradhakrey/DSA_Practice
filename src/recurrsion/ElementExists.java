package recurrsion;

public class ElementExists {
    public static void main(String[] args) {
        int[] nums = {4,6,8,9,3};
        int k = 8;
        int idx = 0;
        System.out.println(elementExist(nums, k, idx));
    }

//    static boolean elementExist(int[] nums, int k, int idx){
//        if(idx>=nums.length){
//            return false;
//        }
//        if(nums[idx]==k) return true;
//        return elementExist(nums, k, idx + 1);
//    }

    static int elementExist(int[] nums, int k, int idx){
        if(idx>=nums.length){
            return -1;
        }
        if(nums[idx]==k) return idx;
        return elementExist(nums, k, idx + 1);
    }
}
