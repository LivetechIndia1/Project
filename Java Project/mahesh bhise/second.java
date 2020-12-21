package gui1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class second extends JFrame {

	private JPanel contentPane;
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
					second frame = new second();
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
	public second() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A.B.M.S. Parishad's Shri Shahu Mandir Mahavidyalaya - Pune", "Abasaheb Garware College of Arts & Science - Pune", "Abeda Inamdar College For Girls - Pune", "Abhinav Kala Mahavidyalaya - Pune", "Acharya Atre Development Trust's College of Arts - Pune", "Adarsha Comprehensive College of Education & Research - Pune", "Agricultural Development Trust's Shardabai Pawar Mahila College - Pune", "All India Shri Shivaji Memorial Society - Pune", "AISSMS College of Hotel Management & Catering Technology - Pune", "AISSMS College of Pharmacy - Pune", "AISSMS Institute of Information Technology - Pune", "AISSMS Institute of Management - Pune", "AISSMS Polytechnic - Pune", "Alard School of Business Management - Pune", "Allana College of Architecture - Pune", "Allana College of Pharmacy - Pune", "Allana Institute of Management Sciences - Pune", "Anantrao Kanse Homoeopathic Medical College - Pune", "Anantrao Thopte College - Pune", "Annasaheb Magar College Hadapsar - Pune", "Annasaheb Waghire College of Arts, Science & Commerce - Pune", "Asian Academy of Professional Training - Pune", "Asian School of Cyber Laws - Pune", "Audyogik Shikshan Mandals's Institute of Business Management & Research - Pune", "Baburoaji Gholap College - Pune", "Balaji Institute of International Business - Pune", "Balaji Institute of Telecom & Management - Pune", "Balaji Law College - Pune", "Bharati Vidyapeeth's College of Ayurveda - Pune", "Bharati Vidyapeeth's College of Nursing - Pune", "Bharati Vidyapeeth's College of Physical Education - Pune", "Bharati Vidyapeeth's Jawaharlal Nehru Institute of Technology (Polytechnic) - Pune", "Bharati Vidyapeeth's Medical College - Pune", "Bharati Vidyapeeth's New Law College - Pune", "Bharati Vidyapeeth's Yashwantrao Chavan Institute of Social Science Studies & Research - Pune", "Bharatiya Jain Sanghatana's. Arts, Science & Commerce College - Pune", "Bharatiya Kala Prasarini Sabha's College of Architecture - Pune", "Bilcare Research Academy - Pune", "Bioinformatics Distributed Information Center - Pune", "Brihan Maharashtra College of Commerce - Pune", "By Ram jee Jejabhoy Medical College - Pune", "College of Management Research & Engineering - Pune", "College of Military Engineering - Pune", "Creative-i College of Creative Arts - Pune", "Cummins College of Engineering for Women - Pune", "Cusrow Wadia Institute of Technology - Pune", "D.Y. Patil College of Engineering - Pune", "DES Law College - Pune", "Dina Institute of Hotel & Business Management - Pune", "Dnyaneshwar Vidyapeeth - Pune", "Dr. Ambedkar College of Arts & Commerce - Pune", "Dr. Arvind B. Telang Senior College of Arts,Science & Commerce - Pune", "Dr. Babasaheb Ambedkar Commerce and Maharshi Shinde Arts College - Pune", "Dr. Bhanuben Nanavati College of Architecture - Pune", "Dr. D. Y. Patil Biotechnology & Bioinformatics Institute - Pune", "Dr. D. Y. Patil Institute of Hotel Management & Catering Technology - Pune", "Dr. D. Y. Patil Pratishthan's Institute of Pharmaceutical Sciences & Research - Pune", "Dr. D. Y. Patil Pratishthan's Padmashree Arts,Commerce & Science College - Pune", "Dr. Vikhe Patil Foundation's Centre for Management Research & Development - Pune", "Ekalavya Shikshan Sanstha's Polytechnic - Pune", "Fergusson College - Pune", "Foundation For Liberal & Management Education - Pune", "Garware College of Commerce - Pune", "Genba Sopanrao Moze College of Engineering - Pune", "Genesis Insititute Of Business Managemen - Pune", "Government College of Engineering - Pune", "Government Polytechnic - Pune", "Gramonnati Mandals Arts, Commerce & Science College - Pune", "H V Desai College - Pune", "H.G.M. Azam College of Education for Girls - Pune", "Hon. Balasaheb Jadhav Arts, Commerce & Science College - Pune", "ICFAI Business School - Pune", "Indian Institute for Aeronautical Engineering & Information Technology - Pune", "Indian Institute of e-Business Management - Pune", "Indian Law Society's Law College - Pune", "Indira College of Commerce & Science - Pune", "Indira College of Engineering & Management - Pune", "Indira Institute of Management - Pune", "Indira School of Communications - Pune", "Indrayani Vidya Mandir's Indrayani Mahavidyalaya - Pune", "Institute for Studies in Technology & Engineering - Pune", "Institute of Business Management & Research - Pune", "Institute of International Business & Research - Pune", "Institute of Management Education - Pune", "International Institute of Information Technology - Pune", "International Institute of Management Studies - Pune", "International School of Business & Media - Pune", "Jawantrao Sawant Insitute of Management & Research - Pune", "Jayawant Institute of Computer Application - Pune", "Jayawantrao Sawant College of Engineering - Pune", "K. T. S. P. Mandal's Hutatma Rajguru Mahavidyalaya - Pune", "KIIT School of Management - Pune", "Knowledge - Divine Information Technology - Pune", "Lokmanya Medical Foundation - Pune", "Loyala College - Pune", "M J S Mandal's Institute of Management, Social Sciences & Research - Pune", "M. S. Kakade College - Pune", "Maeer MITS Institute of Design - Pune", "Maharashtra Academy of Engineering - Pune", "Maharashtra Institute of Medical Education & Research - Pune", "Maharashtra Institute of Technology - Pune", "Maharashtra State Institute of Hotel Management & Catering Technology - Pune", "Mamasahebh Mohol College - Pune", "Manghanmal Udharam College of Commerce - Pune", "Manikchand Dhariwal Institute of Management & Rural Technology - Pune", "Marathawada Mitra Mandal's College of Commerce - Pune", "Marathwada Mitra Mandal - Pune", "MCE Society's Abeda Inamdar Senior College For Girls - Pune", "MES College of Engineering - Pune", "MIT College of Engineering - Pune", "MIT School of Business - Pune", "MIT School of Management - Pune", "MITCON Institute of Management - Pune", "Modern College of Arts, Science & Commerce - Pune", "Modern College of Engineering - Pune", "Modern College of Pharmacy - Pune", "Modern Education Society's College of Engineering - Pune", "MTE Society's Dhondumama Sathe Homoeopathic Medical College - Pune", "N.G.Naralkar Institute of Career Development & Research - Pune", "National School of Computer Studies - Pune", "Naval Centre of Marine Engineering - Pune", "Nowrosjee Wadia College - Pune", "Nutan Maharashtra Vidya Polytechnic - Pune", "P.D.E.A.'s College of Engineering - Pune", "P.E.Society's Modern College of Education (for Ladies) - Pune", "Pimpri Chinchwad College of Engineering - Pune", "Pimpri Chinchwad Polytechnic - Pune", "Poona Business School - Pune", "Poona College of Arts, Science & Commerce - Pune", "Poona Hospital and Research Centre - Pune", "Poona Institute of Management Science - Pune", "Pravara Rural Engineering College - Pune", "Prin.N.G.Naralkar Institute - Pune", "Prof. Ramkrishna More Arts, Commerce & Science College - Pune", "Pune Vidhyarthi Griha's College of Engineering & Technology - Pune", "Raja Shri Shivraj Pratishthan Adhyapak Vidyalaya - Pune", "Rajarshi Shahu College of Engineering - Pune", "Rajmata Jijau Shikshan Prasarak Mandal - Pune", "Ramkrishna More Arts, Commerce & Science College - Pune", "S. N. D. T. College of Education for Women - Pune", "S.B.B alias Appasaheb Jedhe Arts, Commerce & Science College - Pune", "School of Fashion Technology - Pune", "Sharda Adhyapak Vidyalaya - Pune", "Shivnagar Vidya Prasarak Mandal's College of Engineering - Pune", "Shivnagar Vidya Prasarak Mandal's College of Pharmacy - Pune", "Shivprasad Sadanand Jaiswal College - Pune", "Shree Siddhivinayak Arts & Commerce Mahila Mahavidyalaya - Pune", "Shreemati Nathibai Damodar Thackersey Arts & Commerce College for Women - Pune", "Shri Shiv Chhatrapati College of Arts, Science & Commerce - Pune", "Shri. Sant Tukaram Shikshan Prasarak Mandal's Adhaypak Mahavidyalaya - Pune", "Sinhgad Business School - Pune", "Sir Parashurambhau College - Pune", "Smt Kashibai Navale College of Engineering - Pune", "Smt. Hiraben Nanavati Institute of Management & Research for Women - Pune", "Sou Nirmalatai Thopte College of Eduction - Pune", "Sri Savitribai Phule polytechnic - Pune", "St. Vincent's College of Commerce - Pune", "SunBeam Institute of Information Technology - Pune", "Symbiosis Centre for Information Technology - Pune", "Symbiosis Centre of Design - Pune", "Symbiosis Institute of Business Management - Pune", "Symbiosis Institute of Geoinformatics - Pune", "Symbiosis Institute of Health Science - Pune", "Symbiosis Institute of Management Studies - Pune", "Symbiosis Institute of Mass Communication - Pune", "Symbiosis Institute of Telecom Management - Pune", "School of Fashion Technology - Pune", "Symbiosis International Cultural Centre of Arts & Commerce College - Pune", "Symbiosis Society's Law College - Pune", "Synergy Institute of Advanced Management - Pune", "Tikaram Jagannath Arts,Commerce & Science College - Pune", "Tilak Ayurveda Mahavidyalaya - Pune", "Tilak College of Education - Pune", "Tilak Maharashtra Vidyapeeth - Pune", "Vidya Bhavan College of Commerce - Pune", "Vidya Pratishtan's College of Education - Pune", "Vidya Pratishthan's Institute of Information Technology - Pune", "Vidya Pratisthan`s College of Engineering - Pune", "Vidya Vikas Mandal's Arts & Commerce College - Pune", "Vishwakarma Institute of Management - Pune", "Vishwakarma Institute of Technology - Pune", "Vivekanand Education Society's Institute of Technology - Pune", "VLSI Design Research Centre, ICIT - Pune", "Waghire College - Pune", "Yashwantrao Chavan Academy of Development Administration - Pune", "Yashwantrao Chavan Law College - Pune", "Other"}));
		comboBox.setSelectedItem(null);
		JLabel lblCollageName = new JLabel("College Name :");
		
		JLabel lblBranch = new JLabel("Branch :");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Computer Science and Engineering. ...", "Electronics and Communication Engineering. ...", "Mechanical Engineering. ...", "Electrical Engineering. ...", "Civil Engineering. ...", "Chemical Engineering. ...", "Biochemical / Biomedical Engineering. ...", "Aerospace / Aeronautical Engineering."}));
		comboBox_1.setSelectedItem(null);
		JLabel lblAddmissionDate = new JLabel("Addmission Date :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCollageAddress = new JLabel("Collage Address :");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Submit Docoments :");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setMaximumRowCount(10);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1.Class X Board Examinations Certificate (Self-Attested Photocopy)", "2. Class X Marks-sheet (Self-Attested Photocopy)", "3. Class XII Marks-sheet (Self-Attested Photocopy)", "4. Class XII Provisional Certificate (Self-Attested Photocopy) & Original Certificate", "5. Character Certificate (recent)", "6. SC/ST/PwD/ Certificate (in the name of the candidate) issued by the competent", "authority (also show original certificate).", "7. OBC (Non-Creamy Layer) Certificate (in the name of the Candidate) issued by", "competent authority.", "8. Transfer Certificate from school/College as well as Migration Certificate from", "Board/University is required from those students who have passed senior secondary", "exams from outside Delhi.", "9. At least three passport size self-attested photographs.", "10. Photocopy of Address proof like Voter ID, Adhar Card, Ration Card, Driving", "License photocopy & also show original at the name of student seeking admission."}));
		comboBox_2.setSelectedIndex(10);
		comboBox_2.setSelectedItem(null);
		//GroupLayout gl_contentPane = new GroupLayout(contentPane);
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1=textField.getText();
				String t2=textField_1.getText();
				String t6=(String) comboBox.getSelectedItem();
				String t3=(String) comboBox_1.getSelectedItem();
				String t4=(String) comboBox_2.getSelectedItem();
				String t5=textField_2.getText();
				//String t6=chckbxNewCheckBox.getSelected();
				if (t1.hashCode() == 0 || t2.hashCode() == 0 || t3.hashCode() == 0 || t4.hashCode() == 0|| t5.hashCode() == 0 )
			    {
			        JOptionPane.showMessageDialog(null, "Some fields are empty!");
			    }
				 else
				    {
				        JOptionPane.showMessageDialog(null, "Account Created");
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/project","root","joker");
					PreparedStatement stmt=con.prepareStatement("insert into cllege1 values(?,?,?,?,?,?)");
					stmt.setString(1, t6);
					stmt.setString(2, t3);
					stmt.setString(3, t1);
					stmt.setString(4, t2);
					stmt.setString(5, t5);
					stmt.setString(6, t4);
					
					int i=stmt.executeUpdate();
					System.out.print(i+"records inserted");
					con.close();
				
				}catch(Exception e1){
					System.out.print(e1);
				}
				System.out.println("\n"+"College Name="+t6 +"\n"+"Branch="+t3+"\n"+"Addmission Date="+t1+"\n"+"Collage Address="+t2+"\n"+"College Names"+t5+"\n"+"Submit Docoments="+t4);
				JOptionPane.showMessageDialog(null,"Submit Form");	
				JOptionPane.showMessageDialog(null,"Thank You");
			}
				
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("College Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCollageName))
						.addComponent(lblAddmissionDate, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCollageAddress, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(comboBox_2, 0, 0, Short.MAX_VALUE)
						.addComponent(textField_1, 206, 206, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 0, Short.MAX_VALUE)
						.addComponent(comboBox_1, 0, 206, Short.MAX_VALUE)
						.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(202)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(202, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(229)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(213, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCollageName)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddmissionDate))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCollageAddress)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addComponent(btnNewButton)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
