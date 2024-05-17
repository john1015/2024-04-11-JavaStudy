package com.sist.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class BoardPanel extends JPanel{

	JLabel titleLa = new JLabel("게시판",JLabel.CENTER);
	JLabel pageLa = new JLabel("0 page / 0pages");
	JButton b1,b2,b3;
	JTable table;// table 모양
	DefaultTableModel model; // 데이터관리
	// 모양 => 필요한 클래스를 포함 => 있는 그래도 사용
	// 1. 초기화 , 화면 UI => 시작 동시에 처리 => 생성자
	// => 파일 입출력 연습
	public BoardPanel() {
		b1 = new JButton("새글");
		b2 = new JButton("이전"); 
		b3 = new JButton("다음");
		String[] col = {"번호","제목","이름","작성일","조회수"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row,col);
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		//////////////////////////////////////////////////////
		// 네트워크 / 파일
		// 배치
		setLayout(null);
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
		titleLa.setBounds(10,15,1000,40);
		add(titleLa);// JFrame에 추가
		
		b1.setBounds(10,60,100,30);
		add(b1);
		
		js.setBounds(10,95,1000,380);
		add(js);
		
		JPanel p = new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		
		p.setBounds(10, 480, 950, 35);
		add(p);
	
	}
	public static void main(String[] args) {
		
		new BoardPanel();
	}

}
