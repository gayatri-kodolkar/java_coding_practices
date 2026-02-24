public class recussionEasy {
    // public static void first(int n) { // when we use static keyword there is no
    // need to make object of that class to run that method
    // if (n == 0) {//BASE case
    // return;
    // }
    // System.out.print(n + " ");//print
    // first(n - 1);//recussion

    // }

    // public static void main(String[] args) {
    // first(9);
    // }

    ////////////////
    /// 2)print 1-5 no.
    // public static void second(int n){
    // if(n>5){
    // return;
    // }
    // System.out.print(n+" ");
    // second(n+1);
    // }
    // public static void main(String[] args) {
    // int n=1;
    // second(n);
    // }
    ///////////////////
    /// 3)sum of 5 no.
    // public static void third(int n, int sum) {
    // if (n > 5) {
    // System.out.print(sum);
    // return;

    // }
    // sum = sum + n;
    // third(n + 1, sum);
    // }

    // public static void main(String[] args) {
    // int n = 1;
    // int sum = 0;
    // third(n, sum);
    // }

    //////////////////////////////
    /// 4)print sum of first n natural no.
    // public static void fourth(int i, int n, int sum){
    // if(i==n){
    // sum=sum+i;
    // System.out.print(sum);
    // return;
    // }
    // sum=sum+i;
    // fourth(i+1, n, sum);
    // }
    // public static void main(String[] args) {
    // fourth(1, 6, 0);
    // }

    ///////////////////
    /// 5)factorial of number n
    // public static void fifth(int i, int n, int fact){
    // if(i == n){
    // fact=fact*i;
    // System.out.print(fact);
    // return;
    // }
    // fact=fact*i;
    // fifth(i+1, n, fact);
    // }
    // public static void main(String[] args) {
    // int i=1;
    // int n=5;
    // int fact=1;
    // fifth(i, n, fact);
    // }

    ////////////////////
    /// 6)print the fibonacci sequence till nth term*//1 1 2 3 5
    // public static void sixth(int prev2, int prev1, int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     int sum = prev1 + prev2;

    //     System.out.print(sum + " ");
    //     sixth(prev1, sum, n - 1);
    // }

    // public static void main(String[] args) {
    //     int prev2 = 0;
    //     int prev1 = 1;
    //     System.out.print(prev2 + " ");
    //     System.out.print(prev1 + " ");
    //     int n = 8;
    //     sixth(prev2, prev1, n - 2);
    // }

    //////////////////////
    /// 7)print x^n (stack height = n)
    // public static int seventh(int x, int n) {
    //     if (n == 0) {// base case 1
    //         return 1;
    //     }
    //     if (x == 1) {// base case 2
    //         return 0;
    //     }
    //     int xpownm1 = seventh(x, n - 1);
    //     int xpown = x * xpownm1;
    //     return xpown;
    // }

    // public static void main(String args[]) {
    //     int x = 2;
    //     int n = 5;
    //     int ans = seventh(x, n);
    //     System.out.println(ans);
    // }

    ///////////////////////
    /// 
}
