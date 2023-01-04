import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

//import Login.UserPAge;

import java.awt.Color;

public class Login {

	private JFrame logframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.logframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logframe = new JFrame();
		logframe.setSize(new Dimension(1500, 900));
		logframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\rrrr.jpg"));
		logframe.setBounds(0, 0, 1408, 754);
		logframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		logframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		panel.setBounds(0, 0, 1384, 707);
		logframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 22, 1340, 663);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBounds(0, 0, 1340, 670);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("WelCome To");
		lblNewLabel_3.setBounds(524, 26, 280, 41);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 40));
		
		JLabel lblNewLabel = new JLabel("Travles Management System");
		lblNewLabel.setBounds(285, 59, 807, 83);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 50));
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\login-rounded-right.png"));
		btnNewButton.setBounds(565, 366, 165, 56);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
				java.sql.Statement st;
				st=con.createStatement();
				String Username=textField.getText();
				String Password=textField_1.getText();
				ResultSet rs=((java.sql.Statement) st).executeQuery("select * from account where Username='"+Username+"' && Password='"+Password+"'");
				if(rs.next())
				{
					if(Username.equals(Username) && Password.equals(Password))
					{
						logframe.dispose();
						UserPage u1= new UserPage();
						u1.setVisible(true);
					   JOptionPane.showMessageDialog(btnNewButton,"Login Successfully");
					   new signpage();

					}
					else
					{
						System.out.println("invalid username and password");
						
						JOptionPane.showMessageDialog(btnNewButton,"Invalid Username or Password");
						new Login();
					}
				}}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
		}

		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(587, 152, 138, 27);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(427, 193, 423, 32);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(587, 250, 113, 34);
		panel_2.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(427, 294, 423, 32);
		panel_2.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Forget Password");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forgetPassword fp= new forgetPassword();
				logframe.setVisible(true);
				logframe.dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(565, 465, 165, 46);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\xe7Mou.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1340, 660);
		panel_2.add(lblNewLabel_2);
		logframe.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
