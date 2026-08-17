 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("1. Create Account");
        System.out.println("2. Withdraw");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter Account ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            bank.createAccount(id, name, balance);

        } else if (choice == 2) {

            System.out.print("Enter Account ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Withdraw Amount: ");
            double amount = sc.nextDouble();

            bank.withdraw(id, amount);

        } else {

            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}