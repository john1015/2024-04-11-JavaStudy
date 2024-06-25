package com.sist.main;

import java.util.*;
import com.sist.dao.*;

public class UserMain {
	public static void main(String[] args) {
		StudentDAO dao = StudentDAO.newInstance();
		List<StudentVO> list = dao.studentAllData();
		for (StudentVO vo : list) {
			System.out.println(vo.getHakbun()+" "+vo.getName()+" "+vo.getKor()+" "+vo.getEng()+" "+vo.getMath());
		}
		System.out.println("==================================");
		
		// 추가
		/*
		Scanner scan = new Scanner(System.in);
		StudentVO vo = new StudentVO();
		System.out.print("이름을 입력해라 : ");
		String name = scan.next();
		vo.setName(name);
		
		System.out.println("국어 영어 수학 점수를 입력해라(ex 90 90 90) : ");
		vo.setKor(scan.nextInt());
		vo.setEng(scan.nextInt());
		vo.setMath(scan.nextInt());
		
		dao.studentInsert(vo);
		System.out.println("추가 되었습니다!");
		
		for (StudentVO vo2 : list) {
			System.out.println(vo2.getHakbun() +" "+vo2.getName()+" "+vo2.getKor()+" "+vo2.getEng()+" "+vo2.getMath());
		}*/
		
		//삭제
		/*
		System.out.println("=======================================");
		System.out.println("삭제할 학번 : ");
		Scanner scan = new Scanner(System.in);
		int hak = scan.nextInt();
		dao.studentDelete(hak);
		List<StudentVO> list2 = dao.studentAllData();
		for (StudentVO vo : list2) {
			System.out.println(vo.getHakbun()+" "+vo.getName()+" "+vo.getKor()+" "+vo.getEng()+" "+vo.getMath());
		}
		*/
		
		System.out.println("============= 수정 ==================");
		Scanner scan = new Scanner(System.in);
		StudentVO vo = new StudentVO();
		System.out.println("학번 : ");
		int hak = scan.nextInt();
		vo.setHakbun(hak);
		
		System.out.print("이름 : ");
		String name = scan.next();
		vo.setName(name);
		
		System.out.print("국어 영어 수학 (90 90 90) : ");
		vo.setKor(scan.nextInt());
		vo.setEng(scan.nextInt());
		vo.setMath(scan.nextInt());
		
		// 수정
		dao.studentUpdate(vo);
		
		// 출력
		List<StudentVO> list3 = dao.studentAllData();
		for (StudentVO vo3 : list3) {
			System.out.println(vo3.getHakbun()+" "+vo3.getName()+" "+vo3.getKor()+" "+vo3.getEng()+" "+vo3.getMath());
		}
		
	}
}
