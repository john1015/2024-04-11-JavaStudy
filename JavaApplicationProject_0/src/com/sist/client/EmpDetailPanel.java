package com.sist.client;

import javax.swing.*;
import java.net.*;
import com.sist.dao.*;
import com.sist.commons.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class EmpDetailPanel extends JPanel implements ActionListener {
	JLabel enola, enamela, jobla, salla, hiredatela, performancela, dnamela, locla, dnola;
	JLabel enola2, enamela2, jobla2, salla2, hiredatela2, performancela2, dnamela2, locla2, dnola2;
	JButton list, update;
	JLabel pLa, tLa;
	ControlPanelEmp cp;// 화면 이동
	EmpMemberDAO dao;

	public EmpDetailPanel(ControlPanelEmp cp) {
		dao = EmpMemberDAO.newInstance();
		this.cp = cp;
		setLayout(null);
    	tLa=new JLabel("사원 상세 정보",JLabel.CENTER);
    	tLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	tLa.setBounds(10, 45, 1260, 40);
    	add(tLa);
    	
    	enola=new JLabel("사번",JLabel.RIGHT);
    	enola.setBounds(350, 110, 90, 30);
    	add(enola);
    	
    	enola2=new JLabel();
    	enola2.setBounds(465, 110, 200, 30);
    	add(enola2);
    	
    	/////////////////////////////////////////////////////////////// id
    	
    	
    	enamela=new JLabel("이름",JLabel.RIGHT);
    	enamela.setBounds(350, 160, 90, 30);
    	add(enamela);
    	
    	enamela2=new JLabel();
    	enamela2.setBounds(465, 160, 200, 30);
    	add(enamela2);
    	///////////////////////////////////////////////////////////////
    	
    	
    	jobla=new JLabel("직위",JLabel.RIGHT);
    	jobla.setBounds(350, 200, 90, 30);
    	add(jobla);
    	
    	jobla2=new JLabel();
    	jobla2.setBounds(465, 200, 200, 30);
    	add(jobla2);
    	////////////////////////////////////////////////////////////////
    	
    	
    	salla=new JLabel("연봉",JLabel.RIGHT);
    	salla.setBounds(350, 240, 90, 30);
    	add(salla);
    	
    	salla2=new JLabel();
    	salla2.setBounds(465, 240, 70, 30);
    	add(salla2);
    	
    	/////////////////////////////////////////////////////////////
    	
    	hiredatela=new JLabel("입사일",JLabel.RIGHT);
    	hiredatela.setBounds(350, 280, 90, 30);
    	add(hiredatela);
    	
    	hiredatela2=new JLabel();
    	hiredatela2.setBounds(465, 280, 200, 30);
    	add(hiredatela2);
    	///////////////////////////////////////////////////////////
    	
    	
    	performancela=new JLabel("실적",JLabel.RIGHT);
    	performancela.setBounds(350, 320, 90, 30);
    	add(performancela);
    	
    	performancela2=new JLabel();
    	performancela2.setBounds(465, 320, 200, 30);
    	add(performancela2);
    	
    	////////////////////////////////////////////////////////////
    	
    	
    	dnamela=new JLabel("부서",JLabel.RIGHT);
    	dnamela.setBounds(350, 360, 90, 30);
    	add(dnamela);
    	
    	dnamela2=new JLabel();
    	dnamela2.setBounds(465, 360, 450, 30);
    	add(dnamela2);
    	
    	locla=new JLabel("근무지",JLabel.RIGHT);
    	locla.setBounds(350, 400, 90, 30);
    	add(locla);
    	
    	locla2=new JLabel();
    	locla2.setBounds(465, 400, 450, 30);
    	add(locla2);
    	///////////////////////////////////////////////////////////
    	
    	dnola=new JLabel("부서번호",JLabel.RIGHT);
    	dnola.setBounds(350, 440, 90, 30);
    	add(dnola);
    	
    	dnola2=new JLabel();
    	
    	dnola2.setBounds(465, 440, 450, 30);
    	add(dnola2);
    	////////////////////////////////////////////////////////////
    	
    	
    	
    	list=new JButton("목록");
    	update=new JButton("수정");
    	
    	JPanel p=new JPanel();
    	p.add(list);p.add(update);
    	
    	p.setBounds(350, 500, 565, 50);
    	add(p);
    	//print(null);
    	
    	list.addActionListener(this);
    	update.addActionListener(this);
    	
    	setSize(1280,720);
    	setVisible(true);
    }

	public void print(String no) {
		EmpVO vo = dao.empDetailData(no);
		this.enola2.setText(String.valueOf(vo.getEmpno()));
		enamela2.setText(vo.getEname());
		jobla2.setText(vo.getJob());
		salla2.setText(String.valueOf(vo.getSal()));
		hiredatela2.setText(vo.getHiredate().toString());
		performancela2.setText(String.valueOf(vo.getPerformance()));
		dnamela2.setText(vo.getDvo().getDname());
		locla2.setText(vo.getDvo().getLoc());
		dnola2.setText(String.valueOf(vo.getDvo().getDeptno()));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == list) {
			cp.card.show(cp, "FP");
		} else if (e.getSource() == update) {
			cp.card.show(cp, "EUPDATE");
		}
	}


}