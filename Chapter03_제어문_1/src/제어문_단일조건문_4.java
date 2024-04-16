/*
 * 	변수 / 연산자 / 제어문 → 데이터베이스 → 웹사이트
 * ------------------------------
 * 		  		|
 * 			  재사용 (게시판) → 메소드
 * 							   |
 * 							 목록출력
 * 							 글쓰기
 *							 ... 
 *		char → 대문자 / 소문자 / 알파벳이 아니다
 */

import java.util.Scanner;

public class 제어문_단일조건문_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c;
		System.out.println("문자입력 : ");
		c=scan.next().charAt(0);
		System.out.println("=========결과===========");
		
		if(c>='A'&&c<='Z') System.out.println(c+"는(은) 대문자입니다");
		if(c>='a'&&c<='z') System.out.println(c+"는(은) 소문자입니다");
		if(!((c>='A'&&c<='Z')||(c>='a'&&c<='z'))) System.out.println(c+"는(은) 알파벳이 아니다");
	}

}
