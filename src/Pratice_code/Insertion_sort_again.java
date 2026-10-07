package Pratice_code;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort_again {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to sort");
        int num = in.nextInt();
        int [] arr = new int[num];

        System.out.println("Enter " + num + " elements");
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();                    // 2) actually fill the array
        }
        execution(arr);                               // 3) call it separately...
        System.out.println(Arrays.toString(arr));
    }
    static void execution (int [] arr){
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>=key){
                arr[j+1] = arr[j]; j--;
            }
            arr[j+1] = key;
        }
    }
}
