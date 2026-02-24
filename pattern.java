//1234
//**** 
//*  *
//*  *
//**** 
// **
// **
public class pattern {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=1; j<=4; j++){
                if(i<=4){
                    if(i==1 || j==1 || i==4 || j==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i>4){
                    if(j==1 || j==4){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }
    }
}
