package CLASS_CODE_THIRD;

import java.util.Scanner;

public class SUM_FACTORAIAL_DIGIT {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();;

        int sum=0;

        while (num>0){
            int rem = num%10;
            int fact = 1;
            for (int i = 1; i <=rem ; i++) {
                fact= fact*i;
            }
            sum = sum + fact;
            num= num/10;
        }
        System.out.println("the sum of factorial "+sum);
    }
}
