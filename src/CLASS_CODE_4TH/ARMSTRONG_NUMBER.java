package CLASS_CODE_4TH;

import java.util.Scanner;

public class ARMSTRONG_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);
        int number;
        int originalNumber;
        int temp;
        int digits;
        int digit;
        int sum;

        System.out.println("enter number");
        number = in.nextInt();

        originalNumber=number;

        digits = 0;
        temp = number;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }


        sum = 0;
        temp = number;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
}


    }
}
