public class armstrongNum {
    public static void main(String[] args) {//123=1^3 + 2^3 + 3^3
        int num=123;
        int sum=0;
        while(num%10 !=0){
            sum=sum+(num*num*num);
            num/=10;
        }
        System.out.println(sum);
    }
}
