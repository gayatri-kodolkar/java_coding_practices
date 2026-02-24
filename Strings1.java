import java.util.*;
public class Strings1{
    public static void main(String[] args) {
        String str="gayatri kodolkar";
        String word ="";
        String reversed="";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch != ' '){
                word+=ch;

            }else{
                reversed= word+" "+ reversed;
                word="";
            }
        }
        reversed=word+" "+reversed;
        System.out.println(reversed);
    }
}