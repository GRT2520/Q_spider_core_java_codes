package Pratice_code;

import java.util.Scanner;

public class Frequenct_count_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence to count the number of frequency of a number");
        String s = in.nextLine();

        /// Scoreboard
        int [] a = new int[256];

        /// Start a Loop
        for (int i = 0; i <s.length() ; i++) {
            int index = s.charAt(i);
            a[index]++;
        }
        /// Print a loop
        for (int i = 0; i <a.length ; i++) {
           char ch = (char) i;
           if (a[i]==0) continue;
            System.out.println(ch + " " + a[i]);
        }
    }
}
