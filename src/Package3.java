import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package3 {

	private JFrame pack3frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package3 window = new Package3();
					window.pack3frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Package3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pack3frame = new JFrame();
		pack3frame.setTitle("Travels Management System ");
		pack3frame.setBounds(300, 100, 1014, 637);
		pack3frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack3frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bronze Package");
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 54));
		lblNewLabel.setBounds(120, 32, 488, 69);
		pack3frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6 Days And 5 Nights");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(746, 65, 216, 57);
		pack3frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Return Airfare");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(741, 168, 155, 44);
		pack3frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Free Clubbing,Hourse Riding ");
		lblNewLabel_3.setForeground(new Color(255, 228, 181));
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(689, 130, 283, 41);
		pack3frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("WelCome Drinks On Arrival ");
		lblNewLabel_4.setForeground(new Color(255, 228, 196));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(666, 274, 297, 41);
		pack3frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Daily Buffet");
		lblNewLabel_5.setForeground(new Color(245, 222, 179));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(741, 215, 201, 30);
		pack3frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Stay In 5 Star Hotel");
		lblNewLabel_6.setForeground(new Color(204, 102, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(711, 337, 235, 30);
		pack3frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("BBQ Dinner");
		lblNewLabel_7.setForeground(new Color(65, 105, 225));
		lblNewLabel_7.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_7.setBounds(750, 422, 162, 30);
		pack3frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Book New");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Wide Latin", Font.PLAIN, 28));
		lblNewLabel_8.setBounds(22, 539, 249, 30);
		pack3frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Winter Speical");
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(341, 541, 314, 30);
		pack3frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("RS 32000/-");
		lblNewLabel_10.setForeground(Color.YELLOW);
		lblNewLabel_10.setFont(new Font("Wide Latin", Font.PLAIN, 24));
		lblNewLabel_10.setBounds(720, 536, 252, 40);
		pack3frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				CheckPackage cp1=new CheckPackage();
				cp1.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(792, 505, 85, 21);
		pack3frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\package3.jpg"));
		lblNewLabel_11.setBounds(10, 0, 980, 590);
		pack3frame.getContentPane().add(lblNewLabel_11);
		pack3frame.setVisible(true);
	}
}
