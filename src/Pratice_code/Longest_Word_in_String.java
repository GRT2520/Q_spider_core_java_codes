package Pratice_code;

public class Longest_Word_in_String {
    static void main(String[] args) {
       String s = " This is a Java course guided by Q_spiders";
        System.out.println(execution(s));
    }

    static String execution(String s){
        String longest = "";
        String words [] = s.split(" ");
        for ( String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }

        return longest;
    }
}
