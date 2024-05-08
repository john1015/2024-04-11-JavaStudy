package com.sist.main;
//Movie클래스를 불러온다
import com.sist.vo.Movie;
import java.util.*;
import java.sql.*;
//클래스가 다른 폴더에 저장된 경우는 반드시 import를 이용해서 불러온다
//		 -------- 패키지
/*
 *  private / public
 *  
 *  변수 => private => 데이터 공개(X)
 *  		=> 접근이 가능하게 만든다
 *  		=> getXxx() , setXxx()
 *  메소드 / 클래스 / 생성자 => 다른 클래스에서 연결 => public
 */
public class MainClass {

	public static void main(String[] args) {
		// 메모리에 저장
		//com.sist.vo.Movie movie = new com.sist.vo.Movie(); //import 안하고 선언하기
		java.util.Date date = new java.util.Date(); // 클래스 충돌 방지
		Movie movie = new Movie();
		movie.setRank(1);
		System.out.println("순위 : "+movie.getRank());
		
	}

}
