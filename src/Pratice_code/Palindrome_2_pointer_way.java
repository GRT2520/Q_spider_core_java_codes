package Pratice_code;

import java.util.Scanner;

public class Palindrome_2_pointer_way {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = in.nextLine();

        int left =0 ;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            // Compare characters at both ends (case-insensitive)
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                isPalindrome = false;
                break; // Stop immediately if mismatch found
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
    }

