package array2D;

import java.util.Scanner;

public class SumOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();
        System.out.println("Enter columns: ");
        int col = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[][] num1 = new int[row][col];
        int[][] num2 = new int[row][col];
        int[][] num3 = new int[row][col];
        takingInput(num1, row, col, sc);
        takingInput(num2, row, col, sc);
        takingInput(num3, row, col, sc);
        System.out.println("sum of all arrays: ");
        int[][] sumArr = sumOfAllArr(num1, num2, num3);
        printArr(sumArr);

    }

    private static int[][] sumOfAllArr(int[][] num1, int[][] num2, int[][] num3) {
        int[][] sum = new int[num1.length][num1[0].length];
        for (int i =0; i<num1.length; i++){
            for (int j=0; j<num1[i].length; j++){
                sum[i][j] = num1[i][j]+num2[i][j]+num3[i][j];
            }
        }
        return sum;
    }

    static void takingInput(int[][] nums, int row, int col, Scanner sc){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                nums[i][j]=sc.nextInt();
            }
        }
    }
    static void printArr(int[][] nums){
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
