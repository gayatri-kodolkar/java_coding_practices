public class secondoddnum {
    public static void main(String[] args) {
        int arr[]={1, 20, 3, 9, 5, 6, 7};
        int firstodd=0;
        int secodd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 == 1){
                secodd=firstodd;//9
                firstodd=arr[i];//5
            }else if(arr[i] %2 ==0){
                continue;
            }
            
        }
        System.out.println(secodd);

    }
}
