import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Hotel3 {

	private JFrame frmHotel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel3 window = new Hotel3();
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
	public Hotel3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotel = new JFrame();
		frmHotel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		frmHotel.setTitle("Hotel3");
		frmHotel.setBounds(300, 100, 1006, 657);
		frmHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotel.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(859, 219, 110, 60);
		frmHotel.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel2 u1= new Hotel2();
				u1.setVisible(true);
				frmHotel.dispose();
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(859, 313, 110, 60);
		frmHotel.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Main Page");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPage u1= new UserPage();
				u1.setVisible(true);
				frmHotel.dispose();
				
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(859, 414, 110, 60);
		frmHotel.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Hotel3");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel.setBounds(10, 10, 313, 54);
		frmHotel.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\hotel4.jpg"));
		lblNewLabel_1.setBounds(0, 0, 992, 620);
		frmHotel.getContentPane().add(lblNewLabel_1);
		frmHotel.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
