public class Challenge13 {
    public static void main(String[] args) {
        String str="lsjfsa ghfjfgf";
        StringBuilder sb = new StringBuilder();
        char ch[]=str.toCharArray();
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(count>=2){
                sb.append(ch[i]);
                
            }
            
        }System.out.println(sb+" "+"its repeated character");
    }
}
