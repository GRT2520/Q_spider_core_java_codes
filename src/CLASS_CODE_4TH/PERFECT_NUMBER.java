package CLASS_CODE_4TH;

import java.util.Scanner;

public class PERFECT_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);
        int i , n;
        int sum;

        System.out.println("Enter th number");
        n = in.nextInt();
        sum = 0;

        for (i = 1; i <=n/2 ; i++) {
            if(n%i==0){
                sum = sum +i;
            }
        }
        if(sum==n){
            System.out.println(n + "It is a perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
}
