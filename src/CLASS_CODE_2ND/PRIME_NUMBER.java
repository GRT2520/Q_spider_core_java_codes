package CLASS_CODE_2ND;

import java.util.Scanner;

public class PRIME_NUMBER {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        int count =0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                count++;
                System.out.println("----> It is Optimus Prime" + count);
            }

        }

    }
}
