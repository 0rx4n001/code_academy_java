package quiz_10_04_2025.Throw;

public class UsernameValidator {
    public static void validateUsername(String username) {
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        } else {
            System.out.println("Username accepted");
        }
    }
}
