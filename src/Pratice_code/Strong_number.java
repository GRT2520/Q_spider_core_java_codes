package Pratice_code;

import java.util.Scanner;

public class Strong_number {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int temp = num;
        int sum = 0 ;

        while (temp > 0){
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;

        }
        if (sum == num){
            System.out.println("It is a strong number " + num);
        }
        else {
            System.out.println("Not a strong number" );
        }
    }
}
