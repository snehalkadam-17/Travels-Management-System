import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Personal_Details extends JFrame implements ActionListener {
	Connection conn = null;
	private JFrame frmPersonaldeatilsPage;
	private JTextField textno;
	private JTextField textuser;
	private JTextField textcont;
	private JTextField textaddr;
	private JTextField textp;
	private JTextField textemail;
	private JComboBox comboBox;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personal_Details window = new Personal_Details();
					window.frmPersonaldeatilsPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	String gender;
	String ID;
		public Personal_Details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersonaldeatilsPage = new JFrame();
		frmPersonaldeatilsPage.setTitle("Personal_Deatils Page");
		frmPersonaldeatilsPage.getContentPane().setBackground(new Color(255, 255, 255));
		frmPersonaldeatilsPage.setBounds(300, 50, 986, 759);
		frmPersonaldeatilsPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonaldeatilsPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 101, 139, 36);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
//			public void itemStateChanged(ItemEvent e) {
//				ID = comboBox.getSelectedItem().toString();
//			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AdharCardNo", "PassportNo", "PanCardNo", "RationCardNo"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(303, 110, 194, 21);
		frmPersonaldeatilsPage.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(100, 160, 114, 28);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_1);
		
		textno = new JTextField();
		textno.setColumns(10);
		textno.setBounds(300, 161, 197, 34);
		frmPersonaldeatilsPage.getContentPane().add(textno);
		
		textuser = new JTextField();
		textuser.setFont(new Font("Tahoma", Font.BOLD, 10));
		textuser.setColumns(10);
		textuser.setBounds(300, 226, 197, 34);
		frmPersonaldeatilsPage.getContentPane().add(textuser);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(100, 221, 114, 36);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(100, 294, 89, 28);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			
//			public void actionPerformed(ActionEvent e) {
//				gender = rdbtnNewRadioButton_1.getText();
//			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBounds(300, 299, 103, 21);
		frmPersonaldeatilsPage.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			
//			public void actionPerformed(ActionEvent e) {
//				gender = rdbtnNewRadioButton.getText();
//			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(430, 299, 103, 21);
		frmPersonaldeatilsPage.getContentPane().add(rdbtnNewRadioButton);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		frmPersonaldeatilsPage.setVisible(true);
		
		JLabel lblNewLabel_4 = new JLabel("Country :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(100, 357, 89, 28);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_4);
		
		textcont = new JTextField();
		textcont.setColumns(10);
		textcont.setBounds(303, 358, 197, 36);
		frmPersonaldeatilsPage.getContentPane().add(textcont);
		
		textaddr = new JTextField();
		textaddr.setColumns(10);
		textaddr.setBounds(300, 430, 197, 36);
		frmPersonaldeatilsPage.getContentPane().add(textaddr);
		
		textp = new JTextField();
		textp.setColumns(10);
		textp.setBounds(300, 508, 197, 36);
		frmPersonaldeatilsPage.getContentPane().add(textp);
		
		textemail = new JTextField();
		textemail.setColumns(10);
		textemail.setBounds(300, 570, 197, 36);
		frmPersonaldeatilsPage.getContentPane().add(textemail);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(100, 426, 116, 36);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone_no :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(100, 508, 116, 28);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(100, 570, 76, 28);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
					java.sql.Statement st;
					st=con.createStatement();
					//String id=comboBox.getSelectedItem().toString();
				    String Id=(String)comboBox.getSelectedItem();
					String Number=textno.getText();
					String Username=textuser.getText();
					
					String Gender;
					if(rdbtnNewRadioButton.isSelected()) {
						Gender="Male";
					}
					else {
						Gender="Female";
					}
					
					
					String Country=textcont.getText();
					String Address=textaddr.getText();
					String Phone_no=textp.getText();
					String Email=textemail.getText();
					
					PreparedStatement pstmt=con.prepareStatement("insert into adddetails values(?,?,?,?,?,?,?,?)");
					
				    pstmt.setString(1,Id);                                               
				    pstmt.setString(2,Number);
				    pstmt.setString(3,Username);
				    pstmt.setString(4,Gender);
				    pstmt.setString(5,Country);             
				    pstmt.setString(6,Address); 
				    pstmt.setString(7,Phone_no);
				    pstmt.setString(8,Email);      
				    
				     pstmt.executeUpdate();
				                    
					
				     JOptionPane.showMessageDialog(null, "Record inserted....", "Insert", JOptionPane.DEFAULT_OPTION);
				     textno.setText("");
						textuser.setText("");
						textcont.setText("");
					    textaddr.setText("");
						textp.setText("");
						textemail.setText("");
			
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(73, 648, 180, 50);
		frmPersonaldeatilsPage.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Personal Details");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(122, 22, 359, 50);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPersonaldeatilsPage.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(332, 648, 180, 50);
		frmPersonaldeatilsPage.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\photograph-clipart-tourist-7.png"));
		lblNewLabel_9.setBounds(587, 48, 380, 550);
		frmPersonaldeatilsPage.getContentPane().add(lblNewLabel_9);
		frmPersonaldeatilsPage.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}

