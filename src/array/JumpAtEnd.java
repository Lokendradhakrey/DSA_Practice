package array;

public class JumpAtEnd {
    public static void main(String[] args) {
      int[] nums = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
      int n = nums.length;
        System.out.println(minJumps(nums, n));
    }

    static int minJumps(int[] arr, int n) {
        // your code here
        int temp = arr[1];
        int count = 1;
        if(arr[0]<=0){
            return -1;
        }
        for(int i=0; i<n; i++){
            if(temp<n){
                temp = arr[temp+i];
                count++;
            }
            if (temp>=arr[n-1]){
                return count;
            }
        }
        return count;
    }
}
