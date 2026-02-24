import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SwapOddnumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) % 2 != 0 && arr.get(arr.size()-1-i) != 0) {
                // Swap them
                int temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
            }
        }
        System.out.println(arr);
    }
}