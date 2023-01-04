import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class BookHotel {

	private JFrame frmBookHotel;
	private JTextField textuser;
	private JTextField texttpersons;
	private JTextField textd;
	private JTextField textno;
	private JTextField textphone;
	private JTextField texttotalprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookHotel window = new BookHotel();
					window.frmBookHotel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookHotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBookHotel = new JFrame();
		frmBookHotel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		frmBookHotel.setTitle("Book Hotel");
		frmBookHotel.getContentPane().setBackground(new Color(255, 255, 255));
		frmBookHotel.setBounds(300, 50, 1067, 742);
		frmBookHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBookHotel.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		panel.setBounds(62, 40, 529, 622);
		frmBookHotel.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(45, 93, 87, 17);
		panel.add(lblNewLabel);
		
		textuser = new JTextField();
		textuser.setFont(new Font("Tahoma", Font.BOLD, 10));
		textuser.setBounds(212, 94, 158, 19);
		panel.add(textuser);
		textuser.setColumns(10);
		
		JLabel lblSelectHotel = new JLabel("SelectHotel");
		lblSelectHotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectHotel.setBounds(45, 139, 87, 17);
		panel.add(lblSelectHotel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hotel1", "Hotel2", "Hotel3", "Hotel4", "Hotel5", "Hotel6", "Hotel7", "Hotel8", "Hotel9", "Hotel10"}));
		comboBox.setBounds(212, 137, 158, 21);
		panel.add(comboBox);
		
		JLabel lblTotalPersons = new JLabel("TotalPersons");
		lblTotalPersons.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalPersons.setBounds(45, 181, 87, 17);
		panel.add(lblTotalPersons);
		
		texttpersons = new JTextField();
		texttpersons.setColumns(10);
		texttpersons.setBounds(212, 182, 158, 19);
		panel.add(texttpersons);
		
		JLabel lblNoOfDays = new JLabel("No_of_Days");
		lblNoOfDays.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNoOfDays.setBounds(45, 227, 87, 17);
		panel.add(lblNoOfDays);
		
		textd = new JTextField();
		textd.setColumns(10);
		textd.setBounds(212, 228, 158, 19);
		panel.add(textd);
		
		JLabel lblAcNon = new JLabel("AC_NonAC");
		lblAcNon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAcNon.setBounds(45, 278, 87, 17);
		panel.add(lblAcNon);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"AC", "Non AC"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setBounds(212, 276, 158, 21);
		panel.add(comboBox_1);
		
		JLabel lblFoodIncluded = new JLabel("FoodIncluded");
		lblFoodIncluded.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFoodIncluded.setBounds(45, 321, 107, 17);
		panel.add(lblFoodIncluded);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1.setBounds(212, 319, 158, 21);
		panel.add(comboBox_1_1);
		
		JLabel lblId = new JLabel("Id\r\n");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(45, 367, 107, 17);
		panel.add(lblId);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber.setBounds(45, 416, 107, 17);
		panel.add(lblNumber);
		
		textno = new JTextField();
		textno.setFont(new Font("Tahoma", Font.BOLD, 10));
		textno.setColumns(10);
		textno.setBounds(212, 417, 158, 19);
		panel.add(textno);
		
		JLabel lblPhoneno = new JLabel("Phone_no");
		lblPhoneno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneno.setBounds(45, 462, 107, 17);
		panel.add(lblPhoneno);
		
		textphone = new JTextField();
		textphone.setFont(new Font("Tahoma", Font.BOLD, 10));
		textphone.setColumns(10);
		textphone.setBounds(212, 463, 158, 19);
		panel.add(textphone);
		
		JLabel lblTotalPrice = new JLabel("TotalPrice");
		lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalPrice.setBounds(45, 513, 107, 17);
		panel.add(lblTotalPrice);
		
		texttotalprice = new JTextField();
		texttotalprice.setColumns(10);
		texttotalprice.setBounds(212, 514, 158, 19);
		panel.add(texttotalprice);
		
		JButton btnNewButton = new JButton("Search");
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
	int Number=Integer.parseInt(textno.getText());
	ResultSet rs=st.executeQuery("select * from adddetails where Number= '"+ Number+"'");
	while(rs.next())
	{
		
		String Username=rs.getString("Username");
		textuser.setText(Username);
		
		String Phone_no=rs.getString("Phone_no");
		textphone.setText(Phone_no);
		
		int TotalPrice=rs.getInt("TotalPrice");
		texttotalprice.setText(Integer.toString(TotalPrice));
		
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(26, 567, 85, 33);
		panel.add(btnNewButton);
		
		JButton btnBookHotel = new JButton("Book Hotel");
		btnBookHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
					java.sql.Statement st;
					st=con.createStatement();
					String Username=textuser.getText();
					String SelectHotel=(String)comboBox.getSelectedItem();
					String TotalPersons=texttpersons.getText();
					String NoOfDays=textd.getText();
					String Ac_NonAC=comboBox_1.getSelectedItem().toString();
					String FoodInclued=comboBox_1_1.getSelectedItem().toString();
                    String Id=comboBox_1_1.getSelectedItem().toString();
					String Number=textno.getText();
					//String Address=textaddr.getText();
					String Phone_no=textphone.getText();
					String TotalPrice=texttotalprice.getText();
					
					PreparedStatement pstmt=con.prepareStatement("insert into hotelbook values(?,?,?,?,?,?,?,?,?,?)");
					
				    pstmt.setString(1,Username);                                               
				    pstmt.setString(2,SelectHotel);
				    pstmt.setString(3,TotalPersons);
				    pstmt.setString(4,NoOfDays);
				    pstmt.setString(5,Ac_NonAC);             
				    pstmt.setString(6,FoodInclued);
				    pstmt.setString(7, Id);
				    pstmt.setString(8,Number);
				    pstmt.setString(9,Phone_no);      
				    pstmt.setString(10,TotalPrice);      

				     pstmt.executeUpdate();
				                    
					
				     JOptionPane.showMessageDialog(null, "Record hotelbooked....", "Insert", JOptionPane.DEFAULT_OPTION);
				       textuser.setText("");
				        textno.setText("");
						//JLabel comBox = null;
						//comBox.setText("");
						texttpersons.setText("");
						textd.setText("");
						//JLabel comBox_1 = null;
						//comBox_1.setText("");
						//comboBox_1_1.setToolTipText("");
						//textId.setText("");
						textphone.setText("");
						texttotalprice.setText("");
						
						
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
			}
		});
		btnBookHotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBookHotel.setBounds(188, 567, 107, 33);
		panel.add(btnBookHotel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBookHotel.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
		
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(352, 567, 107, 33);
		panel.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Book Hotel");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(113, 10, 158, 56);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"AdharCardNo", "PassportNo", "PanCardNo", "RationCardNo"}));
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1_1.setBounds(212, 367, 158, 21);
		panel.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\bookhotel.png"));
		lblNewLabel_2.setBounds(677, 162, 319, 378);
		frmBookHotel.getContentPane().add(lblNewLabel_2);
		frmBookHotel.setVisible(true);	
	}
}
