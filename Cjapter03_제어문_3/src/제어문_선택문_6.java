/*
 * 학습 → 반복
 * → 형식
 * → 코딩연습
 * 	 = 안되는 지점
 * 	 = 에러 처리
 * → 라이브러리
 * → 구글링 → 관련된 큰 프로그램 찾기
 * ----------------------------
 */

import java.util.Scanner;

public class 제어문_선택문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력해주세요(1~12)");
		int month = scan.nextInt();//64page
		
		switch(month){
		case 12: case 1: case 2:
			System.out.println(month+"월은 겨울입니다");
			break;
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을입니다");
			break;
		default :
			System.out.println(month+"월은 없는 달입니다");
		}
		
	}

}
