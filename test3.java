// class first{
//     first(int a, int b){
//         this();
//         System.out.println(a+b);
//     }

//     public first() {
//         super();
//         System.out.println("bye");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         first obj = new first(12, 2);
//     }
// }

// //encapsulation

// class first {
//     private String username;
//     // private String password="123";

//     public void setusername(String username){
//         this.username=username;
//     }
//         public String getusername() {
//             System.out.println(username);
//         return username;

//     }

// }

// public class test3 {
//     public static void main(String[] args) {
//         first obj = new first();
//         // obj.setpassword("123");
//         obj.setusername("alpha");
//         obj.getusername();

//     }
// }





// import java.util.Scanner;

// class first {
//     private String username = "gayatri";
//     private int password = 123;

//     public void setpassword(int pass) {
//         pass = password;
//     }

//     public int getpassword() {
//         // System.out.println(password);
//         return password;
//     }
// }

// public class test3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         first obj = new first();
//         int b = obj.getpassword();

//         int n = 3;
//         for (int i = 1; i <= n; i++) {
//             int a = sc.nextInt();
//             if (a == b) {
//                 System.out.println("user accessed");
//                 return;
//             } else if ((i >= n) && (a!=b)) {
//                 System.out.println("password locked");
//             } else {
//                 System.out.println("try " + (n - i) + " time again");
//             }

//         }

//     }
// }

////////////////////////////////////
/// que1>
class first{
    first(int a, int b){
        System.out.println(a+b);
    }
}
class second extends first{
    second(){
        super(10,20);
        System.out.println("hello");
    }
}
public class test3{
    public static void main(String[] args) {
        second obj = new second();
    }
}