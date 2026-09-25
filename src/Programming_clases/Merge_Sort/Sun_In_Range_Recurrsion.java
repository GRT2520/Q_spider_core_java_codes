package Programming_clases.Merge_Sort;

public class Sun_In_Range_Recurrsion {
    static void main(String[] args) {
        int res = solution(6,11);
        System.out.println(res);
    }
    static int solution(int n1 , int n2){
//        int sum =0;
        if (n1<=n2) return n1+solution(n1 +1 ,n2);
        return 0;
    }

}
