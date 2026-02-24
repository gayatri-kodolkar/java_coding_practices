
// public class first {
//     public static void main(String[] args) {
//         int count = 1;
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 if (count % 2 == 0) {
//                     System.out.print("#" + " ");
//                 } else {
//                     System.out.print(count + " ");
//                 }
//                 count++;
//             }
//             System.out.println("");
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class first {
//     public static void main(String[] args) {
//         int target = 7;
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//         for (int i = 0; i < arr.size(); i++) {
//             for (int j = i + 1; j < arr.size(); j++) {

//                 if ((arr.get(i) + arr.get(j)) == target) {
//                     System.out.print(arr.get(i) + " ");
//                     System.out.print(arr.get(j)+" ");
//                 }
//             }
//             System.out.println("");
//         }

//     }
// }

import java.util.*;

public class first {
    public static void main(String[] args) {

        int arr[] = { 0, 0, 44, 77 };
        int largest = arr[0];
        int seclargest = arr[0];
        int smallest = arr[0];
        int secsmallest = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            } else if ((arr[i] < largest) && arr[i] > seclargest) {
                seclargest = arr[i];
            }
            

            if (arr[i] < smallest) {
                secsmallest = smallest;// 10
                smallest = arr[i];// 2
            } else if ((arr[i] > smallest) && arr[i] < secsmallest) {
                secsmallest = arr[i];
            }
        }
        System.out.println(seclargest);
        System.out.println(secsmallest);

        int avg = (seclargest + secsmallest) / 2;// 10+2=12/2=6
        System.out.println(avg);
    }
}

// import java.util.*;

// public class first {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 3 };
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// System.out.println(arr[i]);
// continue;

// }

// }
// }
// }
// }

// import java.util.*;

// public class first {
// public static void main(String[] args) {
// ArrayList<String> str1 = new ArrayList<>(Arrays.asList("al@pha#"));
// // StringBuilder str1 = new StringBuilder(str);
// String ch = str1.get(0);
// char[] arr = ch.toCharArray();
// for (int i = 0; i < str1.size(); i++) {

// if (arr[i] == '#' || arr[i] == '@') {
// System.out.print(arr[i]);
// } else {
// char temp = arr.get(i);
// str1.set(i, str1.get(str1.size() - i - 1));
// str1.set(str1.size() - i - 1, temp);

// }
// }
// System.out.print(str1);
// }
// }