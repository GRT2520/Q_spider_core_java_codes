package Patterns;

import java.util.Scanner;

public class P2 {
        static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = in.nextInt();

            for (int i = 0; i <n; i++) {
                for (int j = 0; j <n ; j++) {
                    if (i+j>=n-1){
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

