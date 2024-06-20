package com.sist.client;

import java.util.*;
import com.sist.dao.*;
import com.sist.commons.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class FindPanel extends JPanel implements ActionListener , MouseListener{
	JTable table;
	DefaultTableModel model;
	JTextField tf;
	JButton b;
	EmpMemberDAO dao;
	ControlPanelEmp cp;
	TableColumn column;
	
	public FindPanel(ControlPanelEmp cp) {
		dao = EmpMemberDAO.newInstance();
		this.cp = cp;
		
		setLayout(new BorderLayout()); // 위아래 배치(North,South) // 똑같은거여러개 => Grid // 내가 지정하기 null
		tf = new JTextField(20);
		b = new JButton("검색");
		
		JPanel p =new JPanel();
		p.add(tf);
		p.add(b);
		add("North",p);
		
		String[] col = {"사번", "이름", "직위", "연봉", "입사일", "부서명", "근무지", "실적"};
		Object[][] row = new Object[0][8];
		
		model = new DefaultTableModel(row,col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			
		};
		
		table = new JTable(model);
		table.setRowHeight(35);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false); // Vertical
		JScrollPane js = new JScrollPane(table);
		add("Center",js);
		
		for (int i = 0; i < col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i==0) 
				column.setPreferredWidth(30);
			else if(i==1)
				column.setPreferredWidth(100);
			else if(i==2)
				column.setPreferredWidth(500);
			else if(i==3)
				column.setPreferredWidth(150);
		}
		
		tf.addActionListener(this);
		b.addActionListener(this);
		table.addMouseListener(this);
		
		setSize(1280,720);
		setVisible(true);
	}
	
	public void print()	{
		
		//List<EmpVO> = dao.empDetailData(ABORT);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b || e.getSource()== tf) {
			String ename = tf.getText();
			
			//int row=table.getSelectedRow();
			//String eno=model.getValueAt(row, 0).toString();
			//int no = Integer.parseInt(eno);
			
			if(ename.length() < 1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하시오");
				tf.requestFocus();
				return;
			}
			
			// 데이터베이스 연동
			ArrayList<EmpVO> list = dao.empFindData(ename);
			if(list.size() < 1) {
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
			}
			else {
				// 테이블 전체 삭제
				for (int i = model.getRowCount()-1; i >= 0; i--) {
					model.removeRow(i);
				}
				System.out.println(list.size());
				for (EmpVO vo : list) {
					try {
						Object[] obj = {
							vo.getEmpno(),
							vo.getEname() ,
							vo.getJob(),
							vo.getSal(),
							vo.getHiredate(),
							vo.getDvo().getDname(),
							vo.getDvo().getLoc(),
							vo.getPerformance()
						};
						model.addRow(obj);
					} catch (Exception ex) {}
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == table) {
			if(e.getClickCount() == 2) {
				int row = table.getSelectedRow();
				String no = model.getValueAt(row, 0).toString();
				cp.edp.print(no);
				cp.card.show(cp, "EDETAIL");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
