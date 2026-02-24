public class strings3 {
    public static void main(String[] args) {
        String str="abcd";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch);
            for(int j=0; j<str.length(); j++){
                char ch2 = str.charAt(j);
                if(ch==ch2){
                    continue;
                }
                else{
                    System.out.print(ch2);
                }
            }
            System.out.println("");
            System.out.print(ch);
            for(int j=str.length()-1; j>=0; j--){
                char ch2 =str.charAt(j);
                if(ch==ch2){
                    continue;
                }
                else{
                    System.out.print(ch2);
                }
            }
            System.out.println("");
        }
    }
}
