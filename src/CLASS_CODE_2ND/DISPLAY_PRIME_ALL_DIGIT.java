package CLASS_CODE_2ND;

import java.util.Scanner;

public class DISPLAY_PRIME_ALL_DIGIT {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();

        while (0 < num){
            int count = 0;
            int digit = num%10;
            for (int i = 1; i <=digit ; i++) {
                if (digit%i==0){
                   count ++;
                }
            }
            if (count ==2){
                System.out.println(digit);
            }
            num = num/10;
        }
    }
}
