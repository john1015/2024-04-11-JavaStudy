package com.sist.client;

import javax.swing.*;
import java.awt.*;

public class SignUpPanel extends JPanel {
	JLabel title_la , ename_la, id_la, pwd_la, phone_la, email_la, add1_la, add2_la, post_la, sex_la, sal_la, hiredate_la, deptno_la,
			empno_la, job_la, content_la,birth_la;
	JTextField ename_tf, id_tf, phone_tf, email_tf, add1_tf, add2_tf, post_tf, sal_tf, hiredate_tf,
			deptno_tf, empno_tf, job_tf,birth_tf;
	JTextArea content_ta;
	JPasswordField pwd_pf;
	JButton idcheckBtn , searchpoBtn , cancelBtn , okBtn ; 
	JRadioButton sex;
	
	public SignUpPanel() {
		title_la = new JLabel("회 원 가 입",JLabel.CENTER);
		title_la.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		setLayout(null);
		title_la.setBounds(10,10,1260,50);
		add(title_la);
		
		id_la = new JLabel("아이디");
		id_tf = new JTextField();
		id_la.setBounds(250 , 80 , 80 , 30);
		add(id_la);
		id_tf.setBounds(340,80,250,30);
		add(id_tf);
		
		pwd_la = new JLabel("비밀번호");
		pwd_pf = new JPasswordField();
		pwd_la.setBounds(250 , 130 , 80 , 30);
		add(pwd_la);
		pwd_pf.setBounds(340,130 ,250,30);
		add(pwd_pf);
	
		ename_la = new JLabel("이름");
		ename_tf = new JTextField();
		ename_la.setBounds(250 , 170 , 80 , 30);
		add(ename_la);
		ename_tf.setBounds(340,170 ,250,30);
		add(ename_tf);

		sex_la = new JLabel("성별");
		
		sex_la.setBounds(250 , 210 , 80 , 30);
		add(sex_la);
		/*
		ename_tf.setBounds(340,210 ,250,30);
		add(ename_tf);
		*/
		
		birth_la = new JLabel("생년월일");
		birth_tf = new JTextField();
		birth_la.setBounds(250 , 250 , 80 , 30);
		add(birth_la);
		birth_tf.setBounds(340,250 ,250,30);
		add(birth_tf);
		
		post_la = new JLabel("우편번호");
		post_tf = new JTextField();
		post_la.setBounds(250 , 290 , 80 , 30);
		add(post_la);
		post_tf.setBounds(340, 290 ,250,30);
		add(post_tf);

		add1_la = new JLabel("주소");
		add1_la.setBounds(250 , 330 , 80 , 30);
		add(add1_la);
		/*
		ename_tf.setBounds(340,330 ,250,30);
		add(ename_tf);
		*/
		
		add2_la = new JLabel("상세주소");
		add2_tf = new JTextField();
		add2_la.setBounds(250 , 370 , 80 , 30);
		add(add2_la);
		add2_tf.setBounds(340,370 ,250,30);
		add(add2_tf);

		phone_la = new JLabel("전화번호");
		phone_tf = new JTextField();
		phone_la.setBounds(250 , 410 , 80 , 30);
		add(phone_la);
		phone_tf.setBounds(340,410 ,250,30);
		add(phone_tf);

		email_la = new JLabel("이메일");
		email_tf = new JTextField();
		email_la.setBounds(250 , 450 , 80 , 30);
		add(email_la);
		email_tf.setBounds(340,450 ,250,30);
		add(email_tf);

		empno_la = new JLabel("사원번호");
		empno_tf = new JTextField();
		empno_la.setBounds(750 , 250 , 80 , 30);
		add(empno_la);
		empno_tf.setBounds(840,250 ,250,30);
		add(empno_tf);

		deptno_la = new JLabel("부서번호");
		deptno_tf = new JTextField();
		deptno_la.setBounds(750 , 290 , 80 , 30);
		add(deptno_la);
		deptno_tf.setBounds(840,290 ,250,30);
		add(deptno_tf);

		job_la = new JLabel("직책");
		job_tf = new JTextField();
		job_la.setBounds(750 , 330 , 80 , 30);
		add(job_la);
		job_tf.setBounds(840,330 ,250,30);
		add(job_tf);

		sal_la = new JLabel("연봉");
		sal_tf = new JTextField();
		sal_la.setBounds(750 , 370 , 80 , 30);
		add(sal_la);
		sal_tf.setBounds(840,370 ,250,30);
		add(sal_tf);

		hiredate_la = new JLabel("입사일");
		hiredate_tf = new JTextField();
		hiredate_la.setBounds(750 , 410 , 80 , 30);
		add(hiredate_la);
		hiredate_tf.setBounds(840,410 ,250,30);
		add(hiredate_tf);

		content_la = new JLabel("소개");
		content_ta = new JTextArea();
		content_la.setBounds(250 , 500 , 80 , 30);
		add(content_la);
		content_ta.setBounds(340,500 ,400,150);
		add(content_ta);
		
		//add1_tf = new JTextField();
		
		
		idcheckBtn = new JButton("중복검사");
		searchpoBtn = new JButton("우편번호 검색");
		cancelBtn = new JButton("취소");
		okBtn = new JButton("확인");
		
		
		
	}
	

}
