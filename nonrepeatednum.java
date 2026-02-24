public class nonrepeatednum {
    //print nonrepeated number from array whose divisible by 3
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 7, 2, 8, 6};
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                if(arr[i]%3==0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
