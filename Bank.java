import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    // Create Account
    public void createAccount(int accountId, String name, double balance) {

        if (accounts.containsKey(accountId)) {
            System.out.println("Account ID already exists!");
            return;
        }

        Account account = new Account(accountId, name, balance);

        accounts.put(accountId, account);

        System.out.println("Account created successfully!");
    }

    // Deposit
    public void deposit(int accountId, double amount) {

        Account account = accounts.get(accountId);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        account.deposit(amount);

        System.out.println("Amount deposited successfully!");
        System.out.println("Deposited Amount : " + amount);
        System.out.println("Current Balance  : " + account.getBalance());
    }
}