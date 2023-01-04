
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JTextField;
//import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JRadioButton;
//import javax.swing.JButton;
//import javax.swing.ImageIcon;
//import java.awt.Color;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.awt.event.ActionEvent;
//
//public class UpdateDetalis {
//
//	private JFrame updateframe;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//	private JTextField textField_5;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UpdateDetalis window = new UpdateDetalis();
//					window.updateframe.setVisible(true);
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
//	public UpdateDetalis() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		updateframe = new JFrame();
//		updateframe.setTitle("Travels Management System \r\n");
//		updateframe.getContentPane().setBackground(new Color(255, 255, 255));
//		updateframe.setBounds(100, 100, 986, 731);
//		updateframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		updateframe.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("Id :");
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel.setBounds(88, 91, 94, 29);
//		updateframe.getContentPane().add(lblNewLabel);
//		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AdharNumber", "Passport", "PanNumber", "RationCard"}));
//		comboBox.setSelectedIndex(3);
//		comboBox.setToolTipText("");
//		comboBox.setBounds(249, 96, 164, 24);
//		updateframe.getContentPane().add(comboBox);
//		
//		JLabel lblNewLabel_1 = new JLabel("Number:");
//		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_1.setBounds(89, 150, 93, 37);
//		updateframe.getContentPane().add(lblNewLabel_1);
//		
//		textField = new JTextField();
//		textField.setBounds(247, 158, 179, 29);
//		updateframe.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblNewLabel_2 = new JLabel("Username:");
//		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_2.setBounds(87, 218, 111, 37);
//		updateframe.getContentPane().add(lblNewLabel_2);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(249, 226, 179, 29);
//		updateframe.getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		JLabel lblNewLabel_3 = new JLabel("Gender");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_3.setBounds(88, 280, 94, 42);
//		updateframe.getContentPane().add(lblNewLabel_3);
//		
//		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
//		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
//		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		rdbtnNewRadioButton.setBounds(249, 287, 103, 21);
//		updateframe.getContentPane().add(rdbtnNewRadioButton);
//		
//		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
//		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
//		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		rdbtnNewRadioButton_1.setBounds(355, 287, 103, 21);
//		updateframe.getContentPane().add(rdbtnNewRadioButton_1);
//		
//		JLabel lblNewLabel_4 = new JLabel("Country");
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_4.setBounds(88, 347, 80, 37);
//		updateframe.getContentPane().add(lblNewLabel_4);
//		
//		textField_2 = new JTextField();
//		textField_2.setBounds(249, 354, 177, 29);
//		updateframe.getContentPane().add(textField_2);
//		textField_2.setColumns(10);
//		
//		JLabel lblNewLabel_5 = new JLabel("Address");
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_5.setBounds(88, 431, 94, 37);
//		updateframe.getContentPane().add(lblNewLabel_5);
//		
//		textField_3 = new JTextField();
//		textField_3.setBounds(249, 431, 177, 65);
//		updateframe.getContentPane().add(textField_3);
//		textField_3.setColumns(10);
//		
//		JLabel lblNewLabel_6 = new JLabel("Phone_no");
//		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_6.setBounds(88, 521, 94, 29);
//		updateframe.getContentPane().add(lblNewLabel_6);
//		
//		textField_4 = new JTextField();
//		textField_4.setBounds(249, 529, 177, 29);
//		updateframe.getContentPane().add(textField_4);
//		textField_4.setColumns(10);
//		
//		JLabel lblNewLabel_7 = new JLabel("Email");
//		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblNewLabel_7.setBounds(85, 586, 97, 29);
//		updateframe.getContentPane().add(lblNewLabel_7);
//		
//		textField_5 = new JTextField();
//		textField_5.setBounds(256, 594, 170, 29);
//		updateframe.getContentPane().add(textField_5);
//		textField_5.setColumns(10);
//		
//		JButton btnNewButton = new JButton("Update Details");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		btnNewButton.setBounds(113, 642, 145, 42);
//		updateframe.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Back");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//				updateframe.dispose();
//				UserPage u1= new UserPage();
//				u1.setVisible(true);
//				}catch(Exception e1) {
//					System.out.println(e1);
//				}
//			}
//		});
//		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		btnNewButton_1.setBounds(334, 644, 111, 40);
//		updateframe.getContentPane().add(btnNewButton_1);
//		
//		JLabel lblNewLabel_8 = new JLabel("");
//		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Update Image1.jpg"));
//		lblNewLabel_8.setBounds(480, 106, 395, 420);
//		updateframe.getContentPane().add(lblNewLabel_8);
//		updateframe.setVisible(true);
//	}
//
//	public void setVisible(boolean b) {
//		// TODO Auto-generated method stub
//		
//	}
//}
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

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
import javax.swing.JPanel;
import javax.swing.UIManager;

