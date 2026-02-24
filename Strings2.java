public class Strings2 {
    public static void main(String[] args) {
        String name = "Alp@h&a&@";
        char ch[] = name.toCharArray();
        int symbol = 0;
        int symbol1 = 0;
        for (int i = 0; i < name.length(); i++) {
            if (ch[i] == '@') {
                symbol++;
            }
            if (ch[i] == '&') {
                symbol1++;
            }
        }
        if (symbol == 1) {
            System.out.print("@");
        }
        if (symbol1 == 1) {
            System.out.print("&");
        }
        System.out.println("");
    }
}
