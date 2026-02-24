import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class countofOddnumAL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 9, 3, 4, 5, 6));
        int count=0;
        for(int i=0; i<arr.size(); i++){
            int temp = arr.get(i);
            if(temp%2==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
