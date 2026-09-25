package Programming_clases;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class Panagram {
    static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // true
        System.out.println(checkIfPangram("leetcode")); // false
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26]; // one slot for each letter a-z
        int count = 0;

        for (char c : sentence.toCharArray()) {
            int index = c - 'a'; // convert letter to index (a=0, b=1, ... z=25)
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }

        return count == 26;
    }
}


/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */