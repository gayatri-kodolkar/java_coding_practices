public class armstronggg{
    public static void main(String[] args){
        //123 -> 1^3+ 2^3 + 3^3 == 123
        int num= 153;
        int temp=num;
        int count=0;
        int n=temp;
        while(temp!=0){
            n=(temp%10);
            count=count+(n*n*n);//27
            System.out.println(count);
            temp/=10;
        }
        if(count==num){
            System.out.println("thats armstrong no.");
        }else{
        System.out.println("thats not a armstrong no.");
        }
    }
}