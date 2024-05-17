package com.sist.client;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MenuPanel extends JPanel{
	public JButton b0,b1,b2,b3,b4,b5;
	public MenuPanel() {
		setLayout(new GridLayout(1,5,5,5));
		b0 = new JButton("로그인");
		b1 = new JButton("홈");
		b2 = new JButton("검색");
		b3 = new JButton("커뮤니티");
		b4 = new JButton("게시판");
		b5 = new JButton("나가기");
		// 추가
		add(b0);add(b1); add(b2); add(b3); add(b4); add(b5);
	}
		
	
}
