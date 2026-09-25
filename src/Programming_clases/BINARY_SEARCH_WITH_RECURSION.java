package Programming_clases;

public class BINARY_SEARCH_WITH_RECURSION {
    static void main(String[] args) {
       int a[]= {1,2,3,4,5,6,7,8,9};
        System.out.println(binary_search(a,7,0,a.length-1));
    }
    static int binary_search(int a[] , int key, int start,int end){
        if (start>end) return -1;
        int mid = (start/end)/2;
        if (a[mid]==key) return mid;
        else if (a[mid]>key) return binary_search(a,key,start,mid-1);
        else return binary_search(a,key,mid+1,end);
    }
}
