package com.sist.util;
// StringTokenizer : 문자열 분리
/*
 *      nextToken() => 분리된 데이터를 가지고 오는 경우
 *      hasMoreTokens() => 분리된 데이터만큼 루프
 *      counterToken() => 분리된 개수
 */

import java.util.*;

public class 라이브러리_6 {
	public static void main(String[] args) {
		String colors = "red,green,blue,black,white,yellow,magenta,pink,gray";
		StringTokenizer st = new StringTokenizer(colors,","); // ,기준으로 단어를 분리
		// new StringTokenizer(colors) ==> 공백기준
		System.out.println("color의 개수 : "+st.countTokens());
		
		/*for (int i = 0; i < 9; i++) {
			System.out.println(st.nextToken());
		}*/
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+"   ");
		}
		/*
		 * hasMoreTokens() => 329page => 이미지 => 전체 분리된 데이터를 가지고 올때
		 * 
		 cursor-----------------------------------
		 * 		before / first
		 * ---------------------------------------
		 * 		red => st.nextToken() => true
		 * ---------------------------------------
		 * 		green => st.nextToken() => true
		 * ---------------------------------------
		 * 		blue => st.nextToken() => true
		 * ---------------------------------------
		 * 
		 * .......
		 * ---------------------------------------
		 * 		after / last  st.nextToken() => flase => 종료
		 * ---------------------------------------
		 */
	}
}
