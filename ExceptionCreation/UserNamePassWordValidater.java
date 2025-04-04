package ExceptionCreation;
    import java.util.Scanner;

    class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }

    class LoginSystem {
        private static final String VALID_USERNAME = "admin";
        private static final String VALID_PASSWORD = "password123";

        public static void login(String username, String password) throws InvalidCredentialsException {
            if (!username.equals(VALID_USERNAME) || !password.equals(VALID_PASSWORD)) {
                throw new InvalidCredentialsException("Invalid credentials! Please try again.");
            }
            System.out.println("Login successful! Welcome, " + username);
        }
    }

public class UserNamePassWordValidater {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                LoginSystem.login(username, password);
            } catch (InvalidCredentialsException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

