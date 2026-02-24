import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class SwapingArraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ));
//[6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8, 7]
        for(int i=0; i<3; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(5-i));
            arr.set(5-i, temp);
        }
        
        for(int i=6; i<9; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(17-i));
            arr.set(17-i, temp);
        }
        System.out.println(arr);
    }
    
}
