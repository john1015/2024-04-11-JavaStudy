/*
 * 사용자로부터 2~9사이의 정수를 입력받아서 구구단 출력
 * 단, 입력이 2~9가 아닐 경우에는 다시 입력을 하게 만든다
 */

import java.util.Scanner;

public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = 0;// 블록변수 → {}를 벗어나면 자동삭제
		// 프로그램에 필요한 데이터를 사용자로부터 받아서 → 오류 체크 
		
		// 내가 만든것
		/*
		 * for (;;) { System.out.print("정수(2~9)를 입력해 주세요 : "); dan = scan.nextInt();
		 * if(dan>=2&&dan<=9) { for (int i = 1; i <=9; i++) {
		 * System.out.println(dan+" X "+i+" = " + dan*i); } break; } else {
		 * System.out.print("정수(2~9)가 아닙니다 다시 정수(2~9)를 입력해 주세요 : "); } }
		 */
		
		for (;;) {
			System.out.print("정수(2~9)를 입력해 주세요 : ");
			dan = scan.nextInt();
			if (dan < 2 || dan > 9) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			break;
		}
		System.out.println("단 : " + dan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}
