package recurrsion;

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(findGCD(a, b));
    }

    static int findGCD(int a, int b) {
        if (b==0) {
            return a;
        }
        int gcd = findGCD(b, a%b);
        return a*b/gcd;

    }
}
