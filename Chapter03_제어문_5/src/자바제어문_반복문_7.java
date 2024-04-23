/*
 * 알파벳을 입력을 받아서
 * 		→ 대문자 : 소문자
 * 		→ 소문자 : 대문자 출력
 * 
 * 1~4장 → 자바의 기본 문법
 * 5~7장 → 객체지향 프로그램
 * 8장 : 예외처리 → 프로그램을 종료하지 않게 만든다
 * ----------------------------------------자바기초
 * 9장~라이브러리(조립식) → 암기
 * 모든 프로그램
 * ----------
 * | 마지막 단어(오라클 연동) → JDBC(웹 : 85%)
 *   웹 개발자 : Java , 데이터베이스 , Spring 
 *             JavaScript → VueJS , ReactJS
 * | C/C++ → 네트워크
 */

import java.util.Scanner;

public class 자바제어문_반복문_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c;
		for(int i=0;i<5;i++) {
			System.out.print("알파벳을 입력해주세요 : ");
			c=scan.next().charAt(0); // 5번의 메모리가 만들어진다(메모리 할당)
			//for 한바퀴때마낟 사라지고 다시 만들어진다
			System.out.println("입력된 알파벳 : "+ c );
			if(c>='A'&&c<='Z') {
				System.out.println("소문자로 변경된 알파벳 : "+(char)(c+32));
				break;
			}
			else if(c>='a'&&c<='z') {
				System.out.println("대문자로 변경된 알파벳 : "+(char)(c-32));
				break;
			}
			else {
				System.out.println("알파벳이 아닙니다 다시 알파벳을 입력해주세요!!");
				continue;
			}
		}
		// c변수는 사용이 가능 → for문안에 있는 경우에는 밖에서 불가 
	}

}
