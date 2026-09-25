package CLASS_CODE_FIRST;

import java.util.Scanner;

public class SUM_NATURAL {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter n number :");
        n = in.nextInt();

//by using for loop
        for (int i = 1; i < n; i++) {
            System.out.println(i +"");
        }

//        by using while loop
        int i =1;
        while (i<=n){
            System.out.println(i);
            i = i+1;
        }

    }
}
