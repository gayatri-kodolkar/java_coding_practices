import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReversedArraylist6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int i = 0; i < arr.size() / 2; i++) {
            // Swap elements
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, temp);
            System.out.println(arr);
        }
    }
}