//write a java program to convert kilometers to miles

import java.util.Scanner;

public class Harry4 {
    public static void main(String[] args) {
        double miles;
        System.out.print("enter kilometer value: ");
        Scanner sc = new Scanner(System.in);
        int kilometers = sc.nextInt();
        if((kilometers = 1) == (miles = ( kilometers * (0.62137119)))){
            System.out.println(kilometers + "kilometer= "+ miles + "miles");
        }
    }
    
}
