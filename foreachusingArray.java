//sum of all elements using array
import java.util.*;
public class foreachusingArray {
    public static void main(String[] args) {
        int sum=0;
        int arr[] = {1, 2, 3, 4, 5, 6};
        for(int i : arr){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
