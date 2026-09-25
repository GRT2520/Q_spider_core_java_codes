package Programming_clases;

public class Decryption {
    static void main(String[] args) {
        String s ="efghijklmnopqrstuvwxabcd";
        System.out.println(execution(s,4));
    }
    static String execution(String s , int key){
        char ch[] = s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
          int expected = ch[i]-key;
          if (expected>='a'){
              ch[i]=(char) expected;
          }
          else {
              int used = ch[i] -'a';
              int pending = key-used;
              ch[i]=(char)('z'+1-pending);
          }
        }
        return new String(ch);
    }
}
