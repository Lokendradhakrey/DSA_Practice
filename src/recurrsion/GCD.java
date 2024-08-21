package recurrsion;

public class GCD {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println(findGCD(a, b));
    }

    static int findGCD(int a, int b) {
        if (b==0) {
            return a;
        }
        return findGCD(b, a%b);

    }
}
