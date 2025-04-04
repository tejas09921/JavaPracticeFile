package ExceptionCreation.BankingSystem;

public class BankAccounts {
    private Double balence;

    public BankAccounts(Double balence) {
        this.balence = balence;
    }

    public void Withdrow(double amount) throws InsuficientBalenceException {
        if(amount>balence){
            throw new InsuficientBalenceException("Insufficient Fund Your Balence is: "+balence);
        }else {
            balence=balence-amount;
            System.out.println("Withdroeal successfull Remaining balence is: "+balence);
        }

    }
}
