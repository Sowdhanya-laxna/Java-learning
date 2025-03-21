package d4;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingCustomexception {

    // Method that throws a custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            // Trying to check age 16
            checkAge(16);
        } catch (InvalidAgeException e) {
            // Catching the custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
       
    }
}
