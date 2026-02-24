public class armstrong {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        while (n != 0) {
            int temp = (n % 10);
            sum = sum + (temp * temp * temp);
            n /= 10;
            

        }
        if (n == sum) {
                System.out.println("armstrong");
            }
            else{
                System.out.println("not armstrong");
            }

    }

}
