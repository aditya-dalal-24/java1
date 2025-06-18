import java.util.*;
import java.io.*;

public class newATM {

    static Scanner sc = new Scanner(System.in);
    static double balance = 0;
    static final int PIN = 1234;
    static ArrayList<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if (!verifyPIN()) return;

        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> checkBalance();
                case 4 -> showHistory();
                case 5 -> {
                    System.out.println("Exiting... Saving history.");
                    saveHistoryToFile();
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static boolean verifyPIN() {
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPIN = sc.nextInt();
        int attempts = 1;

        while (enteredPIN != PIN && attempts < 3) {
            System.out.print("Wrong PIN! Try again: ");
            enteredPIN = sc.nextInt();
            attempts++;
        }

        if (enteredPIN != PIN) {
            System.out.println("Too many wrong attempts. Account locked.");
            return false;
        }

        return true;
    }

    static void showMenu() {
        System.out.println("\nATM MENU:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        String record = "Deposited: ₹" + amount;
        transactionHistory.add(record);
        System.out.println(record);
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance -= amount;
        String record = "Withdrew: ₹" + amount;
        transactionHistory.add(record);
        System.out.println(record);
    }

    static void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
        transactionHistory.add("Checked balance: ₹" + balance);
    }

    static void showHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    static void saveHistoryToFile() throws IOException {
        FileWriter writer = new FileWriter("ATM_Transaction_History.txt");
        for (String transaction : transactionHistory) {
            writer.write(transaction + "\n");
        }
        writer.close();
        System.out.println("Transaction history saved to file.");
    }
}
