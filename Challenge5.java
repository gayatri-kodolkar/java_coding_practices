import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num: ");
        int a=sc.nextInt();
        int num=1;
        for(int i=1; i<=a; i++){
            num=num*i;
        }
        System.out.println(num);
    }
}