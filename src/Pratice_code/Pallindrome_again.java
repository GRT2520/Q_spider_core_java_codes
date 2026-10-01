package Pratice_code;

import java.util.Scanner;

public class Pallindrome_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = in.nextInt();

        int rev = 0;
        int temp = num ;
        while (num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == temp){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
