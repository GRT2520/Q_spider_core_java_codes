package Pratice_code;

import java.util.Scanner;

public class Panagram_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = in.nextLine();
        System.out.println(execution(s));
    }
    static boolean execution (String sentence){
        boolean [] seen = new  boolean[26];
        int count = 0;

        String result = sentence.toLowerCase();

        for (char c : result.toCharArray()){
            int index = c - 'a';

            if (!seen[index]){
                seen[index] = true;
                count ++;
            }
        }
        return count == 26;
    }
}
