public class palindromeEx {

    // int num = 121;
    // int reverse = 0;
    // int i = 0;
    // while (i != 0) {
    // reverse = reverse + num % 10;
    // i /= 10;
    // }
    // if (i > num) {
    // if (reverse == num) {
    // System.out.print("given no. is palindrome");
    // }
    // }

    // }

    static void first(int num, int temp, int reversed) {// 121 0 0
        if (num == 0) {
            if (reversed == temp) {
                System.out.print("its palindrome");
                return;
            } else {
                System.out.println("not a palindrome");
                return;
            }
        }
        reversed = reversed * 10 + (num % 10);// 12
        num = num / 10;
        // temp = temp + num / 10;
        first(num, temp, reversed);// 1 121 12

    }

    public static void main(String[] args) {
        int num = 12121;
        int temp = num;
        int reversed = 0;
        first(num, temp, reversed);
    }
}
