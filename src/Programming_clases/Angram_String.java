package Programming_clases;

public class Angram_String {
    static void main(String[] args) {
        String s1 = "aabbccdd" +
                "ef";
        String s2 = "abcdabcdef";
        System.out.println(is_Anagram(s1,s2));
    }
    static boolean is_Anagram(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        int a[] = new int [256];
        for (int i = 0; i <s1.length() ; i++) {
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=0){
                return false;
            }
        }
        return true;
    }
}
