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
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;

public class ViewPage extends JFrame implements ActionListener {
	Connection conn = null;
	private JFrame frmView;
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
					ViewPage window = new ViewPage();
					window.frmView.setVisible(true);
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
		public ViewPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmView = new JFrame();
		frmView.setTitle("View Page Details");
		frmView.getContentPane().setBackground(new Color(255, 255, 255));
		frmView.setBounds(300, 50, 986, 759);
		frmView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmView.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 101, 139, 36);
		frmView.getContentPane().add(lblNewLabel);
		
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
		frmView.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(100, 160, 114, 28);
		frmView.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setColumns(10);
		textField.setBounds(300, 161, 197, 34);
		frmView.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(300, 226, 197, 34);
		frmView.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(100, 221, 114, 36);
		frmView.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(100, 294, 89, 28);
		frmView.getContentPane().add(lblNewLabel_3);
		
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
		frmView.getContentPane().add(rdbtnNewRadioButton_1);
		
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
		frmView.getContentPane().add(rdbtnNewRadioButton);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		frmView.setVisible(true);
		
		JLabel lblNewLabel_4 = new JLabel("Country :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(100, 357, 89, 28);
		frmView.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(303, 358, 197, 36);
		frmView.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(300, 430, 197, 36);
		frmView.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 508, 197, 36);
		frmView.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 570, 197, 36);
		frmView.getContentPane().add(textField_5);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Address :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(100, 426, 116, 36);
		frmView.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone_no :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(100, 508, 116, 28);
		frmView.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(100, 570, 76, 28);
		frmView.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("View Details");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_8.setBounds(122, 22, 359, 50);
		frmView.getContentPane().add(lblNewLabel_8);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(52, 101, 481, 537);
		frmView.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("CheckBox.shadow"));
		panel_1.setBounds(0, 0, 967, 722);
		frmView.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(557, 89, 380, 550);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\\\Users\\\\tusha\\\\Downloads\\\\icons\\\\viewall.jpg"));
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBounds(89, 662, 180, 50);
		panel_1.add(btnNewButton);
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(327, 662, 180, 50);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmView.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 153, 0));
		panel_2.setBounds(36, 10, 843, 76);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


