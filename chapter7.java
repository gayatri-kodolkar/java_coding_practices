
// // 1)write a java method to print multiplication table of a number n

// import java.util.Scanner;

// class first {
//     void first1(int a) {
//         int n = 10;
//         for (int i = 1; i <= n; i++) {
//             System.out.print((i * a)+" ");
//         }
//     }
// }

// class chapter7 {
//     public static void main(String[] args) {
//         System.out.println("enter which no.s table do you want: ");
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         first obj = new first();
//         obj.first1(a);
//     }
// }

//////////////////////////////////
/// 2)WAP using function to print the following pattern
/// *
/// **
/// ***
/// ****

// public class chapter7 {
//     public static void first(int n) {
//         for (int i = 0; i < n; i++) {// row
//             for (int j = 0; j <= i; j++) {
//                 System.out.print('*');
//             }
//             System.out.println("");
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         first(n);

//     }
// }

/////////////////////////
/// 3)WAP of recursive function to calculate sum of n natural no
// import java.util.*;
// public class chapter7{
//     public static void first(int i, int n, int sum){
//         if(i==n){
//             sum=sum+i;
//             System.out.println(sum);
//             return;
//         }
//         sum=sum+i;
//         first(i+1, n, sum);

//     }
//     public static void main(String[] args) {
//         int i=1;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of n: ");
//         int n = sc.nextInt();
//         int sum=0;
//         first(i, n, sum);
//     }
// }

//////////////////////////////////
/// 
/// 4)WAP function to print the following pattern
/// *****
/// ****
/// ***
/// **
/// *

// import java.util.Scanner;

// public class chapter7{
//     public static void first(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter value of n: ");
//         int n = sc.nextInt();
//         first(n);
//     }
// }
/////////////////////////
/// 5)WAP to print n^th term of fibonacci series using recurrsion

// import java.util.Scanner;

// public class chapter7{
//     public static void first(int i, int prev1, int prev2, int n){
//         if(i == n){
//             return;
//         }
//         int sum=prev1+prev2;
//         System.out.print(sum+" ");
//         first(i+1, sum, prev1, n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter your n^th term: ");
//         int n=sc.nextInt();
//         int i=1;
//         int prev1=1;
//         int prev2=0;
//         System.out.print(prev2+" ");
//         System.out.print(prev1+" ");
//         first(i, prev1, prev2, n);
//     }
// }

///////////////////////////
/// 6)WAP function to find average of a set of numbers passed as arguments
// public class chapter7{
//     public static void first(int a, int b, int c){
//         int avg=(a+b+c)/3;
//         System.out.println(avg);
//     }
//     public static void main(String[] args) {
//         first(8, 9, 6);
//     }
// }

/////////////////
/// 7)repeat 4 using recurssion
public class chapter7 {
    public static void first(int i, int n, int num){
        if(i>n){
            return;
        }
        System.out.print(num+" ");
        first(i+1, n, num);
    }
    public static void main(String[] args) {
        first(1, 10, 4);
    }
     
}