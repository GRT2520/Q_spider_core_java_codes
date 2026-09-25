package CLASS_CODE_FIRST;

import java.util.Scanner;

public class EVEN_OR_ODD {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();

        if(a%2==0){
            System.out.println("even");
        }

        else {
            System.out.println("odd");
        }

    }
}
