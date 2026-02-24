import java.util.*;
public class switchcaseex2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a=10;
        int b=20;
        switch (x) {
            case "hi":int c = a+b;
                System.out.println(c);
                break;

                case "hello": c = a-b;
                System.out.println(c);
                break;

                case "ola": c = a/b;
                System.out.println(c);
                break;
        
            default:System.out.println(a*b);
                break;
        }
    }
}