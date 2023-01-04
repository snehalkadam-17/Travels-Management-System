//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.ImageIcon;
//import java.awt.Color;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class DeletePersonalDetails {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//	private JTextField textField_5;
//	private JTextField textField_6;
//	private JTextField textField_7;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeletePersonalDetails window = new DeletePersonalDetails();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public DeletePersonalDetails() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(new Color(255, 255, 255));
//		frame.setBounds(100, 100, 995, 588);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("Delete Customer Details");
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
//		lblNewLabel.setBounds(86, 10, 390, 55);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("Id");
//		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_1.setBounds(56, 78, 123, 22);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		textField = new JTextField();
//		textField.setBounds(248, 78, 174, 30);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblNewLabel_2 = new JLabel("Number");
//		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_2.setBounds(56, 125, 90, 27);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(248, 127, 174, 30);
//		frame.getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		JLabel lblNewLabel_3 = new JLabel("Username");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_3.setBounds(55, 172, 91, 22);
//		frame.getContentPane().add(lblNewLabel_3);
//		
//		textField_2 = new JTextField();
//		textField_2.setBounds(248, 172, 174, 30);
//		frame.getContentPane().add(textField_2);
//		textField_2.setColumns(10);
//		
//		JLabel lblNewLabel_4 = new JLabel("Gender");
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_4.setBounds(56, 215, 84, 22);
//		frame.getContentPane().add(lblNewLabel_4);
//		
//		textField_3 = new JTextField();
//		textField_3.setBounds(248, 215, 174, 30);
//		frame.getContentPane().add(textField_3);
//		textField_3.setColumns(10);
//		
//		JLabel lblNewLabel_5 = new JLabel("Country");
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_5.setBounds(56, 263, 104, 22);
//		frame.getContentPane().add(lblNewLabel_5);
//		
//		textField_4 = new JTextField();
//		textField_4.setBounds(248, 268, 174, 30);
//		frame.getContentPane().add(textField_4);
//		textField_4.setColumns(10);
//		
//		JLabel lblNewLabel_6 = new JLabel("Address");
//		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_6.setBounds(56, 313, 123, 22);
//		frame.getContentPane().add(lblNewLabel_6);
//		
//		textField_5 = new JTextField();
//		textField_5.setBounds(248, 318, 174, 30);
//		frame.getContentPane().add(textField_5);
//		textField_5.setColumns(10);
//		
//		JLabel lblNewLabel_7 = new JLabel("Phone_no");
//		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_7.setBounds(56, 363, 123, 22);
//		frame.getContentPane().add(lblNewLabel_7);
//		
//		textField_6 = new JTextField();
//		textField_6.setBounds(248, 368, 174, 30);
//		frame.getContentPane().add(textField_6);
//		textField_6.setColumns(10);
//		
//		JLabel lblNewLabel_8 = new JLabel("Email");
//		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_8.setBounds(56, 445, 104, 22);
//		frame.getContentPane().add(lblNewLabel_8);
//		
//		textField_7 = new JTextField();
//		textField_7.setBounds(248, 427, 174, 30);
//		frame.getContentPane().add(textField_7);
//		textField_7.setColumns(10);
//		
//		JButton btnNewButton = new JButton("Delete Details");
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btnNewButton.setBounds(68, 492, 174, 49);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Back");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				UserPage u1= new UserPage();
//				u1.setVisible(true);
//				
//			}
//		});
//		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btnNewButton_1.setBounds(339, 492, 152, 49);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JLabel lblNewLabel_9 = new JLabel("New label");
//		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\delete.png"));
//		lblNewLabel_9.setBounds(655, 52, 259, 363);
//		frame.getContentPane().add(lblNewLabel_9);
//		frame.setVisible(true);
//	}
//
//	public void setVisible(boolean b) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

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

