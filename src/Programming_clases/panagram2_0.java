package Programming_clases;

public class panagram2_0 {
    static void main(String[] args) {
        System.out.println(is_panagram("thequickbrownfoxjumpsoverthelazydog")); // true
        System.out.println(is_panagram("leetcode")); // false
    }
    static  boolean is_panagram(String s){
        int a [] = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            int index = s.charAt(i) - 'a';
            a[index]++;
        }
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == 0){
                return false;
            }
        }
        return true;
    }
}
