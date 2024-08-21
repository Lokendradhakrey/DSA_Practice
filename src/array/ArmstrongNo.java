package array;

public class ArmstrongNo {
    public static void main(String[] args) {
        boolean res = isArmstrong(1634);
        System.out.println(res);
    }

    public static boolean isArmstrong(int num) {
        int clone = num;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        num = clone;
        int sum = 0;
        while (num > 0) {
            int temp = 0;
            temp = num%10;

            sum += Math.pow((double) temp, (double) count);
            num /= 10;
        }
        if (sum == clone) {
            return true;
        } else {
            return false;
        }
    }
}
