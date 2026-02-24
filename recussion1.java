public class recussion1 {
    // void first(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.print(n + " ");
    // first(n - 1);
    // }

    // public static void main(String[] args) {
    // recussion1 obj = new recussion1();
    // obj.first(9);
    // }
    ///////////////////////////////////
    public static void first(int n) { // when we use static keyword there is no need to make object of that class to run that method
        if (n == 0) {//BASE case
            return;
        }
        System.out.print(n + " ");//print
        first(n - 1);//recussion

    }

    public static void main(String[] args) {
        first(9);
    }
}
