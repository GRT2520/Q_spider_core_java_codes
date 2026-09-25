package CLASS_CODE_2ND;

import java.util.Scanner;

public class SUM_OF_DIGIT {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the digit");
        int num = in.nextInt();

        int sum =0;

        while (num > 0){
            int digit = num%10;
            sum = sum +digit;
            num = num/10;

        }

        System.out.println("Sum of number is" + sum);
    }
}

//WAP to find sum of digit of a number
/*
Where u got stucked u did
num = mum%10
sum = sum


What u fixed is
int digit = num%10;
            sum = sum +digit;
            num = num/10;
            here u intilizzed digit with modulus
            then do sum with digit then eleminate it by /
 */