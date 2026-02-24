public class Test5_3 {
    public static void main(String[] args) {
        int second = 0;
        int third = 0;

        int arr[] = { 500, 100, 15, 200, 25 };
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                third = second;
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                third = second;
                second = arr[i];

            } else if (arr[i] > third && arr[i] != second && arr[i] != largest) {
                third = arr[i];
            }

        }
        System.out.println(second);
        System.out.println(third);
    }
}
