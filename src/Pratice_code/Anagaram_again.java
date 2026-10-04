package Pratice_code;

import java.util.Scanner;

public class Anagaram_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first word");
        String s1 = in.nextLine();
        System.out.println("Enter the second word");
        String s2 = in.nextLine();

        System.out.println(execution(s1 , s2));
        
    }
    
    static boolean execution (String s1 , String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        int [] score_card = new int[256];

        for (int i = 0; i <s1.length() ; i++) {
            score_card[s1.charAt(i)]++;
            score_card[s2.charAt(i)]--;
        }
        for (int i = 0; i < score_card.length ; i++) {
            if (score_card[i] != 0) return false;
        }
        return true;
    }
}
