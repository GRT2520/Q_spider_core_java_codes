package Patterns;

import java.util.Scanner;

public class P6 {
    static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
      int n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
               if (i+j>n){

                   System.out.print("* ");
               }
               else {
                   System.out.print("  ");
               }
            }
           // System.out.println();
            for (int k =n+1 ; k <2*n ; k++) {
                if ((i+n)>k){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i+j==n+1 || i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            // System.out.println();
            for (int k =n+1 ; k <2*n ; k++) {
                if (i+n ==k+1 || i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i<j+1){

                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int k =n+1 ; k <2*n ; k++) {
                if ((i+k)<=n*2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------");
        for (int i = 1; i <= n; i++) {
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
    }
}
