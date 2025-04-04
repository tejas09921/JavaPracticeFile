package ExceptionCreation.BankingSystem;

public class InsuficientBalenceException extends Throwable {
    public InsuficientBalenceException(String massage) {
        super(massage);
    }
}
