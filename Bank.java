
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
        System.out.println("Account ID      : " + id);
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Current Balance : " + account.getBalance());
    }
}