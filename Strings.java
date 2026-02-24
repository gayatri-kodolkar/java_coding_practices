public class Strings {
    public static void main(String[] args) {
        String name = "Alp@h&a";
        char ch[] = name.toCharArray();
        char result[] = new char[ch.length];
        int start = 0;
        int end = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if (ch[start] == '@' || ch[start] == '&') {
                result[start] = ch[start];
                start++;
            } else if (ch[end] == '@' || ch[end] == '&') {
                result[end] = ch[end];
                end--;
            } else {
                result[start] = ch[end];
                result[end] = ch[start];
                start++;
                end--;
            }
        }
        System.out.println(new String(result));
    }
}