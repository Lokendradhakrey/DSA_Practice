package array;

import java.util.Arrays;

public class KthSmallestAndGreatest {
    static int[] kathIndex(int[] array, int k) {
        Arrays.sort(array);
        int ans[] = { array[(k - 1)], array[(array.length - k)] };
        return ans;

    }

    public static void main(String[] args) {
        int[] array = {5,2,7,2,4,8};
        int k = 3;
        int[] ans = kathIndex(array, k);
        System.out.println("\n " + k + "th Smallest element : " + ans[0]);
        System.out.println(" " + k + "th Largest element  : " + ans[1]);

    }
}
