//write a program to calculate CGPA using marks of three subjects (out of 100)
import java.util.Scanner;

public class Harry2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter " + i + " subject mark: ");
            int sub = sc.nextInt();
            sum = sum + sub;
        }
        System.out.print(sum / 3);
    }

}
