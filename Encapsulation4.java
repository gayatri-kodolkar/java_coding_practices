import java.util.Scanner;

class Example {
    private String username = "alpha";
    private int password = 123;

    public void setPassword(int password, int i, int n) {
        if (i > n) {
            System.out.println("limit reached after 3 chances locked");
            return;
        }
        this.password = password;

        if (getPassword() == password) {
            System.out.println("unlocked");
        } else {
            setPassword(password, i + 1, n);
        }

    }

    public int getPassword() {
        return password;
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        int i = 1;
        int n = 3;
        Example obj = new Example();
        // System.out.print(obj.getPassword());
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password: ");
        int userpassword = sc.nextInt();
        obj.setPassword(userpassword, i, n);
    }
}
