package Pratice_code;

public class Replace_A_String {
    static void main(String[] args) {
        String s = "Jeve Program";
        char org = 'e';
        char replace = 'a';
        System.out.println(execution(s,org,replace));
    }
    static String execution(String s , char orginal , char replaced ){
        char [] c_arr= s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            char c= c_arr[i];
            if (orginal == c ){
                c_arr [i] = replaced;
            }
        }
        return new String(c_arr);

        // alternative way is
        /*
        s = s.replace(orginal, replaced);
return s;
         */

    }


}
