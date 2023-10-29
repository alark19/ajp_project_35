package Restaurant;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Billing {

	 void bill() {
		JFrame frame;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		JTextField textField_3;
		JTextField textField_4;
		JTextField textField_5;
		JTextField textField_6;
		frame = new JFrame("BILLING");
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Container cn=frame.getContentPane();
		Color c=new Color(114,143,206);
		cn.setBackground(c);
		
		//Food
		JLabel lblItem = new JLabel("ITEM");
		lblItem.setBounds(50, 49, 56, 16);
		lblItem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblItem);
		
		JLabel lblNewLabel_1 = new JLabel("QUANTITY");
		lblNewLabel_1.setBounds(149, 42, 116, 30);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		//Burger
		JLabel lblNewLabel = new JLabel("Burger");
		lblNewLabel.setBounds(50, 91, 85, 25);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(149, 94, 116, 22);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(8, 91, 33, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					textField.setEditable(true);
				}
				else {
					textField.setEditable(false);
				}
			}
		});
		
		//Fries
		JLabel lblFries = new JLabel("Fries");
		lblFries.setBounds(50, 122, 85, 25);
		lblFries.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblFries);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(149, 125, 116, 22);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(8, 124, 33, 25);
		frame.getContentPane().add(checkBox);
		

		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected()) {
					textField_1.setEditable(true);
				}
				else {
					textField_1.setEditable(false);
				}
			}
		});
		
		//Tacos
		JLabel lblTacos = new JLabel("Tacos");
		lblTacos.setBounds(50, 154, 85, 25);
		lblTacos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblTacos);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(149, 157, 116, 22);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(8, 156, 34, 25);
		frame.getContentPane().add(checkBox_1);
		
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_1.isSelected()) {
					textField_2.setEditable(true);
				}
				else {
					textField_2.setEditable(false);
				}
			}
		});
		
		//Pizza
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setBounds(50, 186, 85, 25);
		lblPizza.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblPizza);
		
		JTextField textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(149, 187, 116, 22);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(8, 189, 33, 25);
		frame.getContentPane().add(checkBox_2);
		
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_2.isSelected()) {
					textField_7.setEditable(true);
				}
				else {
					textField_7.setEditable(false);
				}
			}
		});
		
		//Sandwich
		JLabel lbl_1 = new JLabel("Sandwich");
		lbl_1.setBounds(50, 216, 85, 25);
		lbl_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lbl_1);
		
		JTextField textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(149, 217, 116, 22);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(8, 219, 33, 25);
		frame.getContentPane().add(checkBox_3);
		
		checkBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_3.isSelected()) {
					textField_8.setEditable(true);
				}
				else {
					textField_8.setEditable(false);
				}
			}
		});
		
		//Hot-dog
		JLabel lbl_2 = new JLabel("Hot-Dog");
		lbl_2.setBounds(50, 246, 85, 25);
		lbl_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lbl_2);
		
		JTextField textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(149, 247, 116, 22);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(8, 249, 33, 25);
		frame.getContentPane().add(checkBox_4);
		
		checkBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_4.isSelected()) {
					textField_9.setEditable(true);
				}
				else {
					textField_9.setEditable(false);
				}
			}
		});
		
		//Veg roll
		JLabel lbl_3 = new JLabel("Veg Roll");
		lbl_3.setBounds(50, 276, 85, 25);
		lbl_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lbl_3);
		
		JTextField textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(149, 277, 116, 22);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(8, 279, 33, 25);
		frame.getContentPane().add(checkBox_5);
		
		checkBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_5.isSelected()) {
					textField_10.setEditable(true);
				}
				else {
					textField_10.setEditable(false);
				}
			}
		});
		
		//Drinks
		JLabel lblDrinks = new JLabel("Drink");
		lblDrinks.setBounds(50, 330, 85, 33);
		lblDrinks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblDrinks);
		
		String[] d = {"Select Any Drink", "Coca-Cola", "Pepsi", "Sprite", "Fanta", "Diet Coke", "Dew"};
		
		JComboBox comboBox = new JComboBox(d);
		comboBox.setBounds(149, 335, 116, 26);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(8, 335, 33, 25);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1.isSelected()) {
					comboBox.setEditable(true);
				}
				else {
					comboBox.setEditable(false);
				}
			}
		});
	
		//Total textfield
		textField_3 = new JTextField();
		textField_3.setBounds(180, 410, 107, 30);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		//Total food & Drink
		JLabel lblNewLabel_2 = new JLabel("FOOD");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(420, 43, 116, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DRINKS");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(600, 43, 125, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(420, 85, 100, 29);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(600, 85, 100, 29);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		//Reciept textfield
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setBounds(400, 200, 350, 220);
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setBounds(400, 200, 350, 220);
		frame.getContentPane().add(textArea);
		
		//Total Button
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				long amount = 0;
				
				if(chckbxNewCheckBox.isSelected()) {
					amount+=80 * Integer.parseInt(textField.getText());
				}
				if(checkBox.isSelected()) {
					amount+=40 * Integer.parseInt(textField_1.getText());
				}
				if(checkBox_1.isSelected()) {
					amount+=90 * Integer.parseInt(textField_2.getText());
				}
				if(checkBox_2.isSelected()) {
					amount+=150 * Integer.parseInt(textField_7.getText());
				}
				if(checkBox_3.isSelected()) {
					amount+=50 * Integer.parseInt(textField_8.getText());
				}
				if(checkBox_4.isSelected()) {
					amount+=75 * Integer.parseInt(textField_9.getText());
				}
				if(checkBox_5.isSelected()) {
					amount+=35 * Integer.parseInt(textField_10.getText());
				}
				textField_4.setText(Float.toString(amount));
				
				if(chckbxNewCheckBox_1.isSelected()) {
					textField_5.setText("45.0");				
				}
				else {
					textField_5.setText("0.0");
				}
				if(chckbxNewCheckBox_1.isSelected())
					textField_3.setText(Float.toString(amount + 45));
				else
					textField_3.setText(Float.toString(amount));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(21, 410, 127, 25);
		frame.getContentPane().add(btnNewButton);
		
		
		//Receipt button
		JButton btnNewButton_1 = new JButton("RECEIPT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String total="Your Bill \n ";
				if(chckbxNewCheckBox.isSelected()) {
					total=total+ " Food\n       Burger\t" + 80 * Integer.parseInt(textField.getText()) + '\n' ;
				}
				if(checkBox.isSelected()) {
					total=total+"        Fries\t" + 40 * Integer.parseInt(textField_1.getText()) + '\n' ;
				}
				if(checkBox_1.isSelected()) {
					total=total+"        Tacos\t" + 90 * Integer.parseInt(textField_2.getText()) + '\n' ;
				}
				if(checkBox_2.isSelected()) {
					total=total+"        Pizza\t" + 150 * Integer.parseInt(textField_7.getText()) + '\n';
				}
				if(checkBox_3.isSelected()) {
					total=total+"        Sandwich\t" + 50 * Integer.parseInt(textField_8.getText()) + '\n';
				}
				if(checkBox_4.isSelected()) {
					total=total+"        Hot-Dog\t" + 75 * Integer.parseInt(textField_9.getText()) + '\n' ;
				}
				if(checkBox_5.isSelected()) {
					total=total+"        Veg Roll\t" + 35 * Integer.parseInt(textField_10.getText()) + '\n' ;
				}
				if(chckbxNewCheckBox_1.isSelected()) {
					total=total+"\n  Drinks\n        "+comboBox.getSelectedItem()+"\t45";
				}
				textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
				textArea.setText(total);			
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(500, 140, 132, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		//Log-out Button
		JButton btn_1=new JButton("LOGOUT");
		btn_1.setBounds(580, 5, 100, 25);
		frame.add(btn_1);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.display();
				l.logout();
				frame.dispose();
			}
		});
		
		//Close Button	
		JButton btn_2=new JButton("CLOSE");
		btn_2.setBounds(700, 5, 80, 25);
		frame.add(btn_2);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
}
