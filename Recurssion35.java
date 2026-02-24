//Q.Tower of Hanoi
//rules:-1.only one disk transferred in 1 step 2.smaller disks are always kept on top of larger disks
//3 towers - source, helper, destination # disk have to sourse to destination
//if n=1 then - source=1, helper, destination # source, helper, destination=1
//if n=2 then - s=1,2, h, d # s=1, h=2, d # s, h=2, d=1 #s, h, d=2
//if n=3 then - s=1, 2, 3 , h, d # s=1, 2 h=3, d # s=1 h=3,2 d # s, h=3, 2, d=1 # s, h=3, d=1,2 # s, h, d=1,2,3

// public class Recurssion35 {
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }
//         towerOfHanoi(n - 1, src, dest, helper);
//         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//         towerOfHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, "S", "H", "D");
//     }

// }

///////////////////////////////////////////
/// Q.print String in reverse order
public class Recurssion35 {
    public static void firstrecur(int i, int n, String str){
        if(i>str.length()){
            return;
        }
        char a = str.charAt(n);
        System.out.println(a);
        firstrecur(i+1, n-1, str);
    }


    public static void main(String[] args) {
        String str = "abcd";
        // for (int i = 1; i <= str.length(); i++) {
        //     for (int j = str.length() - i; j <= str.length()-i; j++) {
        //         char a = str.charAt(j);
        //          System.err.println(a);
        //     }
        // }
        int i=1;
        int n=str.length()-i;
        firstrecur(i, n, str);
    }
}