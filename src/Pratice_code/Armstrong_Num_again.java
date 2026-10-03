package Pratice_code;

import java.util.Scanner;

public class Armstrong_Num_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int temp ;
        int count = 0;
        int sum = 0;
        int original_Number = num;

        temp = num;
        while (temp!=0){
            count++;
            temp = temp /10;
        }

        temp = num;
        while (temp!=0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit , count);
            temp = temp/10;
        }

        if (sum == original_Number){
            System.out.println("It is Armstrong"+ " " + original_Number);
        }
        else {
            System.out.println("Not armstrong number");
        }
    }
}
