public class jaggedArray {
    public static void main(String[] args) {
        //declaring 2D array jagged
        int arr[][] = new int[2][];
        //making above array jagged
        arr[0] = new int[3];
        arr[1] = new int[2];
        //initializing array
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        //printing array element 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
                System.out.println();
        }
    }
}
