package gui1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class Registrationform {

	private JFrame frmRegi;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrationform window = new Registrationform();
					window.frmRegi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegi = new JFrame();
		frmRegi.setTitle("regi");
		frmRegi.setBounds(100, 100, 450, 300);
		frmRegi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India.", "Afghanistan.", "Albania.", "Algeria.", "Andorra.", "Angola.", "Antigua and Barbuda.", "Argentina.", "Armenia."}));
		comboBox.setSelectedItem(null);
		JButton btnNewButton = new JButton("Registar");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String t1=textField.getText();
				JOptionPane.showMessageDialog(null,t1);
				String t2=textField_1.getText();
				JOptionPane.showMessageDialog(null,t2);
				String t3=textField_2.getText();
				JOptionPane.showMessageDialog(null,t3);
				
				String t4=(String) comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null,t4);
				String t5=rdbtnNewRadioButton.getText();
				String t6=rdbtnMale.getText();
				
				//fun1(){
				if(rdbtnNewRadioButton.isSelected()){
				JOptionPane.showMessageDialog(null,"Female");
				}
				
				//fun1(){
				else if(rdbtnMale.isSelected()){
					JOptionPane.showMessageDialog(null,"male");
					}
				
				System.out.println("Name="+t1 +"\n"+"Address="+t2+"\n"+"AGE="+t3+"\n"+"Nationality="+t4+"\n"+"Gender="+t5 );
				
				JOptionPane.showMessageDialog(null,"Successfully Registation Complete");
				
				
			}
		});
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Address");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JList list = new JList();
		
		
		//contentPane.add(comboBox);
		JLabel lblNewLabel_2 = new JLabel(" Nationality");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		//JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		//rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		//JRadioButton rdbtnMale = new JRadioButton("Male");
		//rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frmRegi.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(159)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(rdbtnNewRadioButton)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnMale, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(rdbtnNewRadioButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnMale)
					.addGap(21)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(25))
		);
		frmRegi.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


}
