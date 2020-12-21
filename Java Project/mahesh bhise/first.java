package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class first extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
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
	public first() {
		setBackground(new Color(255, 0, 0));
		//AdminLogin first=new AdmainLogin();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 423);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Personal Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblName = new JLabel("Name :");
		
		JLabel lblMothersName = new JLabel("Mother's Name :");
		
		JLabel lblAddress = new JLabel("Address :");
		
		JLabel lblContactNo = new JLabel("Contact No. :");
		
		JLabel lblAge = new JLabel("Age :");
		
		JLabel lblDob = new JLabel("D.O.B :");
		
		JLabel lblPwd = new JLabel("P.W.D :");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		JRadioButton rdbtnNo = new JRadioButton("NO");
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy"}));
		comboBox.setSelectedItem(null);
		comboBox.setToolTipText("Nationality");
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1=textField.getText();
				String t2=textField_1.getText();
				String t3=textField_2.getText();
				String t4=textField_3.getText();
				String t5=textField_4.getText();
				String t6=textField_5.getText();
				String t7=(String) comboBox.getSelectedItem();	
				if(rdbtnNewRadioButton.isSelected()){
					boolean t8=rdbtnNewRadioButton.isSelected();
					//JOptionPane.showMessageDialog(null,"YES");
					}
					else if(rdbtnNo.isSelected()){
						//JOptionPane.showMessageDialog(null,"NO");
						boolean t9=rdbtnNo.isSelected();
						}
				if (t1.hashCode() == 0 || t2.hashCode() == 0 || t3.hashCode() == 0 || t4.hashCode() == 0|| t5.hashCode() == 0 || t6.hashCode() == 0 || t7.hashCode() == 0 )
			    {
			        JOptionPane.showMessageDialog(null, "Some fields are empty!");
			    }
				else
			    {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/project","root","joker");
					PreparedStatement stmt=con.prepareStatement("insert into PersonalDetails values(?,?,?,?,?,?,?)");
					stmt.setString(1, t1);
					stmt.setString(2, t2);
					stmt.setString(3, t3);
					stmt.setString(4, t4);
					stmt.setString(5, t5);
					stmt.setString(6, t6);
					stmt.setString(7, t7);
					int i=stmt.executeUpdate();
					System.out.print(i+"records inserted");
					con.close();
				
				}catch(Exception e1){
					System.out.print(e1);
				}
System.out.println("Name="+t1 +"\n"+"Mothers Name="+t2+"\n"+"Contac NO.="+t3+"\n"+"Address="+t4+"\n"+"Age="+t5+"\n"+"D.O.B="+t6+"\n"+"Country="+t7/*+"\n"+"P.W.D="+*/);
				
				JOptionPane.showMessageDialog(null,"Successfully Complete");
				second firs1=new second();
				firs1.setVisible(true);
				dispose();
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		//JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		
		//JRadioButton rdbtnNo = new JRadioButton("NO");
		
		//JComboBox comboBox = new JComboBox();
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy"}));
		//comboBox.setToolTipText("Nationality");
		
		JLabel lblNewLabel_1 = new JLabel("Country :");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblMothersName)
								.addComponent(lblContactNo)
								.addComponent(lblAddress)
								.addComponent(lblAge)
								.addComponent(lblDob)
								.addComponent(lblPwd)
								.addComponent(lblNewLabel_1))
							.addGap(61)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(249)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(233)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(212, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMothersName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDob)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPwd)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
