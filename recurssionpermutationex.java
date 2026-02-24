// public class recurssionpermutationex {
//     public static void main(String[] args) {
//         String str = "abc";
//         char ch[] = str.toCharArray();
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(ch[i]);
//             for (int j = 0; j < str.length(); j++) {
//                 if (i == j) {
//                     continue;
//                 } else {
//                     System.out.print(ch[j]);
//                 }
//             }
//             System.out.println("");

//             System.out.print(ch[i]);
//             for (int j = str.length()-1; j >=0; j--) {
//                 if (i == j) {
//                     continue;
//                 } else {
//                     System.out.print(ch[j]);
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }


/////////////////////using recurssion
class first{
    void second(int i, int j){
        String str="abc";
        char ch[]=str.toCharArray();
        if(i<str.length()){
            System.out.print(ch[i]);
            if(j<str.length()){
                if(i!=j){
                    System.out.print(ch[j]);
                }
                second(i, j+1);
            }
            second(i+1, j);
            System.out.println("");
        }
    }
}
public class recurssionpermutationex{
    public static void main(String[] args) {
        first obj=new first();
        obj.second(0, 0);
    }
}