package CLASS_CODE_THIRD;

import java.util.Scanner;

public class PALLINDROME {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();
        int rev =0;
        int temp = num;
        while (num >0){
            int rem = num%10;
            rev = rev *10+rem;
            num = num/10;

        }
        if (rev == temp){
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
