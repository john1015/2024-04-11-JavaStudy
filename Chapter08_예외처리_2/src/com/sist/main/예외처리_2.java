package com.sist.main;
import java.io.IOException;
/*
 *  throw : 임의로 에러 발생
 *  		형식)
 *  			throw new 예외클래스() => catch로 이동
 *  			=> 코딩이 불가능
 *  			catch는 예외처리 크기에 따라 순서가 존재 => 상속도
 *  			throws문장 예외처리 순서가 없다 => ,
 *  
 *  		자바는 => 다시 올라오지 않는다
 */
import java.util.*;

public class 예외처리_2 {
	public void disp() throws Exception {
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양수만 입력 :");
		int no = scan.nextInt();
		try {
			// 예외처리 발생한 것이 아니라 => 임의의 발생
			// 애플리케이션 테스트
			// 개발자 => 단일 테스트 => JUnit
			if(no<0) {
				// 견고한 프로그램 => 에러발생시에 처리가 되고 있는지 => 테스트
				throw new IllegalArgumentException("음수는 사용할수 없다");
				//예외를 던진다 => 직접 예외의 catch를 호출이 가능
			}
			System.out.println("no = "+no);
		} catch (Exception e) { // 입력값이 잘못된 경우
			System.out.println(e.getMessage());
		}
		// 반드시 실행되는 문장이 있는 경우
	}

}
