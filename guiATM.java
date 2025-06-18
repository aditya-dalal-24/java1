import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class guiATM {

    private static final int PIN = 1234;
    private static double balance = 0;
    private static ArrayList<String> history = new ArrayList<>();
    private static JFrame frame;

    public static void main(String[] args) {
        showLoginScreen();
    }

    static void showLoginScreen() {
        frame = new JFrame("ATM - Login");
        JLabel label = new JLabel("Enter 4-digit PIN:");
        JPasswordField pinField = new JPasswordField(10);
        JButton loginBtn = new JButton("Login");

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginBtn.addActionListener(e -> {
            try {
                int enteredPin = Integer.parseInt(new String(pinField.getPassword()));
                if (enteredPin == PIN) {
                    frame.dispose();
                    showATMMenu();
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect PIN!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter numbers only.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.add(label);
        frame.add(pinField);
        frame.add(loginBtn);
        frame.setVisible(true);
    }

    static void showATMMenu() {
        frame = new JFrame("ATM - Main Menu");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1, 10, 10));

        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton balanceBtn = new JButton("Check Balance");
        JButton historyBtn = new JButton("Transaction History");
        JButton exitBtn = new JButton("Exit");

        depositBtn.addActionListener(e -> depositDialog());
        withdrawBtn.addActionListener(e -> withdrawDialog());
        balanceBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Current Balance: ₹" + balance));
        historyBtn.addActionListener(e -> showHistory());
        exitBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thank you for using ATM!");
            System.exit(0);
        });

        frame.add(new JLabel("Welcome to Java ATM!", SwingConstants.CENTER));
        frame.add(depositBtn);
        frame.add(withdrawBtn);
        frame.add(balanceBtn);
        frame.add(historyBtn);
        frame.add(exitBtn);
        frame.setVisible(true);
    }

    static void depositDialog() {
        String amountStr = JOptionPane.showInputDialog(frame, "Enter amount to deposit:");
        if (amountStr == null) return;
        try {
            double amt = Double.parseDouble(amountStr);
            if (amt <= 0) throw new Exception();
            balance += amt;
            history.add("Deposited ₹" + amt);
            JOptionPane.showMessageDialog(frame, "Deposited ₹" + amt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void withdrawDialog() {
        String amountStr = JOptionPane.showInputDialog(frame, "Enter amount to withdraw:");
        if (amountStr == null) return;
        try {
            double amt = Double.parseDouble(amountStr);
            if (amt <= 0 || amt > balance) {
                JOptionPane.showMessageDialog(frame, "Invalid or insufficient amount!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            balance -= amt;
            history.add("Withdrew ₹" + amt);
            JOptionPane.showMessageDialog(frame, "Withdrew ₹" + amt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void showHistory() {
        if (history.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No transactions yet.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String entry : history) {
                sb.append(entry).append("\n");
            }
            JTextArea textArea = new JTextArea(sb.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(250, 150));
            JOptionPane.showMessageDialog(frame, scrollPane, "Transaction History", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
