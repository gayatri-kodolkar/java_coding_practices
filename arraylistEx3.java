import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; // For potential use of Collections.swap if needed

public class arraylistEx3 {
    public static void main(String[] args) {
        // Correct way to initialize an ArrayList
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

        // Swapping the first 6 elements to be in reverse order
        for (int i = 0; i < 3; i++) { // Swap pairs (0,5), (1,4), (2,3)
            int temp = arr.get(i);
            arr.set(i, arr.get(5 - i));
            arr.set(5 - i, temp);
        }

        // Swapping the next 6 elements (7-12) to be in reverse order
        for (int i = 6; i < 9; i++) { // Swap pairs (6,11), (7,10), (8,9)
            int temp = arr.get(i);
            arr.set(i, arr.get(17 - i)); // 6+11=17, 7+10=17, 8+9=17
            arr.set(17 - i, temp);
        }

        System.out.println(arr); // Output the modified ArrayList
    }
}