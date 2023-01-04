import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutPage {

	private JFrame frmAboutPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutPage window = new AboutPage();
					window.frmAboutPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutPage = new JFrame();
		frmAboutPage.setTitle("About Page");
		frmAboutPage.getContentPane().setBackground(new Color(255, 255, 255));
		frmAboutPage.setBounds(250, 50, 1229, 752);
		frmAboutPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAboutPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 485, 1188, 227);
		frmAboutPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBounds(10, 10, 443, 207);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnWhatIsYour = new JTextPane();
		txtpnWhatIsYour.setBackground(new Color(204, 255, 255));
		txtpnWhatIsYour.setBounds(0, 69, 443, 138);
		panel_1.add(txtpnWhatIsYour);
		txtpnWhatIsYour.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		txtpnWhatIsYour.setText("What is your biggest business challenge today?\r\nCan Marketing help you overcome it?\r\nTalk to us to explore how TMS can help.\r\n\r\n");
		
		JLabel lblNewLabel = new JLabel("Overview");
		lblNewLabel.setBounds(0, 10, 366, 52);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 204));
		panel_3.setBounds(463, 10, 357, 207);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Latest Tweet\r\n");
		lblNewLabel_1.setBackground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 10, 289, 55);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tweets by Team_TMS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(10, 89, 262, 67);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 204, 0));
		panel_6.setBounds(851, 10, 327, 207);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Special Thanks To");
		lblNewLabel_5.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(0, 0, 317, 51);
		panel_6.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 204));
		panel_7.setBounds(10, 61, 307, 136);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JTextPane txtpnTeachersAndMy = new JTextPane();
		txtpnTeachersAndMy.setBounds(10, 10, 154, 116);
		panel_7.add(txtpnTeachersAndMy);
		txtpnTeachersAndMy.setBackground(new Color(255, 153, 255));
		txtpnTeachersAndMy.setText("Teachers and my Friends who helped me in projects:)");
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(174, 23, 123, 103);
		panel_7.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\1645362.jpg"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 127, 525, 348);
		frmAboutPage.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\Make-my-trip-infographic.jpg"));
		lblNewLabel_3.setBounds(0, 0, 525, 348);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(535, 127, 673, 340);
		frmAboutPage.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTextPane txtpnWhatAreThe = new JTextPane();
		txtpnWhatAreThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnWhatAreThe.setText("What are the key take-aways from Travels Managemnt System’s campaigns?\r\n\r\n• What we believe worked very well overall was an integrated 360 degree approach to social media that focussed in not only creating awareness about the brand, their products and services, but a compelling content strategy across platforms that contributed to building their business itself. By capturing the customer’s attention irrespective of whichever platform they are in, and empowering them with engaging content, they hit the bull’s eye.\r\n\r\n• What’s critical for a business like Travels Managemnt System is not just about making the sale but in the providing an overall positive customer experience. While social media is often looked upon as something that is devoid of personal connect,Travels Managemnt System has effectively used for managing existing customer relationships by delivering outstanding service through these platforms.");
		txtpnWhatAreThe.setBounds(10, 0, 653, 330);
		panel_4.add(txtpnWhatAreThe);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 204));
		panel_5.setBounds(10, 10, 1198, 107);
		frmAboutPage.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("About Our System");
		lblNewLabel_4.setForeground(new Color(255, 153, 51));
		lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(0, 10, 349, 68);
		panel_5.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAboutPage.dispose();
				UserPage u1= new UserPage();
				u1.setVisible(true);
			}
		});
		
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setBounds(1073, 19, 85, 59);
		panel_5.add(btnNewButton);
		frmAboutPage.setVisible(true);
		
	}
}
