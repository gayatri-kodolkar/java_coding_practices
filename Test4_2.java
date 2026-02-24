//print 3rd largest number of array
public class Test4_2 {
    public static void main(String[] args) {
        int temp = 0;
        int arr[]= {2, 23, 34, 1, 32};
        int largest = arr[0];
        for(int i=1; i< 5; i++){
            if(largest > arr[i]){
            temp++;
            }
            if(temp == 3){
                System.out.println(largest);
            }
            largest = largest+
        }
        
    }
    
}
