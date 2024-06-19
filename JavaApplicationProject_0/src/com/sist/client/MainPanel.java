package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel{
	CardLayout card = new CardLayout();
	//HomePanel hp = new HomePanel();
	ControlPanelEmp cp = new ControlPanelEmp();
	//EmpListPanel ep = new EmpListPanel();
	
	public MainPanel() {
		setLayout(new BorderLayout());
		/*
		 * mp.setBounds(100, 15, 800, 50); add(mp);
		 */
		add("CHAT",cp);
		cp.setBounds(0, 70, 1280, 620);
		add(cp);
	}
}
