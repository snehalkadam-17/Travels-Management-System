import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package2 {

	private JFrame pack2frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package2 window = new Package2();
					window.pack2frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Package2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pack2frame = new JFrame();
		pack2frame.setTitle("Travels Management System ");
		pack2frame.setBounds(300, 100, 930, 590);
		pack2frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack2frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Branze Package");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 39));
		lblNewLabel.setBounds(196, 10, 562, 52);
		pack2frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6 Days And 5 Nights");
		lblNewLabel_1.setForeground(new Color(240, 230, 140));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(25, 72, 220, 30);
		pack2frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Return Airfare");
		lblNewLabel_2.setForeground(new Color(72, 209, 204));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 136, 187, 41);
		pack2frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Free Clubbing,Hourse Riding ");
		lblNewLabel_3.setForeground(new Color(255, 228, 181));
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(10, 206, 283, 41);
		pack2frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("WelCome Drinks On Arrival ");
		lblNewLabel_4.setForeground(new Color(255, 228, 196));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(10, 271, 264, 41);
		pack2frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Daily Buffet");
		lblNewLabel_5.setForeground(new Color(245, 222, 179));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_5.setBounds(10, 336, 138, 30);
		pack2frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Stay In 5 Star Hotel");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_6.setForeground(new Color(238, 130, 238));
		lblNewLabel_6.setBounds(10, 395, 235, 30);
		pack2frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("BBQ Dinner");
		lblNewLabel_7.setForeground(new Color(65, 105, 225));
		lblNewLabel_7.setFont(new Font("Segoe Print", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(10, 452, 162, 30);
		pack2frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Book New");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Wide Latin", Font.PLAIN, 28));
		lblNewLabel_8.setBounds(25, 513, 249, 30);
		pack2frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Winter Speical");
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setFont(new Font("Wide Latin", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(310, 515, 314, 30);
		pack2frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("RS 32000/-");
		lblNewLabel_10.setForeground(Color.YELLOW);
		lblNewLabel_10.setFont(new Font("Wide Latin", Font.PLAIN, 24));
		lblNewLabel_10.setBounds(654, 513, 252, 40);
		pack2frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				CheckPackage cp1=new CheckPackage();
				cp1.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 494, 85, 21);
		pack2frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\package2.jpg"));
		lblNewLabel_11.setBounds(0, 0, 916, 553);
		pack2frame.getContentPane().add(lblNewLabel_11);
		pack2frame.setVisible(true);
	}

}
