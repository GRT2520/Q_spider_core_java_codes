package Pratice_code;

import java.util.Scanner;

public class First_repating_characters_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = in.nextLine();
        System.out.println(execution(s));
    }

    static char execution(String sentence){
        int [] frequency = new int[256];

        for (int i = 0; i <sentence.length() ; i++) {
            char c = sentence.charAt(i);
            frequency[c]++;
        }
        for (int i = 0; i <sentence.length() ; i++) {
            char c = sentence.charAt(i);
             if (frequency[c] > 1) return c;
        }
        return '\0';
    }
}
