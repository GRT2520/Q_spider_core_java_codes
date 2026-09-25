package Programming_clases;

public class Frequency_count {
    static void main(String[] args) {
        frequency("This is java full stack");
    }

    static void frequency(String s){
        int a[] = new  int [256];
        for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i);
                a[index]++;
        }
        for (int i = 0; i <a.length ; i++) {
            char ch = (char)i;
            if (a[i]==0) continue;;
            System.out.println(ch + " " + a[i]);
        }
    }
}
