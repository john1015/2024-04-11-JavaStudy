package com.sist.client;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class FindPanel extends JPanel{
	JLabel la1;
	JButton b1;
	JTextField tf1,tf2;
	JTextArea ta;
	
	public FindPanel() {
		la1 = new JLabel("검 색",JLabel.CENTER);
		b1 = new JButton("검색하기");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		ta = new JTextArea();
		
		setLayout(null);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,35));
		la1.setBounds(10,15,1000,40);
		add(la1);// JFrame에 추가
		
		add(tf1);
		
		tf2.setBounds(185,115,500,30);
		add(tf2);
		
		JPanel p = new JPanel();
		p.add(b1);
		
		p.setBounds(470,115,500,40);
		add(p);
	}
}
