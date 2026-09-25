package Programming_clases;

public class Reverse_word_ {
    static void main(String[] args) {
        System.out.println(mirrorSentence("This is Java full stack course"));
    }
    static String mirrorSentence(String sentence) {
        String[] words = sentence.split(" "); // break into words
        String result = "";

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            String reversedWord = "";

            // reverse each individual word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            result += reversedWord;
            if (w != words.length - 1) {
                result += " "; // space between words, not after the last one
            }
        }
        return result;
    }
}
