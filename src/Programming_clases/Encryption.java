package Programming_clases;

public class Encryption {
    static void main(String[] args) {
        System.out.println(encrypt("abcdefghijklmnopqrstwxyz",4));
    }
    static String encrypt(String s, int key){
        char ch [] = s.toCharArray();
        for (int i = 0; i < ch.length ; i++) {
            char temp = ch[i];
            int expected = temp +key;

            if (expected <= 'z'){
                ch[i]=(char)expected;
            }
            else {
                int used = 'z'-temp;
                int pending = key-used;
                ch[i] = (char) ('a'-1+pending);
            }
        }
        return new String(ch);
    }
}
