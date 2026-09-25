package CLASS_CODE_5TH;

import java.util.Scanner;

public class PATTERN_1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n ,m;
        n = in.nextInt();
        m = in.nextInt();
        for (int i =1; i <= n; i++){
            for (int j = 1; j <=m ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
