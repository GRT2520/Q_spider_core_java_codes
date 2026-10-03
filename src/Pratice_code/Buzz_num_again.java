package Pratice_code;

import java.util.Scanner;

public class Buzz_num_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 7==0 || num %10 == 7 ){
            System.out.println("It is buzz");
        }
        else {
            System.out.println("Not buzz");
        }
    }
}
