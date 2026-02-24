class reverseNum{
    public static void main(String[] args){
        //reverse 100 to 1 num
        int n=100;
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
            System.out.print(n-i+1 + " ");
            }
        }
    }
}