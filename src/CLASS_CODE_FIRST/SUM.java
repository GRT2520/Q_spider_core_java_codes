package CLASS_CODE_FIRST;
import java.util.Scanner;

public class SUM {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first digit");
        int a = in.nextInt();

        System.out.println("Enter second digit");
        int b = in.nextInt();

        int sum = a+b;
        System.out.println("ur sum was"+" " + sum);
    }
}
