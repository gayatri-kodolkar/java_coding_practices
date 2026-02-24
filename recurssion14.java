import java.util.Scanner;

public class recurssion14 {
    static void fact(int i, int num, int sum) {
        if (i == num) {
            sum = sum * num;
            System.out.println(sum);
            return;
        }
        sum = sum * i;
        fact(i + 1, num, sum);
    }

    // static void prime(int i, int count, int num) {
    //     if (count == 2) {
    //         fact(1, num, 1);
    //     } else if (num % i == 0) {
    //         prime(i + 1, count + 1, num);
    //     } else {
    //         prime(i + 1, count, num);
    //     }
    // }

    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.: ");
        int num = sc.nextInt();
        prime(i, count, num);

    }
}
