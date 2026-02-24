public class patterntyf5 {
    public static void main(String[] args) {
        int num = 65;
        int n = 4;
        
        for (int i = 0; i <= n; i++) {
            char ch = (char) num;
            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
            }
            num++;
            System.out.println("");
        }
    }
}
