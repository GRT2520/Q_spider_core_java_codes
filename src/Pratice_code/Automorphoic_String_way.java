package Pratice_code;

import java.util.Scanner;

public class Automorphoic_String_way {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println(execution(number) + "is Automorphic");
    }
    static boolean execution(int num){
        long square = num * num;
        String number_str = String.valueOf(num);
        String square_str = String.valueOf(square);
        return square_str.endsWith(number_str);
    }

//    static boolean isduck(int num){
//        int last_digit = 0;
//        String number_str = String.valueOf(num);
//        String last_digit_str = String.valueOf(last_digit);
//        return
//    }
}
