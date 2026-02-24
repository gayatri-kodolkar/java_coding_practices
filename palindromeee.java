public class palindromeee {
    public static void main(String[] args) {
        int num= 123;
        int temp=num;
        int n=temp;
        int count=0;
        while(temp!=0){
            n = (temp%10);
            System.out.println(count=(count*10)+n);
            temp/=10;
        }
        if(count==num){
            System.out.println("thats palindrome");
        }else{
            System.out.println("thats not a palindrome");
        }
    }
}
