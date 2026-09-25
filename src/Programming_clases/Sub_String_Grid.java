package Programming_clases;

public class Sub_String_Grid {
    static void main(String[] args) {
        sol("malayalam");
    }
    static void sol(String s ){
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <= s.length() ; j++) {
                String  temp = s.substring(i,j);
                System.out.println(temp );
                if (isPallindrome(temp)){
                    System.out.println(temp);
                }
            }
        }
    }
    static boolean isPallindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<1){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
