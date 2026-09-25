package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_5 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
