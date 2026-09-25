package CLASS_CODE_4TH;

import java.util.Scanner;

public class NEON_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        int square = num *num;
        int sum =0;
        int digit;

        while(square >0){
            digit = square%10;
            sum = sum +digit;
            square = square/10;
        }
        if(sum==num){
            System.out.println(num +"Neon");
        }
        else {
            System.out.println("Not neon u moron");
        }


    }
}
