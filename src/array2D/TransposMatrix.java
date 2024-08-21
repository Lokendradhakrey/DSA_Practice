package array2D;

import java.util.Scanner;

public class TransposMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        int r = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        int[][] nums = new int[r][c];
        System.out.println("Enter elements: ");
        takingInput(nums, r, c, sc);
        System.out.println("Array: ");
        print(nums);
        print(transposedMatrix(nums, r, c));
    }

    static void takingInput(int[][] nums, int row, int col, Scanner sc) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
    }

    static void print(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposedMatrix(int[][] nums, int r, int c) {
        for (int i = 0; i <r; i++) {
            for (int j = i; j <c; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }

        }

        return nums;
    }
}
