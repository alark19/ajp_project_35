package Restaurant;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome {

	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Container cn=frame.getContentPane();
		Color c=new Color(114,143,206);
		cn.setBackground(c);
		
		JLabel lblSimpleBillingSystem = new JLabel("FOOD BILLING SYSTEM");
		lblSimpleBillingSystem.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSimpleBillingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleBillingSystem.setBounds(200, 129, 400, 50);
		frame.getContentPane().add(lblSimpleBillingSystem);
		
		JButton btnEnter = new JButton("ENTER !!");
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.display();
				frame.dispose();
			}
		});
		btnEnter.setBounds(315, 229, 150, 40);
		frame.getContentPane().add(btnEnter);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
