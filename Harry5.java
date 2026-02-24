import java.util.Scanner;

public class Harry5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num >= 0){
                System.out.println("num entered by user is an integer");
            }
            else{
                System.out.println("num entered by user is not an integer");
            }
    }
}