public class UpdateDetails extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection conn = null;
	private JFrame frame;
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
					UpdateDetails window = new UpdateDetails();
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
	String gender;
	String ID;

	public UpdateDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Personal_Deatils Page");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(300, 50, 986, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 101, 139, 36);
		frame.getContentPane().add(lblNewLabel);
		
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
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(100, 160, 114, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setColumns(10);
		textField.setBounds(300, 161, 197, 34);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(300, 226, 197, 34);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(100, 221, 114, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(100, 294, 89, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
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
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
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
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		frame.setVisible(true);
		
		JLabel lblNewLabel_4 = new JLabel("Country :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(100, 357, 89, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(303, 358, 197, 36);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 430, 197, 36);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 508, 197, 36);
		frame.getContentPane().add(textField_4);
		
		textField_5 = 
				new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 570, 197, 36);
		frame.getContentPane().add(textField_5);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(100, 426, 116, 36);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone_no :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(100, 508, 116, 28);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(100, 570, 76, 28);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   try
				{
                	   //Toolkit Id=comboBox.getToolkit();
                	   String Number=textField.getText();
                	   String Username=textField_1.getText();
                	  // String Gender=rdbtnNewRadioButton.getText();
                   	 //  String Country=textField_2.getText();
              	  // String Address=textField_3.getText();
//                	   String Phone_no=textField_4.getText();
//                	   String Email=textField_5.getText();
//                	   
                	   Class.forName("com.mysql.cj.jdbc.Driver");
   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
   					java.sql.Statement st;
   					st=con.createStatement();
   					PreparedStatement stmt=con.prepareStatement("update adddetails set Username='"+Username+"'  where Number='"+Number+"' ");
   					
   					stmt.execute();
					JOptionPane.showMessageDialog(null, " Detail Updated Successfully");
					
   					//comboBox.setToolTipText("");
   					textField.setText("");
   					textField_1.setText("");
//   					rdbtnNewRadioButton.setText("");                             Country='"+Country+"'     Address='"+Address+"'
     					textField_2.setText("");
   				    textField_3.setText("");
  					textField_4.setText("");
   					textField_5.setText("");
			
					
					con.close();
					
				}
				catch(Exception e11)
				{
					System.out.println(e11);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(330, 648, 180, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Update Details");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(122, 22, 359, 50);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
		
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(650, 648, 180, 50);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Update Image.jfif"));
		lblNewLabel_9.setBounds(587, 48, 380, 550);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					 Class.forName("com.mysql.cj.jdbc.Driver");
	   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
	   					//java.sql.Statement st;		   
				   Statement st;
				   if(e.getSource()==btnSearch)
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
				      
				   catch(Exception e1)
					{
						System.out.println(e1);
					}
					
				
				   }

	   	
			
		
	});
			
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearch.setBounds(9, 648, 180, 50);
		frame.getContentPane().add(btnSearch);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(27, 90, 515, 536);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.light"));
		panel_1.setBounds(0, 0, 972, 722);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 153, 0));
		panel_2.setBounds(22, 10, 920, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		frame.setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
