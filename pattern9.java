public class pattern9 {
    public static void main(String[] args) {
        int n = 12;
        int count = n/2;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 1 || i == n - 1 || j == 1 || j == n - 1) {
                    System.out.print(count + " ");
                } else if (i == 2 || j == 2 || i == n - 2 || j == n - 2) {
                    System.out.print(count - 1 + " ");
                } else if (i == 3 || j == 3 || i == n - 3 || j == n - 3) {
                    System.out.print(count - 2 + " ");
                } else if (i == 4 || j == 4 || i == n - 4 || j == n - 4) {
                    System.out.print(count - 3 + " ");
                } else {
                    System.out.print( " ");
                }

            }
            System.out.println("");
        }
    }
}
