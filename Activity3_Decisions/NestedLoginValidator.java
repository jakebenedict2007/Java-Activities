public class NestedLoginValidator {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        boolean locked = false;

        String enteredUser = "admin";
        String enteredPass = "1234";

        if (enteredUser.equals(username)) {
            if (enteredPass.equals(password)) {
                if (!locked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Your account is locked.");
                }
            } else {
                System.out.println("Wrong password.");
            }
        } else {
            System.out.println("User not found.");
        }
    }
}
