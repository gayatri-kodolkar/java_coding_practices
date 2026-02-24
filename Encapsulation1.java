// import java.util.*;

// public class Encapsulation1 {
// private String username = "hello";// You can’t declare private variables or
// methods inside main()
// private int password = 123;

// // Methods like setPassword() and getPassword()
// // should belong to the class, not inside main()
// void setPassword(int password) {
// this.password = password;
// }

// int getPassword() {
// return password;
// }

// public static void main(String[] args) {
// Encapsulation1 obj = new Encapsulation1();
// Scanner sc = new Scanner(System.in);
// int maxAttempts = 3;
// boolean matched = false;
// for (int attempt = 1; attempt <= maxAttempts; attempt++) {
// System.out.print("Enter password (attempt " + attempt + " of " + maxAttempts
// + "): ");
// int input = sc.nextInt();

// if (input == (obj.getPassword())) {
// System.out.println("password matched");
// matched = true;
// break;
// } else {
// int remaining = maxAttempts - attempt;
// if (remaining > 0) {
// System.out.println("Incorrect password. Attempts left: " + remaining);
// }
// }
// }

// if (!matched) {
// System.out.println("Account locked after " + maxAttempts + " failed
// attempts.");
// }

// sc.close();
// }
// }