import java.util.ArrayList;
import java.util.Arrays;

public class removeDupAL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 2, 4, 5, 6, 6, 7, 8, 8, 9));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--; // move one step back after removing to avoid skipping
                }
            }
        }

        System.out.println("After removing duplicates: " + arr);
    }
}
