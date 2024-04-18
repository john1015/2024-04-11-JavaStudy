/*
 * if문의 조건문과 다르게 case를 사용 → case애 사용할 수 있는 것 : 정수 , 문자 , 문자열
 * → 값을 1개 지정
 * → 값이 입력 → switch에 값을 받는다
 * 	switch(op)
 * → case 처음부터 검색
 * → 해당문자,정수를 찾아서 문장을 수행
 * → case를 찾아서 처리하고 break가 없는 경우에는 break가 존재하는 곳까지 문장을 수행
 * ** 찾은 case부터break가 있는 case까지 수행
 * ** 해당 case에 없는 경우에는 default(생략이 가능) → case마다 break;
 * ** break는 switch~case를 종료
 * 
 * ** 보통 프로그램에서는 if를 많이 사용한다
 * 	  경우의 수가 많은 경우에는 switch를 주로 이용한다(게임,메뉴)
 *   → switch가 if보다 간결하다 
 *   → 네트워크
 * ** if → 범위가 있는 경우
 * ** 값 1개씩 여러개인 경우 → switch
 */

import java.util.Scanner;

public class 연습문제_1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		int score = a/10;
		char hak = 'A';
		
		switch(score){
		case 10:
		case 9: hak = 'A'; System.out.println(hak+"학점입니다"); break;
		case 8: hak = 'B'; System.out.println(hak+"학점입니다"); break;
		case 7: hak = 'C'; System.out.println(hak+"학점입니다"); break;
		case 6: hak = 'D'; System.out.println(hak+"학점입니다"); break;
		case 5: case 4: case 3: 
		case 2: case 1: case 0: hak = 'F'; System.out.println(hak+"학점입니다"); break;
		default: System.out.println("잘못된 점수 입력입니다!!"); 
		}
	}

}
