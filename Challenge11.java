public class Challenge11 {
    public static void main(String[] args) {
        // simple method
        String s="aaabbcccc";
        char ch[]=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            int count=0;
        if(i>0 && ch[i]==ch[i-1]){
            continue;
        }
            for(int j=0; j<s.length(); j++){
                if(ch[i]==ch[j]){
                    count++;
                }else{
                    continue;
                }
            }
            System.out.println(ch[i]+""+count);
        }
        System.out.println(" ");



        //using stringbuilder
        // String s = "aaabbcccc";
        // StringBuilder sb= new StringBuilder();

        // int count=1;
        // for(int i=0; i<s.length(); i++){
        //     if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
        //         count++;
        //     }else{
        //         sb.append(s.charAt(i));
        //         sb.append(count);
        //         count=1;
        //     }
        // }
        // System.out.println(sb.toString());
    }
}
