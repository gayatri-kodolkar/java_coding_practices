public class Challenge9 {
    //calculate sum of digit
    public static void main(String[] args) {
        
    int num=123485;
    int sumnum=0;
    int rev=0;
    while(num>0){
        rev=num%10;
        sumnum=sumnum+rev;
        num/=10;
        
    }
    System.out.println(sumnum);
    }
}
