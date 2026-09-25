package CLASS_CODE_FIRST;

import java.util.Scanner;

public class DISPLAY_ALL_DIGIT {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = in.nextInt();

        while (n>0){
            int digit = n%10;
            System.out.println(digit);
            n = n/10;
        }
    }
}
//WAP to display all the digit of a number