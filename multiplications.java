public class multiplications {
    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        do {
            sum *= i;
            i++;
        } while (i <= 30);
        System.out.println(sum);
    }
}
