package Pratice_code;

import java.util.Scanner;

public class Fibbonacci_again {
    static void main(String[] args) {
     int first =0;
     int second = 1;
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println(first);
            int next = first + second;
            first= second;
            second = next;
        }
    }
}
