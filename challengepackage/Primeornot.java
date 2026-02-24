package challengepackage;

import java.util.Scanner;//challen2

// public class challenge2 {
    public class Primeornot{
        public void primenum(int a){
            int num=0;
        for(int i=1;i<=a;i++){
            
            if(a%i==0){
                num++;
            }
        }
        if(num==2){
            System.out.println("its prime number");
        }
        }
    }
// }
