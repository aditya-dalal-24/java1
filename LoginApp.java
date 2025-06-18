import javax.swing.*;

public class LoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        frame.setSize(300, 200);
        frame.setLayout(null);

        userLabel.setBounds(20, 20, 80, 25);
        userText.setBounds(100, 20, 165, 25);
        passLabel.setBounds(20, 60, 80, 25);
        passText.setBounds(100, 60, 165, 25);
        loginButton.setBounds(100, 100, 80, 25);

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String pass = new String(passText.getPassword());
            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Login failed!");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
