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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AccountantSection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantSection frame = new AccountantSection();
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
	public AccountantSection() {
		setTitle("Accountant Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accountant Section");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(130, 39, 195, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				AddStudent.main(new String[]{});
				//frame.disable(); 
			}
		}); 
		btnNewButton.setBounds(64, 108, 138, 23);
		contentPane.add(btnNewButton);
		
		JButton btnViewStudent = new JButton("View Student");
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ViewStudent.main(new String[]{});
			}
			 
		});
		btnViewStudent.setForeground(new Color(128, 0, 128));
		btnViewStudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnViewStudent.setBounds(245, 110, 138, 23);
		contentPane.add(btnViewStudent);
		
		JButton btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EditStudent.main(new String[]{});
				//frame.dispose();
			}
		});
		btnEditStudent.setForeground(new Color(128, 0, 128));
		btnEditStudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEditStudent.setBounds(64, 158, 138, 23);
		contentPane.add(btnEditStudent);
		
		JButton btnDueFee = new JButton("Due Fee");
		btnDueFee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueFee.main(new String[]{});
			}
		});
		btnDueFee.setForeground(new Color(128, 0, 128));
		btnDueFee.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDueFee.setBounds(245, 160, 138, 23);
		contentPane.add(btnDueFee);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				//frame.dispose(); 
			}
		});
		btnLogOut.setForeground(new Color(128, 0, 128));
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogOut.setBounds(144, 206, 138, 23);
		contentPane.add(btnLogOut);
	}

}
