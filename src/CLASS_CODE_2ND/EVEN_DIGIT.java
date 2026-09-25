package CLASS_CODE_2ND;

import java.util.Scanner;

public class EVEN_DIGIT {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the digit :"+ " ");
        int num = in.nextInt();
        int sum =0;
        while (num>0){
            int digit = num%10;
            if (digit%2==0){
                System.out.println(digit);
            }
//            System.out.println(digit);
            num = num/10;
        }
    }
}
//WAP to find the even digit of number