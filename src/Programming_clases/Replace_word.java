package Programming_clases;

public class Replace_word {
    static void main(String[] args) {
       String s ="java programming";
       char oldchar = 'a';
       char newChar = '$';
        System.out.println(sol(s,oldchar,newChar));
    }
    static String sol (String s , char oldchar ,char newchar ){
//        char ch[] = s.toCharArray();
//        for (int i = 0; i <ch.length ; i++) {
//            if (ch[i]==oldchar){
//                ch[i] = newchar;
//            }
//        }
//        return new String(ch); ///It convert array to string that is why we used new String(ch)

        String res ="";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch == oldchar){
                res = res + newchar;
            }
            else {
                res = res + ch;
            }
        }
        return res;
    }
}
