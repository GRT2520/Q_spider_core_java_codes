package CLASS_CODE_4TH;

import java.util.Scanner;

public class SUNNY_NUMBER {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number :");
        double num = in.nextDouble();

        double next = num +1;
        double root = Math.sqrt(next);
        if(root * root == next){
            System.out.println("It is a sunny number");
        }
        else {
            System.out.println("Not a sunny number");
        }
    }
}
