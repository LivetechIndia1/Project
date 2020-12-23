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

public class AdminSection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection frame = new AdminSection();
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
	public AdminSection() {
		setTitle("Admin Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setForeground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Section");
		lblNewLabel.setForeground(new Color(204, 51, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(137, 11, 186, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Accountant");
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				AddAccountant.main(new String[]{});
				//frame.dispose();
			}
		});
		btnNewButton.setBounds(152, 94, 151, 23);
		contentPane.add(btnNewButton);
		
		JButton btnViewAccount = new JButton("View Accountant");
		btnViewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccountant.main(new String[]{});
			}
			 
		});
		btnViewAccount.setForeground(new Color(199, 21, 133));
		btnViewAccount.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnViewAccount.setBackground(new Color(173, 216, 230));
		btnViewAccount.setBounds(152, 147, 151, 23);
		contentPane.add(btnViewAccount);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				//frame.dispose();
				
			}
			 
		});
		btnLogOut.setForeground(new Color(199, 21, 133));
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogOut.setBackground(new Color(173, 216, 230));
		btnLogOut.setBounds(152, 202, 151, 23);
		contentPane.add(btnLogOut);
	}

}
