//reverse the string 
public class DigitalOcean {
    static void first(String str){
        for(int j=str.length()-1; j>=0; j--){
            char a = str.charAt(j);
            System.out.print(a);
        }
        System.out.println("");

    }
    public static void main(String[] args) {
        String str = "alpha coding classes";
        for(int i=0; i<str.length()/2; i++){
        char a = str.charAt(i);
        first(str);
        if(a == ' '){
            first(str);
        }
        }
    }
}
