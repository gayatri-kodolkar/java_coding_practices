public class comparisonof2oneDarrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 6, 7, 8, 9 };
        int largest = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > largest) {
                largest = arr1[i];
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] > largest) {
                largest = arr2[j];
            }
        }
        System.out.println(largest);
    }
}
