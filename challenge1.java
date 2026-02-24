import java.util.*;
class Innerchallenge1 {
        void first(int a){
            if(a%2==0){
                System.out.println("number is even");
            }else{
                System.out.println("no. is odd");
            }
        }
    }
public class challenge1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. to check even or odd: ");
        int a=sc.nextInt();
        Innerchallenge1 obj=new Innerchallenge1();
        obj.first(a);
        


        
        
    }
    
}

