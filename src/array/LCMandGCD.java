package array;

import java.util.Arrays;

public class LCMandGCD {
    public static void main(String[] args) {
        Long[] ans = lcmAndGcd(12L,0L);
        System.out.println(Arrays.toString(ans));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here

        Long min = Math.min(A, B);
        Long max = Math.max(A, B);
        Long gcd = 0L;
        while(min!=0){
            Long rem = max%min;
            max = min;
            min = rem;
        }
        gcd = max;

        Long lcm = (A*B)/gcd;
        return new Long[]{lcm, gcd};

    }
}
