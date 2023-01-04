import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Hotel {

	private JFrame frmHotels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frmHotels.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotels = new JFrame();
		frmHotels.setFont(new Font("Bell MT", Font.PLAIN, 15));
		frmHotels.setTitle("Hotels");
		frmHotels.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Downloads\\travel-agent.jpg"));
		frmHotels.setBounds(300, 100, 1096, 676);
		frmHotels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotels.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Hotel1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel1 u1= new Hotel1();
				u1.setVisible(true);
				frmHotels.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(22, 155, 170, 54);
		frmHotels.getContentPane().add(btnNewButton);
		
		JButton btnHotel = new JButton("Hotel2");
		btnHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel2 u1= new Hotel2();
				u1.setVisible(true);
				frmHotels.dispose();
				
			}
		});
		btnHotel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel.setBounds(22, 235, 170, 54);
		frmHotels.getContentPane().add(btnHotel);
		
		JButton btnHotel_1 = new JButton("Hotel3");
		btnHotel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_1.setBounds(22, 317, 170, 54);
		frmHotels.getContentPane().add(btnHotel_1);
		
		JButton btnHotel_2 = new JButton("Hotel4");
		btnHotel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_2.setBounds(22, 402, 170, 54);
		frmHotels.getContentPane().add(btnHotel_2);
		
		JButton btnHotel_3 = new JButton("Hotel5");
		btnHotel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_3.setBounds(22, 493, 170, 54);
		frmHotels.getContentPane().add(btnHotel_3);
		
		JButton btnHotel_4 = new JButton("Hotel6");
		btnHotel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_4.setBounds(884, 155, 170, 54);
		frmHotels.getContentPane().add(btnHotel_4);
		
		JButton btnHotel_5 = new JButton("Hotel7");
		btnHotel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_5.setBounds(884, 235, 170, 54);
		frmHotels.getContentPane().add(btnHotel_5);
		
		JButton btnHote = new JButton("Hotel8");
		btnHote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHote.setBounds(884, 317, 170, 54);
		frmHotels.getContentPane().add(btnHote);
		
		JButton btnHotel_6 = new JButton("Hotel9");
		btnHotel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_6.setBounds(884, 402, 170, 54);
		frmHotels.getContentPane().add(btnHotel_6);
		
		JButton btnHotel_7 = new JButton("Hotel10");
		btnHotel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHotel_7.setBounds(884, 493, 170, 54);
		frmHotels.getContentPane().add(btnHotel_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				UserPage u1= new UserPage();
				u1.setVisible(true);
				frmHotels.dispose();
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnBack.setBounds(472, 575, 170, 54);
		frmHotels.getContentPane().add(btnBack);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Hotels");
		lblNewJgoodiesTitle.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\bookhotel.png"));
		lblNewJgoodiesTitle.setToolTipText("");
		lblNewJgoodiesTitle.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewJgoodiesTitle.setBounds(381, 22, 307, 66);
		frmHotels.getContentPane().add(lblNewJgoodiesTitle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\hotel.jpg"));
		lblNewLabel.setBounds(0, 0, 1082, 639);
		frmHotels.getContentPane().add(lblNewLabel);
		frmHotels.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
