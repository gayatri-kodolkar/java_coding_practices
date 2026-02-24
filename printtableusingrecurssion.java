//print table of any number

import java.util.Scanner;

class first{
    void second(int num, int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i+" * "+num+" = "+(i*num));
        second(num, i+1, n);

    }
}
public class printtableusingrecurssion {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int i=1;
        int n=10;
    first obj = new first();
    obj.second(num, i, n);
    }
}
