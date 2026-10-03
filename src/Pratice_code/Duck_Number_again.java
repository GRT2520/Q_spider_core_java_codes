package Pratice_code;

import java.util.Scanner;

public class Duck_Number_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int temp = num ;
        boolean flag = false;

        while (temp > 0){
            int digit = temp % 10 ;
            if (digit == 0){flag = true;}
            temp /= 10;
        }
        if (flag == true){
            System.out.println("It is a Duck Number");
        }
        else {
            System.out.println("Not a Duck Number");
        }
    }
}
