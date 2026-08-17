import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int id, String name, double balance) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists!");
            return;
        }

        accounts.put(id, new Account(id, name, balance));
        System.out.println("Account created successfully!");
    }

    public void withdraw(int id, double amount) {

        Account account = accounts.get(id);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Remaining Balance: "
                    + account.getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}