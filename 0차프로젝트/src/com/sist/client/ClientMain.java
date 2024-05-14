package com.sist.client;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ClientMain extends JFrame implements ActionListener{
	public MenuPanel mp = new MenuPanel();
	public ControllPanel cp =new ControllPanel();
	public ClientMain() {
		setLayout(null);
		mp.setBounds(150, 15, 600, 30);
		add(mp);
		cp.setBounds(0, 50, 800, 530);
		add(cp);
		
		setSize(800,600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mp.b0.addActionListener(this);
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
	}
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel"); 
		}catch(Exception ex) {}
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(mp.b0==e.getSource()) {
			new Login();
		}
		else if(mp.b1==e.getSource()) {
			cp.card.show(cp,"HOME");
		}
		else if(mp.b2==e.getSource()) {
			cp.card.show(cp, "FIND");
		}
		else if(mp.b3==e.getSource()) {
			cp.card.show(cp, "COMMUNITY");
		}
		
		else if(mp.b4==e.getSource()) {
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
	}

}
