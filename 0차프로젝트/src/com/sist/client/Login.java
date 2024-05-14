package com.sist.client;

import javax.swing.*;

public class Login extends JFrame{
	public JLabel la1,la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
	
	
	public Login() {
		
		setTitle("Login");
		// 초기화
		la1=new JLabel("ID");
		la2=new JLabel("PWD");
		
		tf = new JTextField();
		pf= new JPasswordField();
		
		b1 = new JButton("Login");
		b2 = new JButton("Cancle");
		
		setLayout(null); 
		la1.setBounds(10, 15, 80, 30); 
		tf.setBounds(100, 15, 200, 30);
		add(la1); add(tf);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(100, 50, 200, 30);
		add(la2); add(pf);
		
		JPanel p = new JPanel();
		p.add(b1);p.add(b2);
		
		p.setBounds(10,90,325,35);
		add(p);
		
		setSize(350,170);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
