public class Challenge7 {
    public static void main(String[] args) {
        // armstrong num
        int num = 153;
        int original = num;
        int lastnum;
        int finalnum = 0;

        while (num > 0) {
            lastnum = num % 10;
            finalnum = finalnum + (lastnum * lastnum * lastnum);
            num /= 10;
        }
        // int z=lastnum/1;
        // finalnum=finalnum*(z*z*z);
        if (original == finalnum) {
            System.out.println("its armstrong num");
        } else {
            System.out.println("not armstrong");
        }
    }
}
