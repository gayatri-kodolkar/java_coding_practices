import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class reverseNum3 {
    public static void main(String[] args) {
        int temp;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int i = 3; i <= 6; i++) {
                temp = arr.get(i);
                arr.set(i, arr.get(12-i));
                arr.set(12-i, temp);
        }
        System.out.print(arr);
    }
}
