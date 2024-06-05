package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class ClientMain extends JFrame{
	CardLayout card = new CardLayout();
	LoginPanel lp = new LoginPanel();
	MainPanel mp = new MainPanel();
	SignUpPanel sp = new SignUpPanel();
	
	public ClientMain() {
		setLayout(card);
		add("SP",sp);
		add("MP",mp);
		add("LOGIN" , lp);
		
		setSize(1280,720);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		} catch (Exception ex) {
		}
		new ClientMain();
	}
}
