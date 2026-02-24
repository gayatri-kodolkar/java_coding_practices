public class test1{
    public static void main(String[] args){
        int arr[]={2, 3, 5};
        int temp=1;
        for(int i=0; i<=arr.length; i++){
            if(arr[i] == temp){
                temp++;
                continue;
            }
            else{
                System.out.println(temp+" is missing");
                break;
            }
        }
    }
}