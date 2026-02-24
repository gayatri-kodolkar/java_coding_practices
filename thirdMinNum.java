import java.util.Arrays;
import java.util.ArrayList;

public class thirdMinNum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 30, 12, 10, 9, 8));
        int firstmin = 0;
        int Secmin = 0;
        int thirdmin = 0;
        for (int i = 0; i < arr.size(); i++) {
            int firstNum = arr.get(i);
            if (firstmin < firstNum) {
                firstmin = firstNum;//1
            }

            for (int j = i + 1; j < arr.size(); j++) {
                int SecNum = arr.get(j);
                if (Secmin < SecNum && Secmin > firstmin && Secmin < thirdmin) {
                    Secmin = SecNum;
                }
                else{
                    Secmin=firstmin;
                    firstmin=SecNum;
                }
                for (int k = j + 1; k < arr.size(); k++) {
                    int thirdNum = arr.get(k);
                    if (thirdmin > thirdNum && thirdmin > firstmin && thirdmin < Secmin) {
                        thirdmin = thirdNum;
                    }
                }
            }
        }
        System.out.println(thirdmin);
    }

}
