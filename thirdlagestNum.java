public class thirdlagestNum {
    public static void main(String[] args) {
        // find third largest no. from array
        int arr[] = { 3000, 20, 40000, 50, 6, 800, 900 };
        int largest = 0;
        int seclargest = 0;
        int thirdlargest = 0;
        for (int i = 0; i < arr.length; i++) {// 4
            if (arr[i] > largest) {
                thirdlargest = seclargest;// 20
                seclargest = largest;// 40
                largest = arr[i];// 50

            } else if (arr[i] != largest && arr[i] > seclargest) {
                thirdlargest = seclargest;
                seclargest = arr[i];
            } else if (arr[i] > thirdlargest && arr[i] != largest && arr[i] != seclargest) {
                thirdlargest = arr[i];
            }

        }
        // System.out.println(largest);
        // System.out.println(seclargest);
        System.out.println(thirdlargest);

    }

}
