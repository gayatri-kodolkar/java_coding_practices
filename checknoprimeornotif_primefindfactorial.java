//checknumprimeornot if prime then find factorial

import java.util.Scanner;

public class checknoprimeornotif_primefindfactorial {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
            int num= sc.nextInt();
            int count=0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count==2){
            int fact=1;
            for(int j=1; j<=num; j++){
                if(j<=num){
                    fact=fact*j;
                }
            }
            System.out.println("thats number is prime and their factorial is: "+ fact);
        }
        else{
            System.out.println("thats not a prime number");
        }
    }
}
