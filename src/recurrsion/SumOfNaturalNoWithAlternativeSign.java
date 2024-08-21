package recurrsion;

public class SumOfNaturalNoWithAlternativeSign {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n==1){
            return n;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }else {
            return sum(n-1)+n;
        }

    }
}
