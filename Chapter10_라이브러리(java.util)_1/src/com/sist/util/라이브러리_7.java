package com.sist.util;
/*
 *     java.text = 변환 (Format)
 *     ***= SimpleDateFormat => 날짜 변경
 *     ***= DecimalFormat => 정수 변경 => 1,000 (,)
 *     = ChoiceFormat => swotch
 *     = MessageFormat => SQL , 출력형태
 *     
 */
import java.util.*;
import java.text.*;

public class 라이브러리_7 {
	public static void main(String[] args) {
		// 시스템의 날짜
		Date date = new Date();
		//System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // SYSDATE
		/*
		 *     년도 : yyyy/yy
		 *     월 : MM/M => 05/ 5 <-월은 대문자
		 *     	   -----
		 *     일 : dd/d 
		 *     시간 : hh/h
		 *     분 : mm/m   <- 분은 소문자
		 *     초 : ss/s
		 */
		System.out.println(sdf.format(date));
		StringTokenizer st = new StringTokenizer(sdf.format(date),"-");
		System.out.println(st.nextToken()+"년도 "+st.nextToken()+"월 "+st.nextToken()+"일"); 
		// => 게시판에 날짜 출력 , 예약일 ....
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
				
	}
}
