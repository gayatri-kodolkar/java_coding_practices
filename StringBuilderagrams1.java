public class StringBuilderagrams1 {
    public static void main(String[] args) {
        // Check if two strings are anagrams.
        String demo1 = "opkejh";
        demo1.toLowerCase();
        String demo2 = "opkejH";
        demo2.toLowerCase();
        StringBuilder str1 = new StringBuilder(demo1);
        StringBuilder str2 = new StringBuilder(demo2);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);
                if (ch == ch2) {
                    str2.delete(j, j + 1);
                    count++;
                }
            }

        }
        if (count == str1.length() && str2.length() == 0) {
            System.out.println("thats anagram");
        } else {
            System.out.println(" thats not anagram");
        }
    }
}
