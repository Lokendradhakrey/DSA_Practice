package array2D;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{4,8,9}};
        print(nums);
        print(rotate(nums));

    }
    static void print(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] rotate(int[][] nums){
        for (int i = 0; i <nums.length; i++) {
            for (int j = i; j <nums[i].length; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }

        }

        for (int i=0; i<nums.length; i++){
            int a = 0;
            int b = nums[i].length - 1;
            while (a<b){
              int temp = nums[i][a];
              nums[i][a] = nums[i][b];
              nums[i][b] = temp;
              a++;
              b--;
            }
        }
        return nums;
    }
}
