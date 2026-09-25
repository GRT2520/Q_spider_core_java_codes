package CLASS_CODE_4TH;

import java.util.Scanner;

public class SPY_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the number");
        int num = in.nextInt();

        int digit = 0;
        int sum =0;
        int product = 1;

        while (num > 0){
            digit = num %10;
            sum = sum + digit;
            product = product * digit;
            num = num/10;

        }
        if(sum == product){
            System.out.println("It is a spy in the number verse eleminate him");
        }

        else {
            System.out.println("U are not spy u are safe number soldier");
        }

    }
}
