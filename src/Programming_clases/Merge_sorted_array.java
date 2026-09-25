package Programming_clases;

import java.util.Arrays;

public class Merge_sorted_array {
    static void main(String[] args) {
        int[] left = {1,2,5,7,8,10,12,14,16,17};
        int [] right = {2,3,4,9,10,11,13,20,21};
        int [] res = new int [left.length + right.length];
        execution(left,right,res);
    }

    static void execution(int [] left , int[] right , int [] result){
        int i =0;
        int j =0;
        int c = 0;
        while (i< left.length && j< right.length) {
            if (left[i] < right[j]) {
                result[c] = left[i];
                i++;
                c++;
            } else {
                result[c] = right[j];
                j++;
                c++;
            }
        }
            while (i< left.length){
                result [ c] = right[i];
                i++;
                c++;
            }
            while (j< right.length){
                result[c] = right[j];
                j++; c++;
            }
            System.out.println(Arrays.toString(result));
        
    }
}
