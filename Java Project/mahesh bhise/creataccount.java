package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class creataccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creataccount frame = new creataccount();
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
	public creataccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Full Name :");
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		
		JLabel lblNewLabel_3 = new JLabel("Conform Password :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		
		passwordField_1 = new JPasswordField();
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String t1=textField.getText();
				String t2=textField_1.getText();
				String t3=passwordField.getText();
				String t4=passwordField_1.getText();
				 if (t1.hashCode() == 0 || t2.hashCode() == 0 || t3.hashCode() == 0 || t4.hashCode() == 0 )
				    {
				        JOptionPane.showMessageDialog(null, "Some fields are empty!");
				    }
				    else
				    {
				        JOptionPane.showMessageDialog(null, "Account Created");
				    
				
				
				//JOptionPane.showMessageDialog(null," Account Created");	
				//JOptionPane.showMessageDialog(null,"Thank You");
				//private void exitForm(java.awt.event.WindowEvent evt){
				//this.dispose();
				//projectJava.setVisible(true);
				//}
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/project","root","joker");
					PreparedStatement stmt=con.prepareStatement("insert into created values(?,?,?,?)");
					
					stmt.setString(1, t1);
					stmt.setString(2, t2);
					stmt.setString(3, t3);
					stmt.setString(4, t4);
					
					
					int i=stmt.executeUpdate();
					System.out.print(i+"records inserted");
					con.close();
				
				}catch(Exception e1){
					System.out.print(e1);
				}
			
				
				System.out.println("\n"+"Full Name="+t1 +"\n"+"User Name="+t2+"\n"+"Password="+t3+"\n"+"Conform password="+t4);

				    }
				//public void actionPerformed(ActionEvent e)
				//projectJava firs2=new projectJava();
				//firs2.setVisible(true);
				//dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(49)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
								.addComponent(passwordField))))
					.addContainerGap(113, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(101))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(lblNewLabel_2)
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(26))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
