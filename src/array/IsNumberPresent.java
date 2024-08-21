package array;

import java.util.Scanner;

public class IsNumberPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] frequencyArr = makeFrequencyArr(nums);
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while (q>0){
            System.out.println("Enter a query: ");
            int x = sc.nextInt();
            if (frequencyArr[q]>x){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }


    }

    static int[] makeFrequencyArr(int[] nums){
        int[] freq = new int[100005];
        for (int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        return freq;
    }
}
