package recurrsion;

import java.util.ArrayList;

public class KTimesMultiples {
    public static void main(String[] args) {
        int num = 3;
        int k = 10;
        multiples(num, k);
    }
    static void multiples(int num, int k){
        if (k==1){
            System.out.print(num+" ");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
         multiples(num, k-1);
         list.add(num*k);
        for (int item:list){
            System.out.print(item+" ");
        }
    }
}
