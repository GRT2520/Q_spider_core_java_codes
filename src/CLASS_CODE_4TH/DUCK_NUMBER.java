package CLASS_CODE_4TH;

import java.util.Scanner;

public class DUCK_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numebr");
        int num = in.nextInt();
         boolean truth = false;
        int temp = num;
         num = num/10;
         int digit;

         while (temp > 0){
             digit = temp%10;
             if(digit == 0){
                 truth = true;

             }
             temp = temp/10;

         }
        if (truth == true){
            System.out.println(num+"It is a duck number");
        }
        else {
            System.out.println("It is not a duck number");
        }
    }
}
