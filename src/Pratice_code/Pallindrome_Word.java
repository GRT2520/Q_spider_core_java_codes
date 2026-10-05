package Pratice_code;

import java.util.Scanner;

public class Pallindrome_Word {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence to check palindrome or not");
        String word = in.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)){
            System.out.println(word + " is Palindrome");
        }
        else {
            System.out.println(word + " not a palindrome");
        }
    }
}
