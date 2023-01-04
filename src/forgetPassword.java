import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class forgetPassword {

	private JFrame frame;
	private JTextField textuser;
	private JTextField textname;
	private JTextField textpass;
	private JTextField textans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgetPassword window = new forgetPassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public forgetPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 845, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(42, 76, 516, 377);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(26, 45, 140, 26);
		panel.add(lblUsername);
		
		textuser = new JTextField();
		textuser.setFont(new Font("Tahoma", Font.BOLD, 10));
		textuser.setColumns(10);
		textuser.setBounds(199, 50, 148, 20);
		panel.add(textuser);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(26, 89, 92, 26);
		panel.add(lblName);
		
		textname = new JTextField();
		textname.setColumns(10);
		textname.setBounds(198, 98, 148, 20);
		panel.add(textname);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(21, 134, 125, 26);
		panel.add(lblPassword);
		
		textpass = new JTextField();
		textpass.setColumns(10);
		textpass.setBounds(201, 141, 148, 20);
		panel.add(textpass);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question :");
		lblSecurityQuestion.setForeground(Color.DARK_GRAY);
		lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSecurityQuestion.setBounds(21, 180, 156, 26);
		panel.add(lblSecurityQuestion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Your NickName?", "Your Lucky Number?", "Your child SuperHero?", "Your childhood Name ?"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(199, 184, 148, 20);
		panel.add(comboBox);
		
		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setForeground(Color.DARK_GRAY);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAnswer.setBounds(27, 231, 92, 26);
		panel.add(lblAnswer);
		
		textans = new JTextField();
		textans.setColumns(10);
		textans.setBounds(200, 235, 148, 20);
		panel.add(textans);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					 Class.forName("com.mysql.cj.jdbc.Driver");
	   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
	   					//java.sql.Statement st;		   
				   Statement st;
				   if(e.getSource()==btnNewButton)
				   {
					 st=con.createStatement();
	String Username=(textuser.getText());
	ResultSet rs=st.executeQuery("select * from account where Username= '"+ Username+"'");
	while(rs.next())
	{
		  
		//String Username=rs.getString("Username");
		
		//textuser.setText(Username);
		
		String Name=rs.getString("Name");
		textname.setText(Name);
		
		String Password=rs.getString("Password");
		textpass.setText(Password);
		
		//String Phone_no=rs.getString("Phone_no");
		//textField_4.setText(Phone_no);
		
		String Answer=rs.getString("Answer");
		textans.setText(Answer);
		
		JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
	}
				   }
				}
				      
				   catch(Exception e55)
					{
						System.out.println(e55);
					}
	
			}
		});
		btnNewButton.setBounds(411, 49, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg= new Login();
				frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBack.setBounds(104, 311, 92, 47);
		panel.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\forgotpassword.jpg"));
		lblNewLabel.setBounds(603, 120, 200, 234);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
