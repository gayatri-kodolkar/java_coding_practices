public class jaggedArrayex {
    public static void main(String[] args) {
        int jarray[][] = new int[4][];// 2row, 4column
        jarray[0]=new int[2];
        jarray[1]=new int[3];
        jarray[2]=new int[2];
        jarray[3]=new int[1];
        jarray[0][0] = 1;
        jarray[0][1] = 2;
        jarray[1][0] = 3;
        jarray[1][1] = 4;
        jarray[1][2] = 9;
        jarray[2][0] = 1;
        jarray[2][1] = 9;
        jarray[3][0] = 6;
        for (int i = 0; i < jarray.length; i++) {
            for (int j = 0; j < jarray[i].length; j++) {
                System.out.print(jarray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
