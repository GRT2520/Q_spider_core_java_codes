package CLASS_CODE_THIRD;

import java.util.Scanner;

public class SUM_FACTORIAL_OF_2_FACTORIAL {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n , factorial =1,i,m ;

        System.out.println("Enter the 1st number :");
        n = in.nextInt();

        for ( i = 1; i <=n ; i++) {
            factorial = factorial*i;
        }

        System.out.println("Enter the 2nd number");
        m= in.nextInt();
        for ( i = 0; i <=m ; i++) {
            factorial = factorial*i;
        }
        int result;
        result = m+n;

        System.out.println("Sum of 2 factorial" + result);
    }
}
