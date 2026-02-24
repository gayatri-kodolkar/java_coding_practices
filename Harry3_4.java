public class Harry3_4 {
    public static void main(String[] args) {
        String sc = "I am   the  best";
        int temp = 0;
        char a[] = sc.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                temp++;
            }
            System.out.println(temp);
        }
    }

}
