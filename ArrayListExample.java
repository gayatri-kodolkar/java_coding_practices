import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList<String> arr = new ArrayList<>(collection);
        //-->ArrayList(Collection c): This constructor is used to build an 
        //array list initialized with the elements from the collection c.
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

        for(int i=0; i<3; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(3+i));
            arr.set(3+i, temp);
        }

        for(int i=6; i<9; i++){ 
            int temp = arr.get(i);
            arr.set(i, arr.get(3+i));
            arr.set(3+i, temp);
        }
        System.out.println(arr);
    }
}


//1. ArrayList(): This constructor is used to build an empty array list.

// ArrayList<Integer> arr = new ArrayList<>();

// 2. ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from the collection c.

// ArrayList<String> arr = new ArrayList<>(collection); 

// 3. ArrayList(int capacity): This constructor is used to build an array list with the initial capacity being specified.

// ArrayList<Double> arr = new ArrayList<>(20);