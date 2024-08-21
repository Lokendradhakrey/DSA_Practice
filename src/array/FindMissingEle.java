package array;

public class FindMissingEle {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2,7,6};
        System.out.println(missingEle(nums));
    }
    static int missingEle(int[] nums){
        int n = nums.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int sum:nums){
            actualSum += sum;
        }
        return expectedSum-actualSum;
    }
}

