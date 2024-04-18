/*
 *  자바 제공하는 제어문 : 필요한 내용만 출력 	,			반복수행 , 반복제어 ▷ 종료 ,제외 break continue
 *  				  └ 조건문 , 선택문 (다중조건문과 동일)└for , while , do~while
 *  ---------------- 연산자+제어문 = 메소드
 *  1) 조건문 : 사용빈도가 가장 많다
 *  	→ 단일 조건문 : 검색 → 검색어 입력여부 확인 , 상세보기
 *  				 형식)
 *  					if(조건문){ // 조건문 : true/false → 부정연산자(!) , 비교연산자(==,!=,<,>,<=,>=) , 논리연산자(&&,||)
 *  						조건이 true일때만 수행 → false면 스킵
 *  					}
 *  	→ 선택 조건문 : true / false를 나눠서 처리
 *  		=> 로그인(로그인된 경우(true) , 로그인이 안된 경우(false))
 *  		=> 아이디 중복(중복이된경우 , 중복이 안된 경우)
 *  				형식)
 *  					if(조건문){ 조건이 true일때 처리}
 *  					else{ 조건이 false일때 처리}
 *  	→ 다중 조건문 : 조건이 여러개 → 한개만 수행
 *  				 → 메뉴 클릭 , 키보드 (키값) → 게임
 *  				   └ 웹 화면변경,종료,새로고침 ...
 *  				형식)
 *  				    if(조건문){ 조건문이 true일때 문장수행 → 종료 , false일시 바로 밑 조건문}
 *  					else if(조건문){ 조건이 true일때 문장수행 , flase일시 밑으로 내려감}
 *  					else{ 해당 조건이 없는경우 문장수행 → 생략 가능} 
 *  	→ 선택문 : 다중조건문을 단순화 → 웹에서는 거의 사용빈도가 없다 
 *  							   화면이동(JSP) → Spring
 *  							   → Front(Router)
 *  							   → 간결하다 → 게임(키보드 값)
 *  	   *** 웹 → if / if~else / for / while
 *  			  → 기본 : 데이터베이스 : SQL(80%) → 취업
 *  	   : 한개의 값이 있는 경우 => 선택문
 *  	   : 범위가 있는 경우 => 다중 조건문
 *  		 score>=90&&score<=100 → 10
 *  		 score=90 91 92....
 *  	HTML/CSS/JavaScript → 화면UI
 *  		  |
 *  		 Java : 데이터 처리(요청 처리)
 *  		  |
 *  		oracle : 데이터를 저장하는 공간 → 데이터베이스(영구적)
 *    -------------------------------------------AWS (PaaS) → Linux
 *    형식)
 *    		switch(정수 , 문자 , 문자열)=> 문자( + - * / ){
 *    			case '+': 문자중에 +가 들어온 경우
 *    				처리문장
 *    			break; → 처리후에 종료
 *    		    case '-' : 문자중에 - 가 들어온 경우
 *    			    처리문장
 *    				break; → 처리후에 종료
 *    			...
 *    			defalult : → case에 없는 데이터가 있는 경우 → 다중조건문 else
 *    				처리문장
 *    		}
 *    
 *    		→ 같은처리 100/10 ==>10 9 8 7...
 *    		switch(정수){
 *    			case 10:
 *    				A
 *    				break;                     →                X
 *    			case 9:
 *    				A
 *    				break;
 *    		}
 *    
 *    switch(정수){
 *    	case 10 : 
 *    	case 9 :                              →                 O
 *    		A
 *    		break; → break가 없는 경우도 있다
 *    }
 *    break가 없는 경우 → 밑에 있는 break까지 수행
 */

import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/) : ");
		char op = scan.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
	    int num2 = scan.nextInt();
	    // 사용자 입력요청
	    //결과값 출력
	    /*
	     *	문자  → ''
	     *	문자열 → ""
	     */
	    switch(op){ //문자 , 정수 , 문자열(실수 , 논리형은 사용이 불가능)
	    	
	    	case '+' :
	    	//처리문장
	    	System.out.println(num1+"+"+num2+" = "+(num1+num2));
	    	break;
	    	case '-' :
	    		//처리문장
	    		System.out.println(num1+"-"+num2+" = "+(num1-num2));
	    		break;
	    	case '*' :
	    		System.out.println(num1+"X"+num2+" = "+(num1*num2));
	    		break;
	    	case '/' :
	    		if(num2==0)System.out.println("0으로 나눌수 없다");
	    		else System.out.println(num1+"/"+num2+" = "+(num1/num2));
	    		break;	
	    	default:
	    		System.out.println("잘못된 연산자 입니다.");
	    		//마지막은 break사용할 수 있고 사용하지 않을 수도 있다
	    		//*** case에 등록된 값이 중복되면 오류 발생
	    		//*** 데이터가 일치 → case에 등록되는 데이터형 통일
	    }
		
	}
}
