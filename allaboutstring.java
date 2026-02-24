// import java.util.*;

// public class allaboutstring{
//     public static void main(String[] args) {
//         ////string declaration
//         // String name = "alpha";

//         ////Scanner-class, sc=obj, new-keyword for make space for non primitive datatype,
//         // Scanner sc = new Scanner(System.in);
//         // String name = sc.next();
//         //System.out.println("Your name is : "+ name);

//         // ////Concatination
//         // String firstName = "tony";
//         // String lastName ="stark";
//         // String fullName= firstName+lastName;
//         // System.out.println(fullName);
//         // System.out.println(fullName.length());

//         // //charAt
//         // for(int i=0; i<fullName.length(); i++){
//         //     System.out.println(fullName.charAt(i));
//         // }

//         // ////compare
//         // String name1="Tony";
//         // String name2="Tony";

//         // //case 1: string1 > string2 => +ve value
//         // //case2: string1 < string2 => -ve value
//         // //case3: string1 == string2 => 0 (string equal)

//         // //alphabetical order check ex. hello, cello-> h>c -> hello big string
//         // if(name1.compareTo(name2) == 0){
//         //     System.out.println("strings are equal");
//         // }else{
//         //     System.out.println("Strings are not equal");
//         // }

//         // /////Substring->fuction get (beginning index and ending index)
//         // String sentence="My name is tony";
//         // String name= sentence.substring(9, sentence.length());
//         // String name2 = sentence.substring(7);
//         // System.out.println(name);
//         // System.out.println(name2);

//         /////String is Immutable -> cannot modify if want to modify then use stringbuilder, stringbuffer
//         /////////////////////////////////////////////////////////////////////////////////////////////
//         /// 
//         /// 
//         /// 
//         /// 
//         /// 
//         /// 
//         ///String Builder--data store in stack format-LIFO

//         //Declaration(classname variable name = newkeyword )
//         StringBuilder sb=new StringBuilder("Tony");
//         System.out.println(sb);
//         //

//         //char at index 0 get
//         System.out.println(sb.charAt(0));

//         //set char at index-(index, value)
//         sb.setCharAt(0,'P');
//         System.out.println(sb);

//         // insert
//         sb.insert(0, 'S');
//         System.out.println(sb);

//         //delete the char
//         sb.delete(2, 4);
//         System.out.println(sb);

//         //append - add something at the end
//         sb.append("l");/////if that in string like -> str=str+"l"
//         System.out.println(sb);

//     }
// }

//////////////////////////////
/// 
/// 
/// 
/// 
/// 
/// 
/// ex.REVERSE THE STRING //time complexity->O(n)

public class allaboutstring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}