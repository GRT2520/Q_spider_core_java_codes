package Patterns;

import java.util.Scanner;

public class P4 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j>n){
                    System.out.print(i+" " );
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            int k =1;
            for (int j = 1; j <=n ; j++) {
                if (i+j >n){
                    System.out.print(k +" ");
                    k++;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            int k =n;
            for (int j = 1; j <=n ; j++) {
                if (i+j >n){
                    System.out.print(k +" ");
                    k--;
                }
                else {
                    System.out.print("  ");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
