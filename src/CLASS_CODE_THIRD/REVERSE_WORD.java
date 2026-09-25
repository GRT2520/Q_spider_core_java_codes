package CLASS_CODE_THIRD;

import java.util.Scanner;

public class REVERSE_WORD {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Orginal_word , Reversed_word;
        int n , i;

        System.out.println("Enter the word ;");
        Orginal_word = in.nextLine();
        n = Orginal_word.length();
        Reversed_word="" ;

        for (i = n -1; i >=0 ; i--) {
            Reversed_word = Reversed_word + Orginal_word.charAt(i);
        }
        System.out.println("Ur reversed word was :" + Reversed_word) ;
    }
}
