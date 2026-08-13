import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    // Create Account
    public boolean createAccount(int accountId, String name, double balance) {

        // Search manually using for loop
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                System.out.println("Account ID already exists!");
                return false;
            }
        }

        Account newAccount = new Account(accountId, name, balance);
        accounts.add(newAccount);

        System.out.println("Account created successfully!");
        return true;
    }

    // Find Account
    public Account findAccount(int accountId) {

        // Manual search using for loop
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }

        return null;
    }

    // Deposit
    public void deposit(int accountId, double amount) {

        Account account = findAccount(accountId);

        if (account != null) {
            account.deposit(amount);
            System.out.println("Amount deposited successfully!");
            System.out.println("Current Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public void withdraw(int accountId, double amount) {

        Account account = findAccount(accountId);

        if (account != null) {

            if (account.withdraw(amount)) {
                System.out.println("Amount withdrawn successfully!");
                System.out.println("Current Balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }

        } else {
            System.out.println("Account not found!");
        }
    }

    // Balance Check
    public void checkBalance(int accountId) {

        Account account = findAccount(accountId);

        if (account != null) {
            System.out.println("Account Holder : " + account.getName());
            System.out.println("Account ID     : " + account.getAccountId());
            System.out.println("Balance        : " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}