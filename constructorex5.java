class first {
    first(int a) {
        for (int i = 1; i <= a; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}

public class constructorex5 {

    public static void main(String[] args) {
        first obj = new first(10);
    }
}
