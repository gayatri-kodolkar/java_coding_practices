public class Challenge12 {
    public static void main(String[] args) {
        String str="Java is good language";
        String[] words=str.split(" ");
        String revString="";
        for(int i=0; i<words.length;i++){
            String word=words[i];
            String nstr="";
            char ch;
            for(int j=0; j<word.length(); j++){
                ch=word.charAt(j);
                nstr=ch+nstr;
            }
            revString=revString+nstr+"";
        }
        System.out.println(revString);
    }
}
