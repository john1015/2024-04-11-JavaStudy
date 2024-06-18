package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
	CardLayout card = new CardLayout();
	//HomePanel hp = new HomePanel();
	ControllPanel cp = new ControllPanel();
	//EmpListPanel ep = new EmpListPanel();
	
	public MainPanel() {
		setLayout(new BorderLayout());
		/*
		 * mp.setBounds(100, 15, 800, 50); add(mp);
		 */
		add("CHAT",cp);
		cp.setBounds(10, 70, 930, 620);
		add(cp);
	}
}
