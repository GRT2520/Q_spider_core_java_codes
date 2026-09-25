package Patterns;

import java.util.Scanner;

public class P3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i+j==n+1 || j== n || i==n ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
