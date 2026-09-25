package CLASS_CODE_2ND;

import java.util.Scanner;

public class SUM_EVEN_ODD_DIGIT {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();

        int even_sum =0;
        int odd_sum = 0;

        while (num>0){
            int digit = num%10;
            if (digit%2==0){
                even_sum = even_sum + digit;
                System.out.println(digit + "----> even");
            }
            else {
                odd_sum = odd_sum+digit;
                System.out.println(digit + "-----> odd");
            }
            num = num/10;
        }

        System.out.println("Sum of even digit" + even_sum);
        System.out.println("sum  of odd digit" + odd_sum);
    }
}
