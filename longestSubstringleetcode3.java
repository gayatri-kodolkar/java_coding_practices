public class longestSubstringleetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        // char ch = s.tocharArray();
        int precount = 1;
        int count = 1;
        if (s == null && s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            precount = 1;
            char a = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++) {

                char b = s.charAt(j);
                if (a != b) {
                    precount++;
                } else {
                    if (precount > count) {
                        count = precount;
                        precount = 1;
                    } else {
                        precount = 1;
                    }

                }

            }
        }
        if (precount > count) {
            return precount;
        } else if (precount < count) {
            return count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "gfdhhghjkjjj";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
