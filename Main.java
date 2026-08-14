 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(id, name, balance);
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int depositId = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double amount = sc.nextDouble();

                    bank.deposit(depositId, amount);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}