import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckPackage {

	private JFrame checkpframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckPackage window = new CheckPackage();
					window.checkpframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckPackage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		checkpframe = new JFrame();
		checkpframe.setTitle("Travels Management System ");
		checkpframe.getContentPane().setBackground(new Color(255, 255, 255));
		checkpframe.setBounds(300, 100, 973, 640);
		checkpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkpframe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Package1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Package1 p1=new Package1();
				checkpframe.setVisible(true);
				checkpframe.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		btnNewButton.setBounds(0, 0, 253, 34);
		checkpframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Package2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Package2 p2=new Package2();
				checkpframe.setVisible(true);
				checkpframe.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnNewButton_1.setBounds(250, 0, 234, 34);
		checkpframe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Package3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Package3 p33=new Package3();
				checkpframe.setVisible(true);
				checkpframe.dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnNewButton_2.setBounds(484, 0, 234, 34);
		checkpframe.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Check Package");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 39));
		lblNewLabel_1.setBounds(337, 55, 344, 83);
		checkpframe.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserPage u1= new UserPage();
				u1.setVisible(true);
				checkpframe.dispose();
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(713, 0, 246, 34);
		checkpframe.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\dest3.jpg"));
		lblNewLabel.setBounds(0, 10, 959, 583);
		checkpframe.getContentPane().add(lblNewLabel);
		checkpframe.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
