package CLASS_CODE_2ND;

import java.util.Scanner;

public class COUNT_DIGIT {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();
        int count =0;
        while (num>0){
             num = num/10;
             count = count + 1;

        }
        System.out.println(count);
    }
}
//WAP TO COUNT THE NUMBER OF DIGIT

/*
first take count =0

then go to while loop
 */