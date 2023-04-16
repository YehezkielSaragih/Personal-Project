import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.*;
import java.awt.BorderLayout;
// import java.awt.GridLayout;

public class Login implements ActionListener{

    private static JTextField user_text;
    private static JPasswordField password_text;
    private static JLabel success_label;

    public Login(){

        // Panel Setup
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);

        // Frame Setup
        JFrame frame = new JFrame();
        frame.setSize(350, 200);              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Graphical Unit Interface");  

        // User Input
        JLabel user_label = new JLabel();
        user_label.setText("User");
        user_label.setBounds(10, 20, 80, 25);
        panel.add(user_label);

        user_text = new JTextField(20);
        user_text.setBounds(100, 20, 165, 25);
        panel.add(user_text);

        // Password Input
        JLabel password_label = new JLabel();
        password_label.setText("Password");
        password_label.setBounds(10, 50, 80, 25);
        panel.add(password_label);

        password_text = new JPasswordField(20);
        password_text.setBounds(100, 50, 165, 25);
        panel.add(password_text);

        // Login Button
        JButton login_button = new JButton();
        login_button.setBounds(185, 80, 80, 25);
        login_button.setText("Login");                
        login_button.addActionListener(this);
        panel.add(login_button);

        // Login Success
        success_label = new JLabel();
        success_label.setBounds(10, 110, 165, 25);
        panel.add(success_label);
        
        // Add Frame
        frame.add(panel, BorderLayout.CENTER);  
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        success_label.setText("Login Successful !");        
    }

    public static void main(String[] args) {
      
        new Login();
    }
}