package Pratice_code;

import java.util.Scanner;

public class Revese_Word {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word that u want to reverse it");
        String s = in.nextLine();
        System.out.println(execution(s));
    }
    static String execution (String Sentence){
        String [] words = Sentence.split(" ");
        String result = "";

        for (int w = 0; w < words.length ; w++) {
            String word = words[w];
            String reverse = "";

            for (int i = word.length()-1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            result += reverse;

            if (w != words.length-1){
                result +=" ";
            }
        }
        return result;
    }
}
