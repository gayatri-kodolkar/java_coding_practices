import java.util.ArrayList;
import java.util.Arrays;
public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        for(int i=0; i<arr.size()/2; i++){
            int temp= arr.get(i);
            arr.set(i, arr.get(arr.size()-i-1));
            arr.set(arr.size()-i-1, temp);
           
        }
         System.out.print(arr);
    }
    
}
