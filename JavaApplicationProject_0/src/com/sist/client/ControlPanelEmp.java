package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanelEmp extends JPanel {
	CardLayout card = new CardLayout();
	EmpListPanel ep = new EmpListPanel();
	FindPanel fp;
	BoardListPanel bp;
	BoardInsertPanel bip;
	BoardDetailPanel bdp;
	BoardDeletePanel bdelp;
	BoardUpdatePanel bup;
	EmpDetailPanel edp;
	EmpUpdatePanel eup;
	ChatPanel chatP = new ChatPanel();

	public ControlPanelEmp() {
		setLayout(card);
		fp = new FindPanel(this);
		ep = new EmpListPanel();
		bp = new BoardListPanel(this);
		bip = new BoardInsertPanel(this);
		bdp = new BoardDetailPanel(this);
		bdelp = new BoardDeletePanel(this);
		bup = new BoardUpdatePanel(this);
		edp = new EmpDetailPanel(this);
		eup = new EmpUpdatePanel(this);

		add("EP", ep);
		add("CHAT", chatP);
		add("FP", fp);
		add("LIST", bp);
		add("INSERT", bip);
		add("DETAIL", bdp);
		add("DELETE", bdelp);
		add("UPDATE", bup);
		add("EDETAIL", edp);
		add("EUPDATE", eup);

	}
}