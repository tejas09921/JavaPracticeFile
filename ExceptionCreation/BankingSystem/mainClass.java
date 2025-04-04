package ExceptionCreation.BankingSystem;


public class mainClass {
    public static void main(String[] args) throws InsuficientBalenceException {
        BankAccounts account=new BankAccounts(5000.0);

        try {
            account.Withdrow(2000);
        } catch (InsuficientBalenceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
