package CLASS_CODE_FIRST;

import java.util.Scanner;

public class SUM_N_NATURAL {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.println("Enter the n number");
        n= in.nextInt();

        int sum =0;

        for (int i = 0; i <=n ; i++) {
            sum = sum +i;

        }
        System.out.println(sum);
    }
}
