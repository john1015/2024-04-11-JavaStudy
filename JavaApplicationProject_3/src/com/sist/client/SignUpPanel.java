package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPanel extends JPanel implements ActionListener{
	JLabel title_la , ename_la, id_la, pwd_la, phone_la, email_la, add1_la, add2_la, post_la, sex_la, sal_la, hiredate_la, deptno_la,
			empno_la, job_la, content_la,birth_la;
	JTextField ename_tf, id_tf, phone_tf, email_tf, add1_tf, add2_tf, post_tf, sal_tf, hiredate_tf,
			deptno_tf, empno_tf, job_tf,birth_tf;
	JTextArea content_ta;
	JPasswordField pwd_pf;
	JButton idcheckBtn , searchpoBtn , cancelBtn , okBtn ; 
	JRadioButton sex_m , sex_w;
	ButtonGroup sex_group , io_group;
	
	
	public SignUpPanel() {
		
		title_la = new JLabel("회 원 가 입",JLabel.CENTER);
		title_la.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		setLayout(null);
		title_la.setBounds(10,10,1260,50);
		add(title_la);
		
		id_la = new JLabel("아이디");
		id_tf = new JTextField();
		id_la.setBounds(235 , 130 , 80 , 30);
		add(id_la);
		id_tf.setBounds(325,130,250,30);
		add(id_tf);
		
		pwd_la = new JLabel("비밀번호");
		pwd_pf = new JPasswordField();
		pwd_la.setBounds(235 , 170 , 80 , 30);
		add(pwd_la);
		pwd_pf.setBounds(325,170 ,250,30);
		add(pwd_pf);
	
		ename_la = new JLabel("이름");
		ename_tf = new JTextField();
		ename_la.setBounds(235 , 210 , 80 , 30);
		add(ename_la);
		ename_tf.setBounds(325,210 ,250,30);
		add(ename_tf);

		sex_la = new JLabel("성별");
		
		sex_la.setBounds(235 , 250 , 80 , 30);
		add(sex_la);
		
		sex_m = new JRadioButton("남자");
		sex_m.setFont(new Font("맑은 고딕",Font.BOLD,10));
		
		sex_w = new JRadioButton("여자");
		sex_w.setFont(new Font("맑은 고딕",Font.BOLD,10));
		
		sex_group = new ButtonGroup();
		sex_group.add(sex_m);
		sex_group.add(sex_w);
		
		sex_m.setBounds(340, 250, 80, 30);
		sex_w.setBounds(430, 250, 80, 30);
		add(sex_m);
		add(sex_w);
		
		
		birth_la = new JLabel("생년월일");
		birth_tf = new JTextField();
		birth_la.setBounds(235 , 290 , 80 , 30);
		add(birth_la);
		birth_tf.setBounds(325,290 ,250,30);
		add(birth_tf);
		
		post_la = new JLabel("우편번호");
		post_tf = new JTextField();
		post_la.setBounds(235 , 330 , 80 , 30);
		add(post_la);
		post_tf.setBounds(325, 330 ,100,30);
		add(post_tf);

		add1_la = new JLabel("주소");
		add1_la.setBounds(235 , 360 , 80 , 30);
		add(add1_la);
		
		add1_tf = new JTextField();
		add1_tf.setBounds(325,360 ,250,30);
		add(add1_tf);
		
		
		add2_la = new JLabel("상세주소");
		add2_tf = new JTextField();
		add2_la.setBounds(235 , 400 , 80 , 30);
		add(add2_la);
		add2_tf.setBounds(325,400 ,250,30);
		add(add2_tf);

		phone_la = new JLabel("전화번호");
		phone_tf = new JTextField();
		phone_la.setBounds(235 , 440 , 80 , 30);
		add(phone_la);
		phone_tf.setBounds(325,440 ,250,30);
		add(phone_tf);

		email_la = new JLabel("이메일");
		email_tf = new JTextField();
		email_la.setBounds(235 , 480 , 80 , 30);
		add(email_la);
		email_tf.setBounds(325,480 ,250,30);
		add(email_tf);

		empno_la = new JLabel("사원번호");
		empno_tf = new JTextField();
		empno_la.setBounds(725 , 130 , 80 , 30);
		add(empno_la);
		empno_tf.setBounds(815,130 ,250,30);
		add(empno_tf);

		deptno_la = new JLabel("부서번호");
		deptno_tf = new JTextField();
		deptno_la.setBounds(725 , 170 , 80 , 30);
		add(deptno_la);
		deptno_tf.setBounds(815,170 ,250,30);
		add(deptno_tf);

		job_la = new JLabel("직책");
		job_tf = new JTextField();
		job_la.setBounds(725 , 210 , 80 , 30);
		add(job_la);
		job_tf.setBounds(815,210 ,250,30);
		add(job_tf);

		sal_la = new JLabel("연봉");
		sal_tf = new JTextField();
		sal_la.setBounds(725 , 250 , 80 , 30);
		add(sal_la);
		sal_tf.setBounds(815,250 ,250,30);
		add(sal_tf);

		hiredate_la = new JLabel("입사일");
		hiredate_tf = new JTextField();
		hiredate_la.setBounds(725 , 290 , 80 , 30);
		add(hiredate_la);
		hiredate_tf.setBounds(815,290 ,250,30);
		add(hiredate_tf);

		content_la = new JLabel("소개");
		content_ta = new JTextArea();
		content_la.setBounds(725 , 340 , 80 , 30);
		add(content_la);
		content_ta.setBounds(815,340 ,400,150);
		add(content_ta);
		
		
		idcheckBtn = new JButton("중복검사");
		add(idcheckBtn);
		idcheckBtn.setBounds(575, 130, 80, 30);
		
		searchpoBtn = new JButton("우편번호 검색");
		add(searchpoBtn);
		searchpoBtn.setBounds(425, 330, 100, 30);
		
		cancelBtn = new JButton("취소");
		okBtn = new JButton("확인");
		
		io_group = new ButtonGroup();
		io_group.add(cancelBtn);
		io_group.add(okBtn);
		
		cancelBtn.setBounds(550, 600, 80, 30);
		okBtn.setBounds(660, 600, 80, 30);
		add(cancelBtn);
		add(okBtn);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(cancelBtn == e.getSource()) {
			System.exit(0);
		}
	}
	

}