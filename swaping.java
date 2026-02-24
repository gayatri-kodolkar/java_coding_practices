// import java.util.*;
public class swaping{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        b = a+b;//30
        a = b-a;//20
        b = b-a;//10

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}