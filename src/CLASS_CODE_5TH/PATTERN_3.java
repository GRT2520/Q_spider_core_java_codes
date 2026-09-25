package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of star that u want ");
        int n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
