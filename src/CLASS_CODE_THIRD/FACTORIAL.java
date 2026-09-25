package CLASS_CODE_THIRD;

import java.util.Scanner;

public class FACTORIAL {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , factorial =1,i;

        System.out.println("Enter the number :");
        n = in.nextInt();

        for ( i = 1; i <=n ; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of this number is: " +factorial);
    }
}
