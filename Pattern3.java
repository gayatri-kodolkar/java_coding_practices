public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num = n;
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(num - j + 1);
                } else {
                    System.out.print(n - i + 1);
                }
            }
            //

            for (int j = 1; j < n; j++) {
                if (j <= i) {
                    System.out.print(n - i + 1);

                } else {
                    System.out.print(num - j + 1);

                }
            }
            System.out.println(" ");
        }
        //

        for (int i = 1; i < n; i++) {
            int num = n;
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(n - i + 1);

                } else {
                    System.out.print(num - j + 1);

                }
            }
            //
            for (int j = 1; j < n; j++) {
                if ((i+j) > n) {
                    System.out.print(n);

                } else {
                    System.out.print(i+j);

                }
            }
            System.out.println(" ");
        }
    }

}
