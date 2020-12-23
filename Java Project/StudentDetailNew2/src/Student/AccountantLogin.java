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

public class AccountantLogin extends JFrame {

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
					AccountantLogin frame = new AccountantLogin();
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
	public AccountantLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(204, 255, 255));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		JLabel lblAccountantLogin = new JLabel("Accountant Login");
		lblAccountantLogin.setForeground(new Color(0, 0, 205));
		lblAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAccountantLogin.setBounds(157, 41, 198, 33);
		contentPane_1.add(lblAccountantLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setForeground(new Color(255, 0, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 99, 86, 33);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(48, 157, 98, 33);
		contentPane_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(190, 107, 139, 20);
		contentPane_1.add(textField);
		
		JButton btnAccountantLogin = new JButton("Login");
		btnAccountantLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				boolean status=AccountantDao.validate(name, password);
				if(status){
					AccountantSection.main(new String[]{});
					//frame.dispose();
				}else{
					JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
				}
				}   
				//String name=textField.getText();
				//String password=String.valueOf(passwordField.getPassword());
				//boolean status=AccountantDao.validate(name, password);
				//if(status){
					//AccountantSection.main(new String[]{});
					//frame.dispose();
				//}else{
					//JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
				//}
				//}
			//}
			
		});
		btnAccountantLogin.setForeground(new Color(102, 153, 0));
		btnAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAccountantLogin.setBackground(new Color(153, 255, 153));
		btnAccountantLogin.setBounds(157, 213, 186, 23);
		contentPane_1.add(btnAccountantLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 165, 139, 20);
		contentPane_1.add(passwordField);
	}
}
