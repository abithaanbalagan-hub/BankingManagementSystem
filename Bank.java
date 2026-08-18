import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    // Create Account
    public void createAccount(int id, String name, double balance) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists!");
            return;
        }

        accounts.put(id, new Account(id, name, balance));
        System.out.println("Account created successfully!");
    }

    // Deposit
    public void deposit(int id, double amount) {

        Account account = accounts.get(id);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        account.deposit(amount);
        System.out.println("Amount deposited successfully!");
    }

    // Withdraw
    public void withdraw(int id, double amount) {

        Account account = accounts.get(id);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check Balance
    public void checkBalance(int id) {

        Account account = accounts.get(id);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("Account ID : " + account.accountId);
        System.out.println("Name       : " + account.name);
        System.out.println("Balance    : " + account.getBalance());
    }
}