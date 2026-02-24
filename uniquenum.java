public class uniquenum {
    public static void main(String[] args) {
        //find unique number from array
        int arr[]= {1, 1, 3, 9, 7, 7, 9};
        for(int i=0; i<arr.length; i++){
            int count=0; 
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]+ " thats unique number");
            }
        }
    }
}
