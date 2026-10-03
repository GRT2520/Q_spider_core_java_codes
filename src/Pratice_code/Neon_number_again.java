package Pratice_code;

import java.util.Scanner;

public class Neon_number_again {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();
        int sum =0;
        int square = num * num ;

        while(square > 0){
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum == num){
            System.out.println("Neon number ----> Yes " + num);
        }
        else {
            System.out.println("Not neon");
        }
    }
}
