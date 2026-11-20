package Pratice_code;

public class Character_Frequency_String {
    static void main(String[] args) {
        String s = "hello my friends && long time no see ";
        execution(s);
    }
    static void execution(String s){
        int [] arr = new int[256];
        // Counting loop
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            arr[c]++;
        }
        // Printing loop
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0){
                System.out.println((char)i + ": " + arr[i] );
            }
        }
    }
}
