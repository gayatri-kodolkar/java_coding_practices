//reverse string
public class reversestringex {
    public static void main(String[] args) {
        String str = "alpha";
        char arr[]=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print(arr);


    }
}
