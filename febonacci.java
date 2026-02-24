class febonacci {
    // 1 1 2 3 5 8 13 //addition of two no equal to unique no.
    public static void main(String[] args) {
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 1; i < 10; i++) {

            System.out.print(prev2 + " ");
            int num = prev2 + prev1;
            prev1 = prev2;
            prev2 = num;
        }
    }
}