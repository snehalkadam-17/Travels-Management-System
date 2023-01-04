import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class viewhotelbooking {

	private JFrame frame;
	private JTextField textuser;
	private JTextField texttpersons;
	private JTextField textdays;
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
					viewhotelbooking window = new viewhotelbooking();
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
	public viewhotelbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 70, 1070, 727);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(66, 26, 529, 622);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(45, 93, 87, 17);
		panel.add(lblNewLabel);
		
		textuser = new JTextField();
		textuser.setColumns(10);
		textuser.setBounds(212, 94, 158, 19);
		panel.add(textuser);
		
		JLabel lblSelectHotel = new JLabel("SelectHotel");
		lblSelectHotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectHotel.setBounds(45, 139, 87, 17);
		panel.add(lblSelectHotel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hotel1", "Hotel2", "Hotel3", "Hotel4", "Hotel5", "Hotel6", "Hotel7", "Hotel8", "Hotel9", "Hotel10"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
		
		textdays = new JTextField();
		textdays.setColumns(10);
		textdays.setBounds(212, 228, 158, 19);
		panel.add(textdays);
		
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
		textno.setColumns(10);
		textno.setBounds(212, 417, 158, 19);
		panel.add(textno);
		
		JLabel lblPhoneno = new JLabel("Phone_no");
		lblPhoneno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneno.setBounds(45, 462, 107, 17);
		panel.add(lblPhoneno);
		
		textphone = new JTextField();
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
		
		JButton btnBookHotel = new JButton(" View");
		btnBookHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try
					{
						 Class.forName("com.mysql.cj.jdbc.Driver");
		   					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
		   					//java.sql.Statement st;		   
					   Statement st;
					   if(e.getSource()==btnBookHotel)
					   {
						 st=con.createStatement();
		int Number=Integer.parseInt(textno.getText());
		ResultSet rs=st.executeQuery("select * from  hotelbook where Number= '"+ Number+"'");
		while(rs.next())
		{
			
			String Username=rs.getString("Username");
			textuser.setText(Username);
			
			//String SelectHotel=rs.getString("SelectHotel");
			//comBox.setText(SelectHotel);
			
			String TotalPersons=rs.getString("TotalPersons");
			texttpersons.setText(TotalPersons);
			
			String No_of_Days=rs.getString("No_of_Days");
			textdays.setText(No_of_Days);
			
			//String AC_NonAC=rs.getString("AC_NonAC");
			//comboBox_1_1.setText(AC_NonAC);
			
			//String FoodInclued=rs.getString("FoodInclued");
			//comboBox_1_1_1.setText(FoodInclued);
			
		//	String Id=rs.getString("Id");
			//textphone.setText(Id);
			
			String Phone_no=rs.getString("Phone_no");
			textphone.setText(Phone_no);
			
			int TotalPrice=rs.getInt("TotalPrice");
			texttotalprice.setText(Integer.toString(TotalPrice));
			
			JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
		}
					   }
					}
					      
					   catch(Exception e5)
						{
							System.out.println(e5);
						}
		
			}
		});
		btnBookHotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBookHotel.setBounds(113, 567, 107, 33);
		panel.add(btnBookHotel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserPage u1 = new UserPage();
				u1.setVisible(true);
			
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(292, 567, 107, 33);
		panel.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("View Book Hotel");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(113, 10, 316, 56);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"AdharCardNo", "PassportNo", "PanCardNo", "RationCardNo"}));
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1_1.setBounds(212, 367, 158, 21);
		panel.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\hotel-icon-set--infographic-vector-template-png_295951.jpg"));
		lblNewLabel_2.setBounds(662, 119, 366, 350);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}
}
