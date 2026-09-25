package CLASS_CODE_THIRD;

import java.util.function.Predicate;

public class sum {
    static void main(String[] args) {
        Predicate<Integer>  p = sum ::isPrime;
        System.out.println(p.test(15));
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
