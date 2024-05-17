package com.sist.client;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class CommunityPanel extends JPanel{

	JLabel la1,la2,la3,la4,la5;
	JButton b1,b2;
	JTextField tf1,tf2;
	JTextArea ta;
	JPasswordField pf;
	
	public CommunityPanel() {
		la1 = new JLabel("글쓰기",JLabel.CENTER);
		la2 = new JLabel("이름");
		la3 = new JLabel("제목");
		la4 = new JLabel("내용");
		la5 = new JLabel("비밀번호");
		
		b1 = new JButton("글쓰기 버튼");
		b2 = new JButton("취소");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		pf = new JPasswordField();
		
		// 배치
		setLayout(null);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,35));
		la1.setBounds(10,15,1000,40);
		add(la1);// JFrame에 추가
		
		la2.setBounds(100,75,380,30);
		tf1.setBounds(185,75,550,30);
		add(tf1);
		add(la2);
		
		la3.setBounds(100,115,380,30);
		tf2.setBounds(185,115,580,30);
		add(tf2);
		add(la3);
		
		la4.setBounds(100,155,380,30);
		js.setBounds(185,155,580,200);
		add(la4);
		add(js);
		
		la5.setBounds(100,360,380,30);
		pf.setBounds(185,360,450,30);
		add(la5);
		add(pf);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		p.setBounds(135,400,750,35);
		add(p);
	}
}
