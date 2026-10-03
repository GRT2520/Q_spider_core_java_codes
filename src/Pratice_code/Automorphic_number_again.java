package Pratice_code;

import java.util.Scanner;

public class Automorphic_number_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int square = num * num ;
        int temp = num;
        int count =0;


        while (temp > 0){
            count++;
            temp = temp/10;
        }

        int power = (int)Math.pow(10 , count);
        int lastDigit = square % power ;

        if (lastDigit == num){
            System.out.println("Automorphic number");
        }
        else {
            System.out.println("Not Automorphic number");
        }
    }
}
