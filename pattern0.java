public class pattern0 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(n - j+" ");
                } else {
                    System.out.print(n - i+" ");
                }
            }
            
            for (int k = n - 2; k >= 0; k--) {
                if (k >= i) {
                    System.out.print(n - i+" ");
                } else {
                    System.out.print(n - k+" ");
                }
            }
            System.out.println(" ");
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    System.out.print(n - i+" ");
                } else {
                    System.out.print(n - j+" ");
                }
            }
            for (int k = n - 2; k >= 0; k--) {
                if (k >= i) {
                    System.out.print(n - i+" ");
                } else {
                    System.out.print(n - k +" ");
                }
            }
            System.out.println(" ");
        }
    }

}
