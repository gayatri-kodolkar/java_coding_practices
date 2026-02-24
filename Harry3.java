//write a java program which asks the user to enter his/her name and 
//greets them with "Hello<name> have a good day" text
import java.util.Scanner;

public class Harry3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name + " Hava a good day");

    }
}
