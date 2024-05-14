package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.*;

public class ControllPanel extends JPanel{
	public CardLayout card = new CardLayout();
	public HomePanel hp = new HomePanel();
	public FindPanel fp = new FindPanel();
	public CommunityPanel cm = new CommunityPanel();
	public ControllPanel() {
		setLayout(card);
		add("HOME",hp); 
		add("FIND",fp);
		add("COMMUNITY",cm);
		
	}
}
