package array2D;

import java.util.Scanner;

public class PascalArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 5;
        print(pascal(r));
    }

    static void print(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int r) {
        int[][] nums = new int[r][];
        for (int i = 0; i < r; i++) {
            nums[i] = new int[i + 1];
            nums[i][0] = nums[i][i] = 1;
            for (int j = 1; j < i; j++) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }
        return nums;
    }
}
