package ExceptionCreation.UserRegistationSystem;

public class ValidationException extends Exception {
    public ValidationException(String massage) {
        super(massage);
    }
}
