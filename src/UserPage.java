import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class UserPage {

	private JFrame homeframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage window = new UserPage();
					window.homeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeframe = new JFrame();
		homeframe.setType(Type.POPUP);
		homeframe.setFont(new Font("Dialog", Font.BOLD, 12));
		homeframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		homeframe.setTitle("Travels Management System ");
		homeframe.setBounds(new Rectangle(0, 0, 1500, 750));
		homeframe.setBounds(0, 0, 1500, 830);
		homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeframe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Personal Details");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//homeframe.dispose();
				Personal_Details dd1=new Personal_Details();
				dd1.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(0, 0, 237, 56);
		homeframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Details");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 139));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeframe.dispose();
				UpdateDetails ud1=new UpdateDetails();
				ud1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(0, 54, 237, 56);
		homeframe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeframe.dispose();
				ViewPage vp1=new ViewPage();
				vp1.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 139));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(0, 109, 237, 56);
		homeframe.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Personal Details");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeframe.dispose();
				DeletePersonalDetails dpd1=new DeletePersonalDetails();
				dpd1.setVisible(true);
				
			}
		});
		btnNewButton_3.setBackground(new Color(0, 0, 139));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(0, 163, 237, 56);
		homeframe.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Check Package");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeframe.dispose();
				CheckPackage cp1=new CheckPackage();
				cp1.setVisible(true);
				
				
			}
		});
		btnNewButton_4.setBackground(new Color(0, 0, 139));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_4.setBounds(0, 218, 237, 56);
		homeframe.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Book Package");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeframe.dispose();
				BookPackage bp1=new BookPackage();
				bp1.setVisible(true);
				
				
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(0, 0, 139));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_5.setBounds(0, 273, 237, 56);
		homeframe.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("View Package");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(0, 0, 139));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewBookedHotel();
				homeframe.setVisible(true);
                homeframe.dispose();
               // this.setVisible(true);

			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		btnNewButton_6.setBounds(0, 328, 237, 56);
		homeframe.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Destination");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Destination();
				homeframe.setVisible(true);
                homeframe.dispose();
			}
		});
		btnNewButton_7.setBackground(new Color(0, 0, 139));
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_7.setBounds(0, 384, 237, 56);
		homeframe.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Hotels");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			Hotel u1= new Hotel();
				u1.setVisible(true);
				homeframe.dispose();
				
				
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBackground(new Color(0, 0, 139));
		btnNewButton_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		btnNewButton_8.setBounds(0, 439, 237, 56);
		homeframe.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("About");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AboutPage();
				homeframe.setVisible(true);
				homeframe.dispose();

								
			}
		});
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBackground(new Color(0, 0, 139));
		btnNewButton_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_9.setBounds(0, 675, 237, 63);
		homeframe.getContentPane().add(btnNewButton_9);
		
		JLabel lblNewLabel_2 = new JLabel("Travels Management System");
		lblNewLabel_2.setForeground(new Color(127, 255, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 53));
		lblNewLabel_2.setBounds(506, 0, 699, 99);
		homeframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\userlogo.jpg"));
		lblNewLabel_3.setBounds(405, 0, 90, 99);
		homeframe.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_9_1 = new JButton("Calculator");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new MyCalculator(null);
				homeframe.setVisible(true);
				homeframe.dispose();
				
				
			}
		});
		btnNewButton_9_1.setForeground(new Color(255, 255, 255));
		btnNewButton_9_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_9_1.setBackground(new Color(0, 0, 139));
		btnNewButton_9_1.setBounds(0, 737, 237, 63);
		homeframe.getContentPane().add(btnNewButton_9_1);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Maldives2.gif"));
		lblNewLabel.setBounds(235, 0, 1400, 800);
		homeframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_8_1 = new JButton("Book Hotel");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookHotel();
				homeframe.setVisible(true);
                homeframe.dispose();

			}
		});
		btnNewButton_8_1.setForeground(Color.WHITE);
		btnNewButton_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_8_1.setBackground(new Color(0, 0, 139));
		btnNewButton_8_1.setBounds(0, 490, 237, 68);
		homeframe.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_8_1_1 = new JButton("View Booked Hotel");
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewhotelbooking();
				homeframe.setVisible(true);
                homeframe.dispose();

			}
		});
		btnNewButton_8_1_1.setForeground(Color.WHITE);
		btnNewButton_8_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_8_1_1.setBackground(new Color(0, 0, 139));
		btnNewButton_8_1_1.setBounds(0, 554, 237, 61);
		homeframe.getContentPane().add(btnNewButton_8_1_1);
		
		JButton btnNewButton_8_1_2 = new JButton("All Data");
		btnNewButton_8_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8_1_2.setForeground(Color.WHITE);
		btnNewButton_8_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_8_1_2.setBackground(new Color(0, 0, 139));
		btnNewButton_8_1_2.setBounds(0, 613, 237, 63);
		homeframe.getContentPane().add(btnNewButton_8_1_2);
		homeframe.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
