package gui1;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class projectJava {

	private JFrame frmLoginPage;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projectJava window = new projectJava();
					window.frmLoginPage.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public projectJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setBackground(new Color(0, 0, 0));
		frmLoginPage.getContentPane().setBackground(new Color(0, 0, 255));
		frmLoginPage.setForeground(new Color(0, 255, 255));
		frmLoginPage.setTitle("LOGIN PAGE");
		frmLoginPage.getContentPane().setForeground(UIManager.getColor("Desktop.background"));
		frmLoginPage.setBounds(100, 100, 450, 300);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUserName = new JLabel("User Name :");
		
		JLabel lblPassword = new JLabel("Password  :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				String username=textField.getText();
				String password=passwordField.getText();
				System.out.println("Name="+username +"\n"+"Password="+password);
				if (username.hashCode() == 0 || password.hashCode() == 0 )
			    {
			        JOptionPane.showMessageDialog(null, "Some fields are empty!");
			    }
				//int i=0;
				else
			    {
			        //JOptionPane.showMessageDialog(null, "Account Created");
			    
				boolean flag=false;
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/project","root","joker");
					PreparedStatement stmt=con.prepareStatement("select * from created WHERE User_Name=? AND Password=?");
					stmt.setString(1, username);
					stmt.setString(2, password);
					// not working properly
					 flag=stmt.execute();
					System.out.print(flag+"records inserted");
					con.close();
				
				}catch(Exception e1){
					System.out.print(e1);
				}
				
				if(flag)
				{
					JOptionPane.showMessageDialog(null,"Successfully Registation Complete");
					first firs=new first();
					firs.setVisible(true);
					
					
					//dispose();
				}
				else {
						JOptionPane.showMessageDialog(null,"Registation Fail");
				}
				
			    }
				
				/*try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/project","root","joker");
					PreparedStatement stmt=con.prepareStatement("insert into loginDetails values(?,?)");
					stmt.setString(1, textField.getText());
					stmt.setString(2, passwordField.getText());
					
					int i=stmt.executeUpdate();
					System.out.print(i+"records inserted");
					con.close();
				
				}catch(Exception e1){
					System.out.print(e1);
				}*/
			
			}
		});
		JButton btnNewButton = new JButton("Creat New Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				creataccount regi=new creataccount();
				regi.setVisible(true);
				//dispose();
				
			}
		
	});
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmLoginPage.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUserName)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(173)
							.addComponent(btnLogin))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(143)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(btnLogin)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		frmLoginPage.getContentPane().setLayout(groupLayout);
	}

	
}
