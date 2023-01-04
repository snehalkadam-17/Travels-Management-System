import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Hotel2 {

	private JFrame frmHotel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel2 window = new Hotel2();
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
	public Hotel2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotel = new JFrame();
		frmHotel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		frmHotel.setTitle("Hotel 2");
		frmHotel.setBounds(300, 100, 1003, 645);
		frmHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 608, 989, 0);
		frmHotel.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Madarin Oriental Hotel 2");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(25, 10, 362, 60);
		frmHotel.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel3 h3=new Hotel3();
				h3.setVisible(true);
				frmHotel.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		//btnNewButton.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\arrow.jpg"));
		btnNewButton.setBounds(846, 144, 110, 60);
		frmHotel.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel1 u1= new Hotel1();
				u1.setVisible(true);
				frmHotel.dispose();
				
			}
		});
		btnNewButton_1.setBounds(846, 244, 110, 60);
		frmHotel.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Main Page");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPage u1= new UserPage();
				u1.setVisible(true);
				frmHotel.dispose();
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(846, 338, 110, 60);
		frmHotel.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\OneDrive\\Pictures\\Madarin Oriental Hotel 2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 989, 608);
		frmHotel.getContentPane().add(lblNewLabel_2);
		frmHotel.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
