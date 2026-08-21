
import java.util.LinkedHashMap;

public class Bank {

    LinkedHashMap<Integer, Account> accounts = new LinkedHashMap<>();

    // Create Account
    public void createAccount(int id, String name, double balance) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists!");
            return;
        }

        Account account = new Account(id, name, balance);
        accounts.put(id, account);

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
        System.out.println("Current Balance: " + account.getBalance());
    }

    // Withdraw
    public void withdraw(int id, double amount) {

        Account account = accounts.get(id);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Current Balance: "
                    + account.getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}