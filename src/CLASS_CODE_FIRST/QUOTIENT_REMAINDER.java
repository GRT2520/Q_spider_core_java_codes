package CLASS_CODE_FIRST;

import java.util.Scanner;

public interface QUOTIENT_REMAINDER {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = in.nextInt();
        int quotient = num/10;
        int remainder = num %10;
        System.out.println("Quotient :" + " " +quotient);
        System.out.println("Remainder :" + " `" +remainder);
    }
}
