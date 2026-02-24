import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class EvenNumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (temp % 2 == 0) {
                evenNums.add(temp);
            }
        }
        System.out.println(evenNums);
    }
}
