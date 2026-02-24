public class SortArray {
    public static void main(String[] args) {
        int arr[] = {1, 20, 32, 4, 20, 10};
        
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    arr[j]=arr[i];
                }
            }
            System.out.print(smallest+" ");
        }
    }
}
