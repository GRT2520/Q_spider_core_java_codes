package Programming_clases;

public class Vowel_count {
    static void main(String[] args) {
        String s = "this is the java full stack ";
        System.out.println(count(s));
    }

    static int count(String s){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch =='e'|| ch =='i' || ch == 'o'|| ch == 'u' ){
                count ++;
            }
        }
        return count;
    }
}
