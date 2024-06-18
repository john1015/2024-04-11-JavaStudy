package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.*;
import com.sist.dao.*;
import java.text.*;
import java.util.Date;

// 사번의 정보를 출력 => 조인 
public class EmpListPanel extends JPanel implements ActionListener{
    JLabel titleLa;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2;
    JLabel la = new JLabel("0 page / 0pages");
    int curpage=1;
    int totalpage=0;
    EmpMemberDAO dao;
    
    public EmpListPanel() {
        setLayout(null);
        dao.newInstance();
        titleLa = new JLabel("사원 정보", JLabel.CENTER);
        titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        titleLa.setBounds(10, 15, 930, 40);
        add(titleLa);
        
        
        String[] col = {"사번", "이름", "직위", "연봉", "입사일", "부서명", "근무지", "실적"};
        String[][] row = new String[0][8];
        model = new DefaultTableModel(row, col);
        table = new JTable(model);
        JScrollPane js = new JScrollPane(table);
        js.setBounds(10, 65, 910, 500);
        add(js);
        
        // 데이터 첨부 
        EmpMemberDAO dao = EmpMemberDAO.newInstance();
        ArrayList<EmpVO> list = dao.empListData();
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        for (EmpVO vo : list) {
            String formattedDate = "";
            try {
                Date date = inputFormat.parse(vo.getHiredate());
                formattedDate = outputFormat.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
                formattedDate = vo.getHiredate(); // 변환 실패 시 원래 문자열 사용
            }
            
            String[] data = {
                String.valueOf(vo.getEmpno()),
                vo.getEname(),
                vo.getJob(),
                String.valueOf(vo.getSal()),
                formattedDate,
                vo.getDvo().getDname(),
                vo.getDvo().getLoc(),
                String.valueOf(vo.getPerformance())
            };
            model.addRow(data);
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}