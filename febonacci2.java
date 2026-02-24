public class febonacci2 {
    public static void main(String[] args) {
        //1 1 2 3 5 8
        int prev1=1;
        System.out.print(prev1+" ");
        int prev2=1;
        System.out.print(prev2+" ");
        for(int i=0; i<10; i++){
            int num=prev1+prev2;
                System.out.print(num+" ");
                prev1=prev2;
                prev2=num;
            }
        }
    }
