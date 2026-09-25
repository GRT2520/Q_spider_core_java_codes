package CLASS_CODE_THIRD;

import java.util.Scanner;

public class FACTORS_OF_NUMBER {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the number");
        n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println("The factor of this number" + i);
            }
        }
    }
}
