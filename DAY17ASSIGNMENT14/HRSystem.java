class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class HRSystem {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Registration failed: Age must be 18 or above.");
            }
            System.out.println("Registration successful.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}