package Pratice_code;

public class Frequency_Counter_First_repeating_Cahracter {
    static void main(String[] args) {
        String s = "hello";
        System.out.println(execution(s));
    }
    static char execution (String s){
        int [] arr = new int[256];

        // Counting
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            arr[c]++;
        }

        //Finding
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (arr[c] > 1){
                return c;
            }
        }
        return '\u0000';
    }
}
