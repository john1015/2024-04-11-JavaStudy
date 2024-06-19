package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	CardLayout card = new CardLayout();
	HomePanel hp;
	GoodsDetailPanel dp;
	FindPanelShop fp;
	BoardListPanel bp;
	BoardInsertPanel bip;
	BoardDetailPanel bdp;
	BoardDeletePanel bdelp;
	BoardUpdatePanel bup;
	ChatPanel chatP = new ChatPanel();

	public ControlPanel() {
		setLayout(card);
		hp = new HomePanel(this);
		dp = new GoodsDetailPanel(this);
		fp = new FindPanelShop(this);
		bp = new BoardListPanel(this);
		bip = new BoardInsertPanel(this);
		bdp = new BoardDetailPanel(this);
		bdelp = new BoardDeletePanel(this);
		bup = new BoardUpdatePanel(this);

		add("HP", hp);
		add("CHAT", chatP);
		add("DP", dp);
		add("FP", fp);
		add("LIST", bp);
		add("INSERT", bip);
		add("DETAIL", bdp);
		add("DELETE", bdelp);
		add("UPDATE", bup);

	}
}