package CLASS_CODE_4TH;

import java.util.Scanner;

public class AUTOMORPHIC_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();

        int count=0;
        int temp = num;
        int square = num * num;
        int lastDigits;
        while (temp>0){
            count ++;
            temp = temp/10;
        }
        int power = (int) Math.pow(10,count);
        lastDigits = square % power;

        if (lastDigits==num){
            System.out.println("It is an automorphic");
        }
        else {
            System.out.println("It is not an automorphic");
        }


    }
}
