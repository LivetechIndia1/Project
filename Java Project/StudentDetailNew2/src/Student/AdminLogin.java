package Student;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	/**
	 * Create the frame.
	 */
	public AdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(157, 41, 198, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setForeground(new Color(255, 0, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 99, 86, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(48, 157, 98, 33);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(190, 107, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				if(name.equals("admin")&&password.equals("admin123")){
					String s[]={};
					AdminSection.main(s); 
					//frame.dispose();
				}else{
					JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
					textField.setText("");passwordField.setText("");
				}
				}
				//String uname=username.getText(); 
				//String pname=passwordField.getText();
				//if(uname.equals("admin") && pname.equals("admin123"))
				//{
					//JOptionPane.showMessageDialog(none, message);
				//}
				//String name=username.getText();
				//char ch[]=passwordField.getPassword();
				//String password=String.valueOf(ch);
				//if(name.equals("admin")&&password.equals("admin123")){
					//JOptionPane.showMessageDialog(AdminLogin.this,"Welcome,Admin Section!");
					//String s[]={}; 
					//AdminSection.main(s);
					//frame.dispose();
				//}else{
					//JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
					//username.setText("");passwordField.setText("");
				//}
				//}
			
		});
		btnNewButton.setBackground(new Color(153, 255, 153));
		btnNewButton.setForeground(new Color(102, 153, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(157, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 165, 139, 20);
		contentPane.add(passwordField);
	}
}
