import java.util.Scanner;

import challengepackage.Primeornot;

public class challen2 {//get package from challengepackage folder and Primeornot class and primenum function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num to check prime num or not: ");
        int a=sc.nextInt();
        Primeornot obj=new Primeornot();
        obj.primenum(a);
    }
}
