import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class ViewBookedHotel {

	private JFrame frame;
	private JTextField text;
	private JTextField text1;
	private JTextField text4;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBookedHotel window = new ViewBookedHotel();
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
	public ViewBookedHotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 984, 723);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("View Package");
		btnNewButton.setBounds(58, 587, 126, 48);
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
		int Number=Integer.parseInt(text2.getText());
		ResultSet rs=st.executeQuery("select * from  bookpackage where Number= '"+ Number+"'");
		while(rs.next())
		{
			
			String Username=rs.getString("Username");
			text.setText(Username);
			
			String TotalPersons=rs.getString("TotalPersons");
			text1.setText(TotalPersons);
			
			String Phone_no=rs.getString("Phone_no");
			text3.setText(Phone_no);
			
			int TotalPrice=rs.getInt("TotalPrice");
			text4.setText(Integer.toString(TotalPrice));
			
			
			//String Email=rs.getString("Email");
			//text5.setText(Email);
			
			
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(288, 587, 126, 48);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserPage u1 = new UserPage();
				u1.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnBack);

		JPanel panel = new JPanel();
		panel.setBounds(18, 141, 411, 407);
		panel.setBackground(SystemColor.controlHighlight);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2_5 = new JLabel("Total Price");
		lblNewLabel_2_5.setBounds(10, 365, 117, 17);
		panel.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2_4 = new JLabel("Phone_no");
		lblNewLabel_2_4.setBounds(10, 314, 117, 17);
		panel.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2_3 = new JLabel("Number");
		lblNewLabel_2_3.setBounds(10, 257, 117, 17);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2_2 = new JLabel("Id");
		lblNewLabel_2_2.setBounds(10, 201, 117, 17);
		panel.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2_1 = new JLabel("Total Persons");
		lblNewLabel_2_1.setBounds(10, 139, 117, 17);
		panel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2 = new JLabel("Select Package");
		lblNewLabel_2.setBounds(10, 77, 117, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(10, 10, 97, 29);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		text4 = new JTextField();
		text4.setBounds(206, 363, 195, 19);
		panel.add(text4);
		text4.setColumns(10);

		text3 = new JTextField();
		text3.setBounds(206, 315, 195, 19);
		panel.add(text3);
		text3.setColumns(10);

		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.BOLD, 10));
		text2.setBounds(206, 258, 195, 19);
		panel.add(text2);
		text2.setColumns(10);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(205, 195, 196, 29);
		panel.add(comboBox_1);
		comboBox_1.setModel(
				new DefaultComboBoxModel(new String[] { "AdharCardNo", "PanCardNo", "Passport", "RationCard" }));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		text1 = new JTextField();
		text1.setBounds(206, 140, 195, 19);
		panel.add(text1);
		text1.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(206, 72, 196, 27);
		panel.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Package 1", "Package 2", "Package 3" }));

		text = new JTextField();
		text.setBounds(206, 17, 195, 19);
		panel.add(text);
		text.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(18, 10, 798, 85);
		panel_1.setBackground(new Color(255, 153, 51));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("View Package");
		lblNewLabel.setBounds(77, 10, 363, 69);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));

		JSeparator separator = new JSeparator();
		separator.setBounds(671, 320, 1, 2);
		frame.getContentPane().add(separator);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\rrrr.jpg"));
		lblNewLabel_3.setBounds(0, 0, 960, 676);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setVisible(true);
	}
}
