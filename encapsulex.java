import java.util.*;

class first {
    private String username;
    private String password;

    public void setpassword(String password) {
        this.password = password;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public String getusername() {
        return username;
    }
}

public class encapsulex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        first obj = new first();
        obj.setpassword("123");
        obj.setusername("alpha");

        boolean success = false;
        for (int i = 1; i <= 3; i++) {

            System.out.println("enter password: ");
            String pass = sc.nextLine();

            if (pass.equals(obj.getpassword())) {
                System.out.println("successfully got password");
                success = true;
                break;
            } else {
                System.out.println("wrong attempt did " + i + " remains chances" + (3 - i));
            }
        }
        if (!success) {
            System.out.println("Account locked");
        }

    }
}