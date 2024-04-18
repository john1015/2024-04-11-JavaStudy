//무한루프
/*
 *  간단한 게임 : UpDown게임
 *  → 1~100사이의 난수 → 맞추는 프로그램
 *  → 힌트 : 높게 / 낮게 67 → 55 → Up
 *  → 1~100 까지 사이의 수를 입력이 안된 경우 → 제외하고 다시 처음으로 이동 → continue
 *  → 정답을 맞춘 경우 → break(for문 종료)
 *  → 반복제어문 : break,continue
 *  → 다시 처음부터 실행
 *    --------------
 *    → 반복문
 *    → 메소드
 */

import java.util.Scanner;

public class 제어문_반복문_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. 난수 발생
		int com=(int)(Math.random()*100)+1;//1~100사이의 정수 한개 추출
		
		//2. 사용자가 난수를 맞추는 코딩
		//while(true) → 데이터베이스
		//오라클 → MySQL / MariaDB
		int cnt=0;
		for (;;) { // 종료하지 않는 프로그램 → 무한 루프 → 반드시 종료하는 프로그램 → q/Q
			// 사용자 입력
			System.out.print("1~100사이의 정수를 입력 : ");
			int user=scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("입력값에 오류가 있습니다!!");
				continue;
			}
			cnt++;
			if(com>user){
				System.out.println("Up ↑↑↑");
			}
			else if(com<user) {
				System.out.println("Down ↓↓↓");
			}
			else {
				System.out.println("정답입니다!!!");
				break; //for문 종료
			}
		}
		System.out.println(100-(cnt*5)+"점");
	}

}
