import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hotel1 {

	private JFrame frmHotel;
	private final JLabel lblNewLabel_1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel1 window = new Hotel1();
					window.frmHotel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotel1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotel = new JFrame();
		frmHotel.setTitle("Hotel1");
		frmHotel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		frmHotel.setBounds(300, 100, 1078, 683);
		frmHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JW Marriott Hotel");
		lblNewLabel.setBounds(10, 10, 215, 51);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frmHotel.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel2 u1= new Hotel2();
				u1.setVisible(true);
				frmHotel.dispose();
			}
		});
		btnNewButton.setBounds(953, 243, 101, 51);
		frmHotel.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPage u1= new UserPage();
				u1.setVisible(true);
				frmHotel.dispose();
				
			}
		});
		btnBack.setBounds(953, 315, 101, 51);
		frmHotel.getContentPane().add(btnBack);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\OneDrive\\Pictures\\JW Marriott Hotel.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1064, 636);
		frmHotel.getContentPane().add(lblNewLabel_1);
		frmHotel.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
