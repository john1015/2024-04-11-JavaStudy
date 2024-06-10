package com.sist.dao;
import java.util.*; // 오라클 데이터형 => DATE => java.util.Date
import lombok.*;
@Data
public class EmpVO {
	private int empno;
	private String ename , job;
	private Date hiredate;
	private int sal,mge , comm,deptno;
	//부서 정보 => JOIN
	private DeptVo dvo = new DeptVo(); // 포함 클래스를 만든다
	
	

}
