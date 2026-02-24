public class feb {
    public static void main(String[] args) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(prev2 + " ");
            int sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }
    }
}
