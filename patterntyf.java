public class patterntyf {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n - j);
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(n - i);
            }
            for (int l = 0; l <= n - i - 2; l++) {
                System.out.print(n - i);
            }
            for (int m = i; m > 0; m--) {
                System.out.print(n - m+1);
            }
            System.out.println("");
        }

    }
}
