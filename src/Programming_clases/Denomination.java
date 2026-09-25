package Programming_clases;

import java.util.Scanner;

public class Denomination {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = in.nextInt();

        int remain = amount;

        int count2000 = 0;
        count2000 = remain / 2000;
        remain = remain % 2000;
        System.out.println("2000" + " x " + count2000);

        int count500=0;
        count500 = remain/500;
        remain = remain % 500;
        System.out.println("500" + " x " + count500);


        int count200 =0;
        count200 = remain/200;
        remain = remain % 200;
        System.out.println("200" + " x " + count200);


        int count100 =0;
        count100 = remain/100;
        remain = remain % 100;
        System.out.println("100" + " x " + count100);
    }
}
