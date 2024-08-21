package array2D;

import java.util.Scanner;

public class Multple2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("r1: ");
        int r1 = sc.nextInt();
        System.out.println("c1: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        takingInputs(arr1, sc);
        printArr(arr1);
        System.out.println("r2: ");
        int r2 = sc.nextInt();
        System.out.println("c2: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        takingInputs(arr2, sc);
        printArr(arr2);
        System.out.println();
        printArr(resultArr(arr1, r1, c1, arr2, r2, c2));


    }

    static void takingInputs(int[][] arr, Scanner sc) {
        System.out.println("Enter array's elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] resultArr(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Dimensions of matrices are not applicable!");
        }
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return res;
    }
}
