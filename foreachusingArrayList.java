import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class foreachusingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            // arr.set(temp, arr.get(arr.size()));
            // arr.set(sum, sum+temp);
            sum = sum + temp;
        }
        System.out.println(sum);
    }
}
