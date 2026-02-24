import java.util.*;

class febonacciInRange {
    public static void main(String[] args) {// 1 1 2 3 5 8 13
        int prev1 = 1;
        System.out.print(prev1 + " ");
        int prev2 = 1;
        System.out.print(prev2 + " ");
        int sum = 0;
        for (int i = 2; i < 10; i++) {
            if (sum <= 10) {
                sum = prev1 + prev2;
                System.out.print(sum + " ");
                prev1 = prev2;
                prev2 = sum;
            }
        }
    }
}