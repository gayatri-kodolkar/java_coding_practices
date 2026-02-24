class first {
    void second(int i, int j, int n) {
        if (i <= n) {
            if (j <= i) {
                System.out.print("*");
                second(i, j + 1, n);
            } else {
                System.out.println("");
                second(i + 1, j-i, n);
            }
        } else {
            return;
        }
    }
}

public class recurssionpattern {
    public static void main(String[] args) {
        first obj = new first();
        obj.second(1, 1, 3);
    }
}