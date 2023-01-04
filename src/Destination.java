import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Destination {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Destination window = new Destination();
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
	public Destination() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 50, 1057, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Destination 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest1();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(847, 29, 186, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDestination = new JButton("Destination 2");
		btnDestination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest2();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDestination.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDestination.setBounds(847, 129, 186, 61);
		frame.getContentPane().add(btnDestination);
		
		JButton btnDestination_1 = new JButton("Destination 3");
		btnDestination_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest3();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDestination_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDestination_1.setBounds(847, 246, 186, 61);
		frame.getContentPane().add(btnDestination_1);
		
		JButton btnDestination_2 = new JButton("Destination 4");
		btnDestination_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest4();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDestination_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDestination_2.setBounds(847, 361, 186, 61);
		frame.getContentPane().add(btnDestination_2);
		
		JButton btnDestination_3 = new JButton("Destination 5");
		btnDestination_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest5();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDestination_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDestination_3.setBounds(847, 475, 186, 61);
		frame.getContentPane().add(btnDestination_3);
		
		JButton btnDestination_4 = new JButton("Destination 6");
		btnDestination_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dest6();
				frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDestination_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDestination_4.setBounds(847, 586, 186, 61);
		frame.getContentPane().add(btnDestination_4);
		
		JLabel lblNewLabel = new JLabel("Destination ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 50));
		lblNewLabel.setBounds(306, 18, 396, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\dest1.jpg"));
		lblNewLabel_1.setBounds(10, 0, 1033, 669);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}

}
