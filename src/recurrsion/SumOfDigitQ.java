package recurrsion;

public class SumOfDigitQ {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }

    static long sumOfSeries(long n) {
        // code here
        if (n == 1) {
            return 1L;
        }
        return n+sumOfSeries(n-1);
    }
}
