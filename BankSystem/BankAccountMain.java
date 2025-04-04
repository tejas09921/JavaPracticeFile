package BankSystem;

import java.util.Scanner;

public class BankAccountMain {
    static Scanner sc = new Scanner(System.in);
    static BankAccount[] accounts = new BankAccount[100]; // Array to store accounts
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    performTransaction("dipsite");
                    break;
                case 3:
                    performTransaction("withdraw");
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    break;
            }
        }
    }
    static void createAccount(){
        if (count >= accounts.length) {
            System.out.println("Account list is full!");
            return;
        }
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Deposit Amount: ");
        double initialBalance = sc.nextDouble();
        accounts[count++] = new BankAccount(accountNumber,name,initialBalance);
        System.out.println("Account created successfully!");
    }

    private static void checkBalance() {
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found!");
        }
    }
    private static BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
    private static void performTransaction(String type) {
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (type.equals("deposit")) {
            account.Deposite(amount);
        } else {
            account.Withdrowbalence(amount);
        }
    }

}
