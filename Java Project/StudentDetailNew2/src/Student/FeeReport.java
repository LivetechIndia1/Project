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
import javax.swing.border.EmptyBorder;

public class FeeReport {

	private JFrame frmFeeReport;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					FeeReport window = new FeeReport();
					window.frmFeeReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FeeReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFeeReport = new JFrame();
		frmFeeReport.setTitle("Fee Report");
		frmFeeReport.getContentPane().setBackground(new Color(255, 192, 203));
		frmFeeReport.setBounds(100, 100, 450, 300);
		frmFeeReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFeeReport.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fee Report");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(160, 37, 192, 50);
		frmFeeReport.getContentPane().add(lblNewLabel);
		
		JButton AdminLogin = new JButton("Admin Login");
		AdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//AdminLogin.main(new String[]{});
				JOptionPane.showMessageDialog(frmFeeReport, "You are selected Admin Login");
			    AdminLogin first=new AdminLogin();
			    first.setVisible(true);
				//frame.dispose();
			}
		});
		AdminLogin.setBackground(new Color(176, 196, 222));
		AdminLogin.setForeground(new Color(128, 0, 128));
		AdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AdminLogin.setBounds(128, 92, 183, 42);
		frmFeeReport.getContentPane().add(AdminLogin);
		
		JButton AccountantLogin = new JButton("Accountant Login");
		AccountantLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				//AccountantLogin.main(new String[]{});
				JOptionPane.showMessageDialog(frmFeeReport, "You are selected Accountant Login");
			     AccountantLogin second=new AccountantLogin();
			    second.setVisible(true);    
				//frame.dispose();
			}
		});
		AccountantLogin.setForeground(new Color(128, 0, 128));
		AccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AccountantLogin.setBackground(new Color(176, 196, 222));
		AccountantLogin.setBounds(128, 175, 183, 42);
		frmFeeReport.getContentPane().add(AccountantLogin);
	}
}
