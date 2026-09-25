package Programming_clases;

public class Merge {
    static void main(String[] args) {
        String s1 = "max";
        String s2 = "value";
        System.out.println(sol(s1 ,s2));
    }
    public static String sol(String s1, String s2){
        int i =0;
        int j =0;
        String res = "";
        while (i < s1.length() && j < s2.length()){
            res = res + s1.charAt(i)+ s2.charAt(j);
            i++;
            j++;
        }
        while (i<s1.length()){
            res =res + s1.charAt(i);
            i++;
        }
        while (j<s2.length()){
            res = res + s2.charAt(j);
            j++;
        }
        return res;
    }
}
