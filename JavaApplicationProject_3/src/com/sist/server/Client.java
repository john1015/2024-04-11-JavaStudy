package com.sist.server;

import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * 
 *    1. 전송
 *    2. 서버값을 처리
 *    ======================> 동시에 두개의 프로그램 : 쓰레드
 *    Thread
 *    
 *    1. 상속 => 확장
 *       class A extends Thread
 *    2. 인터페이스 구현
 *       class A implements Runable => 윈도우에서는 이미 상속 => 인터페이스 이용
 *       
 *    Thread
 *    생성    ========>  대기 상태  ============ 동작 ============== 휴직
 *    new Thread()     start()			     run()				sleep()
 *    															   |interrupt()
 *    										  |interrupt()
 *    ** run() 메소드 호출 ==> start()  
 *    
 *    3개
 *    Thread t1 = new Thread()
 *    Thread t2 = new Thread()
 *    Thread t3 = new Thread()
 *    
 *    => t1.start()
 *       t2.start()
 *       t3.start()   ==>    t1  t2  t3
 *       					 t1  t2  t3
 *       					 t3  t1  t2  => 우선 순위 => JVM ...
 */

public class Client extends JFrame implements ActionListener , Runnable {
	JTextField tf , tf1;
	JButton b1 , b2;
	JTextArea ta;
	String name;
	
	// 네트워크 관련
	Socket s; // 서버연결
	// 데이터 전송
	OutputStream out;
	// 서버로부터 전송값 받기
	BufferedReader in;
	JScrollBar bar;
	
	public Client() {
		tf = new JTextField(15);
		b1 = new JButton("접속");
		b2 = new JButton("종료");
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		bar = js.getVerticalScrollBar();
		tf1 = new JTextField(30);
		tf1.setEnabled(false);
		
		JPanel p = new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		add("North",p);
		ta.setEditable(false);// 편집 가능 // Enable : 편집 불가
		add("Center",js);
		add("South",tf1);
		
		setSize(350,400);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Client();
		
		
		
		/*try {
			Socket s = new Socket("192.168.0.115",4852);// 192.168.0.115 우리조 컴퓨터 ip
			// s => server
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(in.readLine());
		} catch (Exception ex) {}*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) { // 접속
			try {
				name = tf.getText();
				if(name.length() < 1) { // 강제로 입력
					tf1.requestFocus();
					return;
				}
				// 1. 소켓 생성
				s = new Socket("192.168.0.115",4852);
				// 2. 서버의 송수신 위치
				// 수신
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 송신
				out = s.getOutputStream();
				
				// 연결이 된 경우
				b1.setEnabled(false);
				tf1.setEnabled(true);
				tf1.requestFocus();
				
			} catch (Exception ex) {}
			
			new Thread(this).start(); //쓰레드 동작 // Client가 가지고 있는 
			
		} else if(e.getSource() == b2) { // 종료
			System.exit(0);
		} else if (e.getSource() == tf1) { // 채팅 문자열 보내기
			try {
				String msg = tf1.getText();
				if(msg.length()<1) return;
				
				// 입력이 된 상태 => 서버로 문자열 전송
				out.write(("["+name+"]"+msg+"\n").getBytes());
				tf1.setText("");
				tf1.requestFocus();
			} catch (Exception ex) {}
		}
	}
	// 서버에서 응답한 값을 처리하는 역할
	@Override
	public void run() {
		
		try {
			while(true) {
				String msg = in.readLine();
				ta.append(msg+"\n");
				bar.setValue(bar.getMaximum());
			}
		} catch (Exception ex) {}
	}
}
