
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(id, name, balance);
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int depositId = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    bank.deposit(depositId, deposit);
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    int withdrawId = sc.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    bank.withdraw(withdrawId, withdraw);
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    int balanceId = sc.nextInt();

                    bank.checkBalance(balanceId);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}