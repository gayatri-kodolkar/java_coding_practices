class overriding {
    static class first {
        void param(int a, int b, int c) {
            if (a % 2 == 0) {
                System.out.println(a + " is even no.");
            }
            if (b % 2 == 0) {
                System.out.println(b + "  is even no.");
            }
            if (c % 2 == 0) {
                System.out.println(b + "  is even no.");
            }
        }
    }

    static class second extends first {
        @Override
        void param(int a, int b, int c) {
            super.param(a, b, c);
            if (a % 2 != 0) {
                System.out.println(a + " is odd no.");
            }
            if (b % 2 != 0) {
                System.out.println(b + " is odd no.");
            }
            if (c % 2 != 0) {
                System.out.println(c + " is odd no.");
            }
        }
    }

    static class third extends second {
        @Override
        void param(int a, int b, int c) {
            super.param(a, b, c);
            int countA = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    countA++;
                }
            }
            if (countA == 2) {
                System.out.println(a + " is prime no.");
            }
            ////
            int countB = 0;
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    countB++;
                }
            }
            if (countB == 2) {
                System.out.println(b + " is prime no.");
            }
            //////
            int countC = 0;
            for (int i = 1; i <= c; i++) {
                if (c % i == 0) {
                    countC++;
                }
            }
            if (countC == 2) {
                System.out.println(c + " is prime no.");
            }
        }
    }

    public static void main(String[] args) {
        third obj = new third();
        obj.param(3, 2, 5);
    }
}
