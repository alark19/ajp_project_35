package Restaurant;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class customer {
		public void show()
		{	
			JFrame f=new JFrame();
			f.setBounds(100, 100, 800, 500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLayout(null);
			f.setVisible(true);
			Container cn=f.getContentPane();
			Color c=new Color(114,143,206);
			cn.setBackground(c);
			
			JTextField textField_1;
			JLabel label_1;
			
			JLabel l=new JLabel("Create your username and password Here....!");
			l.setBounds(200, 60, 500, 40);
			l.setFont(new Font("Times New Roman",Font.BOLD,20));
			f.add(l);
			
			JTextField t= new JTextField();
			t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			t.setColumns(10);
			t.setBounds(350, 182, 200, 28);
			f.getContentPane().add(t);
			
			label_1 = new JLabel("");
			label_1.setFont(new Font("Times New Roman",Font.BOLD,20));
			label_1.setBounds(235, 360, 400, 40);
			f.getContentPane().add(label_1);
			
			
			JLabel label = new JLabel("Username");
			label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			label.setBounds(218, 126, 95, 37);
			f.getContentPane().add(label);
			
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblPassword.setBounds(218, 176, 95, 37);
			f.getContentPane().add(lblPassword);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			textField_1.setColumns(10);
			textField_1.setBounds(350, 132, 200, 28);
			f.getContentPane().add(textField_1);
			
			//ADD CUSTOMER BUTTON
			JButton b = new JButton("CREATE ACCOUNT");
			b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			b.setBounds(280, 240, 220, 37);
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String u=textField_1.getText();
					String p=t.getText();
					if(u.isEmpty() && p.isEmpty()) {
						label_1.setText("Username and Password Should not be Empty");
					}
					else {
						try {
							Connection c=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "alark@35");
							PreparedStatement s=c.prepareStatement("Insert into data values (?,?)");
							s.setString(1, textField_1.getText());
							s.setString(2, t.getText());
							s.executeUpdate();
							label_1.setText("Account Created Successfully...!!");
						}
						catch(SQLException e1) {
							System.out.println(e1);
						}
					}
				}
			});
			
			//CLOSE BUTTON
			JButton btn = new JButton("BACK");
			btn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btn.setBounds(330, 300, 100, 37);
			f.add(btn);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login l=new Login();
					l.display();
					f.dispose();
				}
			});
		}
}
