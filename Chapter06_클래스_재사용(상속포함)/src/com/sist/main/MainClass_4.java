package com.sist.main;
/*
 *  자바 == 오라클 ==> HTML/CSS => JavaScript ==> JSP ==> Spring ==> Python ==> AWS
 *  								|				|			  |
 *  							 Ajax			MyBatis/JPA      Spring-Boot	
 *  							 Vue
 *  							 React			String-Security
 *  							----------------------------------------------------
 *  												|
 *  											MSA / CI,CD
 *  
 *  전공 / 신기술
 *  ----------
 *  => 자격증 (정보처리)
 *  => 외국어 가능(우대)
 *  ------------------
 *   서울권 4년제 
 *   						class A{
 *   							int a,b,c,d,e,f;
 *   						}
 *   						class B extends A{
 *   							// int a,b,c,d,e,f;
 *   							int k;
 *   					// 기능을 변경=> 메소드(오버라이딩)
 *   						}   
 *   					=> 실행속도가 느려진다
 *   					=> 소스를 볼 수 없기 때문에 => 가독성이 떨어진다
 *   					=> 제약조건이 많다
 *   					=> 결함성이 높아진다
 *   					------------------------------------------- 상속을 사용하지 않는다 (Spring)
 *   					=> 상속 < 포함
 *   	상속을 내리는 클래스 : super클래스 , base클래스 , 부모클레스
 *   	상속 받는 클래스 : sub클래스 , 파생클래스 , 자식클래스 , 하위클래스 
 *   
 *   	class 게시판{
 *   	글쓰기()
 *   	상세보기()
 *   	검색()
 *   	수정()
 *   	추가()
 *   	삭제()
 *   	}
 *   	class 묻고답하기 extends 게시판{
 *   	묻기() => 글쓰기 변경 => 오버라이딩
 * 		상세보기()
 *   	검색()
 *   	수정()
 *   	추가()
 *   	삭제()
 *   	답하기()
 *   	}
 *      class 갤러리계시판 extends 게시판{
 *   	파일업로드() => 이미지
 *   	}
 */


import javax.swing.*;

class Super {
	int a;
	int b;
}
class Sub extends Super{
	int c;
}

public class MainClass_4 {
	public static void main(String[] args) {
		/*
		 * Super su = new Super(); System.out.println(su.a); System.out.println(su.b);
		 * 
		 * Sub sub = new Sub(); System.out.println(sub.a); System.out.println(sub.b);
		 * System.out.println(sub.c);
		 */
		
		Super su = new Sub(); // 가장 많이 사용된다
	//  상위				하위
	//	su => a,b\
		System.out.println(su.a);
		System.out.println(su.b);
		Sub sub = (Sub)su; // 형변환
		// Super > Sub
		System.out.println(sub.a);
	//	sub => a,b,c
	//	클래스에 따라 => 접근 변수가 달라진다
	// => 인터페이스 => 상위 클래스로 처리 => 형변환
	}

}
