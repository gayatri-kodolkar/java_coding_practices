public class recfeb {
    static void first(int prev1, int prev2, int sum, int n){
        if(prev2>n){
            return;
        }
        sum=prev1+prev2;
        prev1=prev2;
        prev2=sum;
        // System.out.print(prev1+" ");
        System.out.print(sum+" ");
        first(prev1, prev2, sum, n);
    }
    public static void main(String[] args) {
        int prev1=0;
        System.out.print(prev1+" ");
        int prev2=1;
        System.out.print(prev2+" ");
        int sum=0;
        int n=7;
        first(prev1, prev2, sum, n);
    }
}
