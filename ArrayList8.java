import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>(Arrays.asList(1, 2, 3, '@', '#', 4, 5, '&', 9));

        int left = 0;
        int right = arr.size() - 1;

        // Use two pointers: one from start, one from end
        while (left < right) {
            Object start = arr.get(left);
            Object end = arr.get(right);

            // If start is not integer, move forward
            if (!(start instanceof Integer)) {
                left++;
            }
            // If end is not integer, move backward
            else if (!(end instanceof Integer)) {
                right--;
            }
            // If both are integers, swap them
            else {
                arr.set(left, end);
                arr.set(right, start);
                left++;
                right--;
            }
        }

        System.out.println(arr);
    }
}
