public class test9{
    static void factorial(int i, int n, int sum){
        if(i<=n){
            sum = sum*i;
            factorial(i+1,n,sum);
            
        }else{
             System.out.print(sum);
        }
    }
    public static void main(String[] args){
        int i=1;
        int n=5;
        int sum=1;
        factorial(i, n, sum);
    }
}