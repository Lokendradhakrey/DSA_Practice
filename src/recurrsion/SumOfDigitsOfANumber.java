package recurrsion;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int num = 458;
        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits(int num){
        if(num<=10){
            return num;
        }
        int sum = 0;
        int digit = sumOfDigits(num/10);
        sum = digit+num%10;
        return sum;
    }
}
