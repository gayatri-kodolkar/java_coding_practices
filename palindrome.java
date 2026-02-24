public class palindrome {
    public static void main(String[] args) {
        int n = 111;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            temp = n % 10;
            sum = sum + temp;
            temp *= 10;
        }
        if (n == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

}
