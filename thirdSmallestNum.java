public class thirdSmallestNum {
    public static void main(String[] args) {
        // find third largest no. from array
        int arr[] = { 1, 20, 40000, 50, 6, 800, 900 };
        int smallest=0;
        int secSmallest=0;
        int thirdSmallest=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                thirdSmallest = secSmallest;// 0
                secSmallest = smallest;// 0
                smallest = arr[i];// 20

            } else if (arr[i] != smallest && arr[i] < secSmallest) {
                thirdSmallest = secSmallest;
                secSmallest = arr[i];
            } else if (arr[i] < thirdSmallest && arr[i] != smallest && arr[i] != secSmallest) {
                thirdSmallest = arr[i];
            }

        }
        // System.out.println(largest);
        // System.out.println(seclargest);
        System.out.println(thirdSmallest);

    }

}
