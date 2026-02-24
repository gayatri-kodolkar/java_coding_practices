public class patterntyf6 {
    public static void main(String[] args) {
        int num=65;
        char ch=(char)num;
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<(n-i+1)){
                    System.out.print(" ");
                }else{
                    System.out.print(ch);
                }
            }
            for(int j=1; j<i; j++){
                System.out.print(ch);
            }
            System.out.println("");
            ch++;
        }
    }
}
