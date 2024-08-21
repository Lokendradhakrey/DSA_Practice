package array;

public class SumMatrix {
    public static void main(String[] args) {
        long ans = sumMatrix(4, 7);
        System.out.println(ans);
    }
    static long sumMatrix(long n, long q) {
        // code here

        long[][] nums = new long[(int)n][(int)n];
        long count = 0L;

        for(int i=1; i<=nums.length; i++){
            for(int j =1; j<=nums[i].length; j++){
                nums[i-1][j-1] = i+j;
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j =0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<nums.length; i++){
            for(int j =0; j<nums[i].length; j++){
                if(nums[i][j]==q){
                    count++;
                }
            }
        }
        return count;
    }
}
