package com.sist.client;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ClientMain extends JFrame implements ActionListener{
	public MenuPanel mp = new MenuPanel();
	public ControllPanel cp =new ControllPanel();
	public ClientMain() {
		// 배치 North,South,West,East,Center => BorderLayout(JFrame)
		setLayout(null);
		mp.setBounds(150, 15, 600, 30);
		add(mp);
		cp.setBounds(0, 50, 800, 530);
		add(cp);
		
		//add("North",mp);
		//add("Center",cp);
		// 윈도우 크기
		setSize(800,600);
		setVisible(true);
		//윈도우 고정
		setResizable(false);
		// X버튼 클릭시 메모리 회수 => 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mp.b1.addActionListener(this);//b1 버튼을 클릭하면 => actionPerformed를 호출
		mp.b2.addActionListener(this);
		mp.b6.addActionListener(this);
	}
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel"); // 소문자로 이름앞부분.이름전체 
		}catch(Exception ex) {}
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mp.b1==e.getSource()) {// 메뉴 1번 버튼 클릭
			cp.card.show(cp,"HOME");
		}
		else if(mp.b2==e.getSource()) {// 메뉴 2번 버튼 클릭
			cp.card.show(cp, "FIND");
		}
		else if(mp.b6==e.getSource()) {// 메뉴 2번 버튼 클릭
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
	}

}
