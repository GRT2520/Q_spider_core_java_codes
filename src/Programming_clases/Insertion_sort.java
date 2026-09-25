package Programming_clases;

import java.util.Arrays;

public class Insertion_sort {
    static void main(String[] args) {
        int arr[] ={12,11,13,5,6,1};
        execution(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void execution(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
