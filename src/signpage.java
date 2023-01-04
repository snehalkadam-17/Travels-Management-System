import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class signpage extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new signpage().setVisible(true);
    }

    public signpage() {
        setBounds(300, 100, 1083, 672);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblUsername.setBounds(99, 86, 140, 26);
	contentPane.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblName.setBounds(99, 123, 92, 26);
	contentPane.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblPassword.setBounds(99, 160, 125, 26);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblAnswer.setBounds(99, 234, 92, 26);
	contentPane.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Your NickName?", "Your Lucky Number?", "Your child SuperHero?", "Your childhood Name ?"}));
	comboBox.setBounds(265, 202, 148, 20);
	contentPane.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblSecurityQuestion.setBounds(99, 197, 156, 26);
	contentPane.add(lblSecurityQuestion);
        
//        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/signup.png"));
//        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
//        ImageIcon i2 = new ImageIcon(i1);
//        
//        JLabel l6 = new JLabel(i2);
//        l6.setBounds(460, 70, 200, 200);
//        add(l6);

        textField = new JTextField();
	textField.setBounds(265, 91, 148, 20);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(265, 128, 148, 20);
	contentPane.add(textField_1);

        textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(265, 165, 148, 20);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(265, 239, 148, 20);
	contentPane.add(textField_3);

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 13));
	b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(new Color(255, 255, 255));
        
	contentPane.add(b1);

	b2 = new JButton("Login Page");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(300, 289, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(new Color(255, 255, 255));
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(31, 30, 994, 566);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
	panel.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\icons\\hotel7.jpg"));
	lblNewLabel.setBounds(10, 21, 974, 536);
	panel.add(lblNewLabel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
			java.sql.Statement st;
			st=con.createStatement();
            
            if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, question, answer) values(?, ?, ?, ?, ?)";
                PreparedStatement myStmt;
               
		PreparedStatement st1 = con. prepareStatement(sql);
                //con.st1.executeUpdate(sql);

		st1.setString(1, textField.getText());
                st1.setString(2, textField_1.getText());
		st1.setString(3, textField_2.getText());
		st1.setString(4, (String) comboBox.getSelectedItem());
		st1.setString(5, textField_3.getText());

		int i = st1.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Account Created Successfully "); 
                   // frame.dispose();
                   new Login();
                    
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Login().setVisible(true);
			
            }
        }catch(Exception e){
                System.out.println(e);
        }
    }
}