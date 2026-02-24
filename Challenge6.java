public class Challenge6 {
    public static void main(String[] args) {
        int input=1578666;
        int rev=0;
        while (input>=rev) {
            rev=input%10;
             System.out.print(rev);
             input/=10;
             
        }
        System.out.println(input/1);
        
        

    }
}
