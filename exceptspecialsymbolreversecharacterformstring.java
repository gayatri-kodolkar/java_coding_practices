public class exceptspecialsymbolreversecharacterformstring {
    // reverse string excepting special symbol
    public static void main(String[] args) {
        String str = "alp@h&@@a";
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (arr[i] == '@' || arr[i] == '&') {
                    System.out.print(arr[i]);
                }
                // System.out.println(arr[j]);
                else if (j == str.length() - 1 - i) {
                    if (arr[j] == '@' || arr[j] == '&') {
                        continue;
                    } else {

                        System.out.print(arr[j]);
                    }
                }
            }
        }
    }
}
