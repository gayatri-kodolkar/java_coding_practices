public class Challenge8 {

    public static void main(String[] args) {
        int num=10001;
        int numm=num;
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(numm==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}