public class recurssionPrime {
    static void first(int i, int j, int n, int count) {// 1 1 20 0
        if (i > n) {
            return;
        }
        // int count=0;
        if (j > i) {
            if (count == 2) {
                System.out.print(i+" ");
            }
            first(i + 1, 1, n, 0);
            return;
        }
        if (i % j == 0) {
            first(i, j + 1, n, count + 1);// 1 2 20 1
        } else {
            first(i, j + 1, n, count);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int i = 1;
        int j = 1;
        int count = 0;
        first(i, j, n, count);
    }
}

// public class recurssionPrime {
//     static void first(int i, int j, int n, int count) {
//         // 1 2 20 1
//         if (i > n) {
//             return;
//         }
//         if (i <= n) {
//             // int count = 0;
//             if (j <= i) {
//                 if (i % j == 0) {
//                     first(i, j + 1, n, count + 1);
//                     // 1 2 20 1
//                 }
//             }
//             if (count == 2) {
//                 System.out.println(i);
//                 // first(i + 1, 1, 20, 0);
//             }
//             first(i + 1, 1, n, 0);
//             return;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 20;
//         int i = 1;
//         int j = 1;
//         int count = 0;
//         first(i, j, n, count);
//     }
// }