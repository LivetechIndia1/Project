package Student;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

public class EditStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textArea;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudent frame = new EditStudent();
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
	public EditStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(new Color(255, 160, 122));
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(176, 224, 230));
		contentPane.add(contentPane_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(167, 33, 149, 36);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(42, 88, 74, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email Id");
		lblNewLabel_1_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(42, 126, 74, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Course");
		lblNewLabel_1_2.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(42, 163, 74, 14);
		contentPane_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fee");
		lblNewLabel_1_3.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(42, 203, 74, 14);
		contentPane_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Paid");
		lblNewLabel_1_4.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(42, 236, 74, 14);
		contentPane_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Address");
		lblNewLabel_1_5.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(42, 278, 74, 14);
		contentPane_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("City");
		lblNewLabel_1_6.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_6.setBounds(42, 316, 74, 14);
		contentPane_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("State");
		lblNewLabel_1_7.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_7.setBounds(42, 346, 74, 14);
		contentPane_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Country");
		lblNewLabel_1_8.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_8.setBounds(42, 381, 74, 14);
		contentPane_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Contact No");
		lblNewLabel_1_9.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_9.setBounds(42, 408, 93, 14);
		contentPane_1.add(lblNewLabel_1_9);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(86, 428, 136, 23);
		contentPane_1.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(128, 0, 0));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(264, 429, 136, 23);
		contentPane_1.add(btnBack);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(217, 86, 158, 20);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 124, 158, 20);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 201, 158, 20);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 236, 158, 20);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 276, 158, 20);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 406, 158, 20);
		contentPane_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(217, 344, 158, 20);
		contentPane_1.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 160, 158, 22);
		contentPane_1.add(comboBox);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(217, 379, 158, 20);
		contentPane_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(217, 314, 158, 20);
		contentPane_1.add(textField_8);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setForeground(new Color(255, 160, 122));
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBackground(new Color(176, 224, 230));
		contentPane.add(contentPane_2, BorderLayout.CENTER);
		
		JLabel lblEditStudent = new JLabel("Edit Student");
		lblEditStudent.setForeground(new Color(199, 21, 133));
		lblEditStudent.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEditStudent.setBounds(167, 11, 149, 36);
		contentPane_2.add(lblEditStudent);
		
		JLabel lblNewLabel_1_10 = new JLabel("Name");
		lblNewLabel_1_10.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_10.setBounds(42, 95, 74, 14);
		contentPane_2.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email Id");
		lblNewLabel_1_1_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(42, 126, 74, 14);
		contentPane_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Course");
		lblNewLabel_1_2_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(42, 163, 74, 14);
		contentPane_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Fee");
		lblNewLabel_1_3_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(42, 203, 74, 14);
		contentPane_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Paid");
		lblNewLabel_1_4_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4_1.setBounds(42, 236, 74, 14);
		contentPane_2.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Address");
		lblNewLabel_1_5_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5_1.setBounds(42, 278, 74, 14);
		contentPane_2.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("City");
		lblNewLabel_1_6_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_6_1.setBounds(42, 316, 74, 14);
		contentPane_2.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("State");
		lblNewLabel_1_7_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_7_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_7_1.setBounds(42, 346, 74, 14);
		contentPane_2.add(lblNewLabel_1_7_1);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Country");
		lblNewLabel_1_8_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_8_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_8_1.setBounds(42, 381, 74, 14);
		contentPane_2.add(lblNewLabel_1_8_1);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("Contact No");
		lblNewLabel_1_9_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_9_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_9_1.setBounds(42, 408, 93, 14);
		contentPane_2.add(lblNewLabel_1_9_1);
		
		JButton btnDone = new JButton("Update Student");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  
			{
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				int rollno=Integer.parseInt(textField_10.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.update(s);
				
				if(status>0)
				{
				JOptionPane.showMessageDialog(null, "Student updated successfully!");
					JOptionPane.showMessageDialog(EditStudent.this,"Student updated successfully!");
					AccountantSection.main(new String[]{});
					//frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(EditStudent.this,"Sorry, Unable to add student!");
				}
			}
		});
		btnDone.setForeground(new Color(128, 0, 0));
		btnDone.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDone.setBounds(86, 428, 149, 23);
		contentPane_2.add(btnDone);
		
		JButton btnBack_1 = new JButton("Back"); 
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				//frame.dispose();   
			} 
		});
		btnBack_1.setForeground(new Color(128, 0, 0));
		btnBack_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack_1.setBounds(264, 429, 136, 23);
		contentPane_2.add(btnBack_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(217, 93, 158, 20);
		contentPane_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(217, 124, 158, 20);
		contentPane_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(217, 201, 158, 20);
		contentPane_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(217, 236, 158, 20);
		contentPane_2.add(textField_12);
		
		textArea = new JTextField();
		textArea.setColumns(10);
		textArea.setBounds(217, 276, 158, 20);
		contentPane_2.add(textArea);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(217, 406, 158, 20);
		contentPane_2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(217, 344, 158, 20);
		contentPane_2.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(217, 379, 158, 20);
		contentPane_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(217, 314, 158, 20);
		contentPane_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(217, 161, 158, 20);
		contentPane_2.add(textField_18); 
	
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				String srollno=textField_10.getText();
				if(srollno==null||srollno.trim().equals("")){
					JOptionPane.showMessageDialog(EditStudent.this,"Please enter rollno first!");
				}else{
				int rollno=Integer.parseInt(srollno);
				Student s=StudentDao.getStudentByRollno(rollno);
				textField.setText(s.getName());
				textField_1.setText(s.getEmail());
				textField_2.setText(s.getCourse());
				textField_3.setText(String.valueOf(s.getFee()));
				textField_4.setText(String.valueOf(s.getPaid()));
				textField_5.setText(String.valueOf(s.getDue()));
				textArea.setText(s.getAddress());
				textField_6.setText(s.getCity());
				textField_7.setText(s.getState());
				textField_8.setText(s.getCountry());
				textField_9.setText(s.getContactno());
				
			}
			}
		});
		btnLoadRecord.setForeground(new Color(128, 0, 0));
		btnLoadRecord.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnLoadRecord.setBounds(382, 42, 106, 30);
		contentPane_2.add(btnLoadRecord);
		
		JLabel lblNewLabel_1_10_1 = new JLabel("Roll No");
		lblNewLabel_1_10_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_10_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_10_1.setBounds(42, 59, 74, 14);
		contentPane_2.add(lblNewLabel_1_10_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(217, 47, 158, 20);
		contentPane_2.add(textField_13);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(392, 84, 34, 2);
		contentPane_2.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(52, 84, 436, 2);
		contentPane_2.add(separator);
	}
}
