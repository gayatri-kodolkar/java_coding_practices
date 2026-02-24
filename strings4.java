//remove duplicate from string 
public class strings4 {
    public static void main(String[] args) {
        String str = "abcdab";
        String str2 = "";
        for (int k = 0; k < str2.length(); k++) {
            char str3 = str2.charAt(k);

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                for (int j = 0; j < str.length(); j++) {
                    char ch2 = str.charAt(j);
                    if (str3 != ch2) {
                        str2 = str2 + ch2;
                        System.out.print(str2);
                    }
                }

            }
        }
        System.out.println("");
    }
}
