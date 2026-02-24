public class mostrepeatnum {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        // for(int ans: arr){
        // System.out.println(ans);
        // }//foreachloop
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > sum) {
                sum = count;
                System.out.println(arr[i] + " has " + sum + " times");
            }

                
            
        }
    }
}
