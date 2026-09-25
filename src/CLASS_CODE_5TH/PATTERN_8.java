package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_8 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter stars");
        int n = in.nextInt();

        int count = 1;


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print( " " + count);
                count++;
            }
            System.out.println();
        }
    }
}
