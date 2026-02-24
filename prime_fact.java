import java.util.*;

public class prime_fact {
    static void fact(int i, int count, int num, int a, int b) {

        if (i == num) {
            if (count == 1) {
                if (a > num) {
                    System.out.println(b);
                    return;
                }
                if (a <= num) {
                    b = b * a;
                    fact(num, 1, num, a+1, b);
                }
            } else if (count > 1) {
                System.out.println("non prime no. ");
            }
            return;
        }
        int sum = 1;
        if (i < num) {
            if (num % i == 0) {
                sum = sum + count;
                fact(i + 1, count + 1, num, a, b);
            } else {
                fact(i + 1, count, num, a, b);
            }
        }
    }

    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int a = 1;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // System.out.print("Enter your no.: ");
        fact(i, count, num, a, b);

    }
}