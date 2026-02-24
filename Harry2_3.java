import java.util.Scanner;

public class Harry2_3 {
    public static void main(String[] args) {
        int a = 30;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (a > num) {
            System.out.println("given no. greater than user entered no.");
        } else {
            System.out.println("given no. not greater than user entered no.");
        }
    }
}
