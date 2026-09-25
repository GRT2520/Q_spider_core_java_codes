package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_9 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n  = in.nextInt();

        for(int i = 1; i <= n; i++){
            // print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
