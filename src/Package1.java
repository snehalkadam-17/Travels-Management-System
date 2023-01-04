import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package1 {

	private JFrame pack1frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package1 window = new Package1();
					window.pack1frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Package1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pack1frame = new JFrame();
		pack1frame.setTitle("Travels Management System \r\n");
		pack1frame.setBounds(300, 100, 966, 597);
		pack1frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack1frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gold Package");
		lblNewLabel.setForeground(new Color(255, 0, 153));
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 32));
		lblNewLabel.setBounds(20, 27, 397, 63);
		pack1frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6Days And 7Nights");
		lblNewLabel_1.setForeground(new Color(127, 255, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(30, 100, 280, 50);
		pack1frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Airport Assistant ");
		lblNewLabel_2.setForeground(new Color(204, 51, 204));
		lblNewLabel_2.setFont(new Font("SimSun-ExtB", Font.BOLD, 25));
		lblNewLabel_2.setBounds(20, 165, 311, 63);
		pack1frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Half Day City Tour");
		lblNewLabel_3.setForeground(new Color(255, 153, 102));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(30, 235, 270, 50);
		pack1frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Daily Buffet");
		lblNewLabel_4.setForeground(new Color(250, 250, 210));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblNewLabel_4.setBounds(20, 296, 134, 55);
		pack1frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("WelCome Drinks On Arrival");
		lblNewLabel_5.setForeground(new Color(220, 20, 60));
		lblNewLabel_5.setFont(new Font("Snap ITC", Font.PLAIN, 28));
		lblNewLabel_5.setBounds(10, 361, 458, 50);
		pack1frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Full Day 3 Island Curise   ");
		lblNewLabel_6.setForeground(new Color(51, 102, 255));
		lblNewLabel_6.setFont(new Font("Utsaah", Font.PLAIN, 31));
		lblNewLabel_6.setBounds(20, 421, 280, 35);
		pack1frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("English Specking Guide");
		lblNewLabel_7.setForeground(new Color(51, 153, 204));
		lblNewLabel_7.setFont(new Font("Serif", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(20, 466, 270, 35);
		pack1frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Book Now");
		lblNewLabel_8.setForeground(new Color(250, 128, 114));
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_8.setBounds(27, 511, 134, 39);
		pack1frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Summer Special");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 35));
		lblNewLabel_9.setBounds(395, 501, 280, 39);
		pack1frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("RS 12000/-");
		lblNewLabel_10.setForeground(new Color(124, 252, 0));
		lblNewLabel_10.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_10.setBounds(752, 483, 188, 50);
		pack1frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pack1frame.dispose();
				CheckPackage cp1=new CheckPackage();
				cp1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(775, 529, 85, 21);
		pack1frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\package1.jpg"));
		lblNewLabel_11.setBounds(0, 0, 959, 560);
		pack1frame.getContentPane().add(lblNewLabel_11);
		pack1frame.setVisible(true);
	}
}
