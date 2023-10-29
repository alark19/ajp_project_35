package Restaurant;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login {
	JLabel label_1;
	public void display() {
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Container cn=frame.getContentPane();
		Color c=new Color(114,143,206);
		cn.setBackground(c);
		
		JTextField textField_1;
		JPasswordField passwordField;
		JLabel l=new JLabel("Enter your Username and Password...!!");
		l.setBounds(215, 30, 400, 40);
		l.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.add(l);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField.setBounds(350, 182, 200, 28);
		frame.getContentPane().add(passwordField);
		
		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(218, 80, 280, 37);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(label_1);
		
		
		JLabel label = new JLabel("Username");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(218, 126, 95, 37);
		frame.getContentPane().add(label);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(218, 176, 95, 37);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(350, 132, 200, 28);
		frame.getContentPane().add(textField_1);
		
		//login button
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(218, 240, 114, 37);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Connection con = null;
				try {
					
					con = DriverManager.getConnection("jdbc:mysql://localhost/test?","root","alark@35");
					Statement statement = con.createStatement();
					String u = textField_1 .getText();
					char arr[]=passwordField.getPassword();
					String p = new String(arr);
					String sql = "SELECT * FROM data WHERE u_name='"+u+"' and pwd='"+p+"'" ;
					ResultSet rs = statement.executeQuery(sql);
					if(rs.next()) {
						label_1.setText("Login Successful!!");
						change();
						frame.dispose();
					}
					else {
						label_1.setText("Incorrect Credentials!!");
						
					}
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		
		//add customer button
		JButton btn = new JButton("ADD CUSTOMER");
		btn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn.setBounds(353, 240, 200, 37);
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer c=new customer();
				c.show();
				frame.dispose();
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public void change() {
		Billing b = new Billing();
		b.bill();	
	}
	
	public void logout() {
		label_1.setText("Logout Successfully...!!");
	}
	
}