public class DeletePersonalDetails extends JFrame implements ActionListener {
	Connection conn = null;
	private JFrame fradelete;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
					DeletePersonalDetails window = new DeletePersonalDetails();
					window.fradelete.setVisible(true);
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
		public DeletePersonalDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fradelete = new JFrame();
		fradelete.setTitle("DeletePersonalDetails");
		fradelete.getContentPane().setBackground(new Color(255, 255, 255));
		fradelete.setBounds(300, 50, 986, 759);
		fradelete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fradelete.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 101, 139, 36);
		fradelete.getContentPane().add(lblNewLabel);
		
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
		fradelete.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(100, 160, 114, 28);
		fradelete.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setColumns(10);
		textField.setBounds(300, 161, 197, 34);
		fradelete.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 226, 197, 34);
		fradelete.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(100, 221, 114, 36);
		fradelete.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(100, 294, 89, 28);
		fradelete.getContentPane().add(lblNewLabel_3);
		
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
		fradelete.getContentPane().add(rdbtnNewRadioButton_1);
		
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
		fradelete.getContentPane().add(rdbtnNewRadioButton);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		fradelete.setVisible(true);
		
		JLabel lblNewLabel_4 = new JLabel("Country :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(100, 357, 89, 28);
		fradelete.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(303, 358, 197, 36);
		fradelete.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 430, 197, 36);
		fradelete.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 508, 197, 36);
		fradelete.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 570, 197, 36);
		fradelete.getContentPane().add(textField_5);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(100, 426, 116, 36);
		fradelete.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone_no :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(100, 508, 116, 28);
		fradelete.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(100, 570, 76, 28);
		fradelete.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					
					int Number=Integer.parseInt(textField.getText());
					Class.forName("com.mysql.cj.jdbc.Driver");
   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
   					//java.sql.Statement st;		   
			   Statement st;			
			   PreparedStatement stmt=con.prepareStatement("delete from adddetails where Number=?");
			stmt.setInt(1, Number);
			stmt.executeUpdate();
//			System.out.println(null,"records deleted");
			JOptionPane.showMessageDialog(null, " Detail delete Successfully");
			textField.setText("");
				textField_1.setText("");
//				rdbtnNewRadioButton.setText("");                             Country='"+Country+"'     Address='"+Address+"'
					textField_2.setText("");
			    textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
	
			con.close();
				}
				catch(Exception e14)
				{
					System.out.println(e14);
				}}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(353, 648, 180, 50);
		fradelete.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Delete Details");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(122, 22, 359, 50);
		fradelete.getContentPane().add(lblNewLabel_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fradelete.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(695, 648, 180, 50);
		fradelete.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\\\Users\\\\tusha\\\\Downloads\\\\icons\\\\delete.png"));
		lblNewLabel_9.setBounds(587, 48, 380, 550);
		fradelete.getContentPane().add(lblNewLabel_9);
		
		JButton btnShow = new JButton("Search");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try
					{
						 Class.forName("com.mysql.cj.jdbc.Driver");
		   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
		   					//java.sql.Statement st;		   
					   Statement st;
					   if(e.getSource()==btnShow)
					   {
						 st=con.createStatement();
		int Number=Integer.parseInt(textField.getText());
		ResultSet rs=st.executeQuery("select * from adddetails where Number= '"+ Number+"'");
		while(rs.next())
		{
			
			String Username=rs.getString("Username");
			textField_1.setText(Username);
			
			String Country=rs.getString("Country");
			textField_2.setText(Country);
			
			String Address=rs.getString("Address");
			textField_3.setText(Address);
			
			String Phone_no=rs.getString("Phone_no");
			textField_4.setText(Phone_no);
			
			String Email=rs.getString("Email");
			textField_5.setText(Email);
			
			
			JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
		}
					   }
					}
					      
					   catch(Exception e123)
						{
							System.out.println(e123);
						}
		
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShow.setBounds(61, 648, 180, 50);
		fradelete.getContentPane().add(btnShow);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


