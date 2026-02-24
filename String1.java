public class String1 {
    public static void main(String[] args) {
        String str = "AlphaClasses";
        int count = 0;

        // convert to lowercase
        String str2 = str.toLowerCase();

        // convert to character array
        char[] x = str2.toCharArray();

        // check each character
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
        System.out.println("Consonants: " + (x.length - count));
    }
}
