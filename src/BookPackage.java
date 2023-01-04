import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

public class BookPackage {

	private JFrame frmBookPackge;
	private JTextField text_user;
	private JTextField text1;
	private JTextField text_no;
	private JTextField text_phone;
	private JTextField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookPackage window = new BookPackage();
					window.frmBookPackge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookPackage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookPackge = new JFrame();
		frmBookPackge.setTitle("Book Packge");
		frmBookPackge.setBounds(300, 100, 1023, 668);
		frmBookPackge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookPackge.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(497, 38, 475, 544);
		frmBookPackge.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Package");
		lblNewLabel.setBounds(51, 10, 363, 69);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		text_user = new JTextField();
		text_user.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_user.setBounds(260, 104, 195, 19);
		panel.add(text_user);
		text_user.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(51, 97, 97, 29);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Select Package");
		lblNewLabel_2.setBounds(51, 165, 117, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 159, 196, 29);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Package 1", "Package 2", "Package 3"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_1 = new JLabel("Total Persons");
		lblNewLabel_2_1.setBounds(51, 220, 117, 17);
		panel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		text1 = new JTextField();
		text1.setBounds(259, 221, 195, 19);
		panel.add(text1);
		text1.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Id");
		lblNewLabel_2_2.setBounds(51, 286, 117, 17);
		panel.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_id = new JComboBox();
		comboBox_id.setBounds(258, 280, 196, 29);
		panel.add(comboBox_id);
		comboBox_id.setModel(new DefaultComboBoxModel(new String[] {"AdharCardNo", "PanCardNo", "Passport", "RationCard"}));
		comboBox_id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3 = new JLabel("Number");
		lblNewLabel_2_3.setBounds(51, 339, 117, 17);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		text_no = new JTextField();
		text_no.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_no.setBounds(259, 337, 195, 19);
		panel.add(text_no);
		text_no.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel("Phone_no");
		lblNewLabel_2_4.setBounds(51, 395, 117, 17);
		panel.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		text_phone = new JTextField();
		text_phone.setFont(new Font("Tahoma", Font.BOLD, 10));
		text_phone.setBounds(259, 396, 195, 19);
		panel.add(text_phone);
		text_phone.setColumns(10);
		
		JLabel lblNewLabel_2_5 = new JLabel("Total Price");
		lblNewLabel_2_5.setBounds(51, 454, 117, 17);
		panel.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		text4 = new JTextField();
		text4.setBounds(259, 455, 195, 19);
		panel.add(text4);
		text4.setColumns(10);
		
		JButton btnNewButton = new JButton("Book Package");
		btnNewButton.setBounds(170, 484, 126, 48);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
					java.sql.Statement st;
					st=con.createStatement();
					//String id=comboBox.getSelectedItem().toString();
				    
					String Username=text_user.getText();
					String SelectPackage=(String)comboBox.getSelectedItem();
                    String TotalPersons=text1.getText();
					String Id=(String)comboBox_id.getSelectedItem();
					String Number=text_no.getText();
                    String Phone_no=text_phone.getText();
					String TotalPrice=text4.getText();
					PreparedStatement pstmt=con.prepareStatement("insert into bookpackage values(?,?,?,?,?,?,?)");
					
				    pstmt.setString(1,Username);                                               
				    pstmt.setString(2,SelectPackage);
				    pstmt.setString(3,TotalPersons);
				    pstmt.setString(4,Id);
				    pstmt.setString(5,Number);             
				    pstmt.setString(6,Phone_no); 
				    pstmt.setString(7,TotalPrice);      
				    
				     pstmt.executeUpdate();
				                    
					
				     JOptionPane.showMessageDialog(null, "Record Booked....", "Insert", JOptionPane.DEFAULT_OPTION);
				     text_user.setText("");
				     comboBox.setSelectedItem(SelectPackage);
                     text1.setText("");
				     comboBox_id.setSelectedItem(Id);
                     text_no.setText("");
				     text_phone.setText("");
				     text4.setText("");
				     
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(329, 484, 126, 48);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookPackge.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnShow = new JButton("Show");
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
	int Number=Integer.parseInt(text_no.getText());
	ResultSet rs=st.executeQuery("select * from adddetails where Number= '"+ Number+"'");
	while(rs.next())
	{
		
		String Username=rs.getString("Username");
		text_user.setText(Username);
		
		String Phone_no=rs.getString("Phone_no");
		text_phone.setText(Phone_no);
		
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
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShow.setBounds(10, 484, 126, 48);
		panel.add(btnShow);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\bookpackage.jpg"));
		lblNewLabel_3.setBounds(10, 0, 999, 621);
		frmBookPackge.getContentPane().add(lblNewLabel_3);
		frmBookPackge.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
