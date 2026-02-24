import java.util.Scanner;

public class Harry2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int u = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();

        System.out.println(((v^2)-(u^2)) / (2*a*s));
    }
}
