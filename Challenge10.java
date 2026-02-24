public class Challenge10 {

    public static void main(String[] args) {
        //reverse string
        String str="alpha";
        char ch[]=str.toCharArray();
        int last=str.length();
        for(int i=1;i<=str.length();i++){
            System.out.print(ch[(last-i)]);
        }
        // for(int i=str.length()-1; i>=0; i--){
        //     System.out.print(ch[i]);
        // }
    }
}