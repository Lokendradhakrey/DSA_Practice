package array2D;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();
        System.out.println("Enter columns: ");
        int col = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[][] num = new int[row][col];
    }

    static void printSpiral(int[][] nums, int r, int c){
        int leftCol = 0, rightCol = r-1, topRow = 0, bottomRow = c-1;
        
    }
}
