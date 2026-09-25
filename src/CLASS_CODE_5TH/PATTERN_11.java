package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_11 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        char ch = 'a';

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i ; j++) {
//                System.out.print((char) (ch +j));
                System.out.println((char) (ch + (i-1)));
            }
            System.out.println();
        }
    }
}
