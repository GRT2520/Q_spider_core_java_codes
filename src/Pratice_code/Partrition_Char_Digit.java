package Pratice_code;

public class Partrition_Char_Digit {
    static void main(String[] args) {
      execition("\"dfdfds543545zcxdsf23fdtewt\"");

    }

    static void execition(String s){
      String letters = "";
      String digits = "";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
//            if (Character.isLetter(c)){
//                 letters  += c;
//            } else if (Character.isDigit(c)) {
//                digits += c;
//            }  in built method is being used
            if ((c >= 'a' && c <= 'z' ) || (c >= 'A' && c <= 'Z')){
                letters += c;
            }
            else if (c >= '0' && c <= '9') {
                digits += c;
               // manual method is interviewed
            }
        }
        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
    }
}
