class permutation {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 1 };

        for (int i = 0; i <= 2; i++) {
            // System.out.print(nums[i]);
            // for (int j = 0; j <= 2; j++) {
            // if (i == j) {
            // continue;
            // } else {
            // System.out.print(nums[j]);
            // }
            // }
            // System.out.print(" ");
            System.out.print(nums[i]);

            for (int j = 2; j >= 0; j--) {
                if (i == j) {
                    continue;
                } else {
                    System.out.print(nums[j]);
                }
            }
            System.out.print(" ");
            break;
        }

    }
}