package CLASS_CODE_FIRST;

import java.util.Scanner;

public class EVEN_AND_ODD_SUM {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num");
        int num = in.nextInt();

        int sum_even = 0;
        int sum_odd =0;

        for (int i = 0; i <num ; i++) {
            if(i%2==0){
                sum_even = sum_even+i;
            }
            else{
                sum_odd = sum_odd + i;
            }

            System.out.println("sum of even" + sum_even);
            System.out.println("sum of odd" + sum_odd);
        }
    }
}
