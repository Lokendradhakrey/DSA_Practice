package array2D;

public class ReverseArr {
    public static void main(String[] args) {
        int[][] nums = {{1}, {4, 5, 6, 8, 3}, {7, 8}};
        print(nums);
        int[][] ans = reverse(nums);
        print(nums);
    }

    static void print(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] reverse(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i].length - 1;
            int a = 0;
            while (a < b) {
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
