package Pratice_code;


import java.util.Scanner;

public class Reverse_sentence {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = in.nextLine();
        System.out.println(execution(s));
    }

    static String execution (String sentence){
        String [] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reversed += words[i];
            if (i != 0){
                reversed += " ";
            }
        }
        return reversed;
    }
}
