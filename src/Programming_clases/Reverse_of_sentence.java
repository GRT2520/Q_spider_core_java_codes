package Programming_clases;

public class Reverse_of_sentence {
    static void main(String[] args) {
          String sentence ="This is java full stack";
        System.out.println(reverseSentence(sentence));
    }


//    static String reverseSentence(String sentence) {
//        String reversed = "";
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            reversed += sentence.charAt(i);
//        }
//        return reversed;
//    }
static String reverseSentence(String sentence) {
    String[] words = sentence.split(" "); // break sentence into words
    String reversed = "";

    for (int i = words.length - 1; i >= 0; i--) {
        reversed += words[i];
        if (i != 0) {
            reversed += " "; // add space between words, not after the last one
        }
    }
    return reversed;
}

}
