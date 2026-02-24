import java.util.Scanner;

//find the repeatation of character in the given string (take character from user)
public class repeatedchar {
    public static void main(String[] args) {
        System.out.print("enter your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // when we take length of string then use () otherwise not
        char arr[] = str.toCharArray();// when in array use toCharArray otherwise//char a= str.charAt(i);

        // System.out.println(arr[i]);
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (arr[j] == arr[k]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(arr[j] + " ");
            }

        }

    }
}
