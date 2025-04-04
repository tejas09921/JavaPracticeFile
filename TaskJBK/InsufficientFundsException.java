// Custom exception class for insufficient funds
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Account class with deposit, withdraw, and display balance methods
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Available: " + balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }
}

 class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("123456789", 1000.0);

        myAccount.displayBalance();

        myAccount.deposit(500);
        myAccount.displayBalance();

        try {
            myAccount.withdraw(200);
            myAccount.displayBalance();

            myAccount.withdraw(1500); // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
