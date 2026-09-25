package Programming_clases;

public class First_Repeating_Character {
    static void main(String[] args) {
        String sentence = "java programming";
        char result = firstRepeatingChar(sentence);
        System.out.println("First repeating character: " + result);
    }
    static char firstRepeatingChar(String sentence) {
        int[] freq = new int[256]; // covers all ASCII characters

        // Step 1: count frequency of every character
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            freq[c]++;
        }

        // Step 2: scan left to right, return first char with count > 1
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (freq[c] > 1) {
                return c;
            }
        }

        return '\0'; // no repeating character found
    }
}
