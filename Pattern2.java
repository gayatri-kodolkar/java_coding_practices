public class Pattern2 {
    public static void main(String[] args) {
        int n = 7;
        int num = 4;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            int end = n - i + 1;
            for (int j = 1; j <= n; j++) {
                
                if (start == i || end == i || start == j || end == j) {
                    System.out.print(num);
                }
                else {
                    System.out.println("");
                }
                
                if (start == end) {
                    System.out.print(num);
                    break;
                }
                if(num ==1){
                    break;
                }
            }
            start++;
            end--;
            num--;
        }
        System.out.println(" ");
    }

}
