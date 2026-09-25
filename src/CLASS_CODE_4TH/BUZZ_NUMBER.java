package CLASS_CODE_4TH;

import java.util.Scanner;

public class BUZZ_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = in.nextInt();

        if(num % 7 ==0  || num %10 == 7){
            System.out.println("This number having a buzzzzzz -->" + num);
        }
        else {
            System.out.println("This number have no buzz");
        }
    }
}
