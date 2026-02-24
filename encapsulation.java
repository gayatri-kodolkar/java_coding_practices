public class encapsulation {
    static class User {
        // 1. Declare instance variables as private
        private String username;
        private int password;

        // 2. Provide public setter methods to modify the private fields
        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        // 3. Provide public getter methods to access the private fields
        public String getUsername() {
            return this.username;
        }

        public int getPassword() {
            return this.password;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the User class
        User user = new User();

        // Use the setter methods to set the values
        user.setUsername("shambhu");
        user.setPassword(123);

        // Use the getter methods to retrieve and print the values
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
