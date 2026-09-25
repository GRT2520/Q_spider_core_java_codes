package Programming_clases;

import java.util.Arrays;
/// Quick sort example
public class Partition {
    static void main(String[] args) {
     int [] a ={7,9,6,10,5,4,2,8};
     int start = 0;
     int end = a.length - 1;
     execution(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

        /// This is one is for stringr

        String s ="24a6bdh825ce";
        char ch[] = s.toCharArray();
        int i =0;
        int j=ch.length - 1;
        while (i<=j){
            while (i<=j && (ch[i]>='0' && ch[i]<='9')) i++;
            while (i<=j && (ch[j]>='a' && ch[i]<='z')) j--;
            if (i<=j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        String result =new String(ch);
        System.out.println(result);
    }
    static void execution(int a[] , int start ,int end){
        if(start >= end){
            return;   ///1.Check single element of sub array
        }
        int pivot = a[end];
        int pivot_Index = end;
        int i = start;
        int j = end-1;

        while (i<=j){
            while (i<=j && a[i] < pivot) i++;
            while (i<=j && a[j] > pivot) j--;

            if (i<=j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        int temp = a[pivot_Index];
        a[pivot_Index] = a[i];
        a[i] = temp; ///2. Partition with respect to pivot[last element]


        execution(a,start,i-1);/// 3. partition from left
        execution(a,i+1,end); /// 4.Partition from right
    }
}
