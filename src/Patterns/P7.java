package Patterns;

import java.util.Scanner;

public class P7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();

        // TOP HALF: i goes from n down to 1
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if ( j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = n + 1; k < 2 * n; k++) {
                if ( k == 2 * n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // BOTTOM HALF: i goes from 2 up to n (waist row already printed above)
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = n + 1; k < 2 * n; k++) {
                if (i == 1 || k == 2 * n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("________________________________");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i < j + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = n + 1; k < 2 * n; k++) {
                if ((i + k) <= n * 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // BOTTOM HALF: i goes from 2 up to n (waist row already printed above)
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = n + 1; k < 2 * n; k++) {
                if ((i + k) <= n * 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
