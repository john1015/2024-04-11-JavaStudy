/*
 * for → updown
 * 1. 난수 → 난수를 맞추는 프로그램
 * 	  ---- 힌트 : UP / Down
 * ----------------------------반복횟수가 명확하지 않는다 → while
 * → 종료 break;
 * → 잘못 입력시 continue;
 * ----------------------------반복 제어문
 */

import java.util.Scanner;

public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int cnt=0;
		while (true) {
			System.out.print("1~100사이의  정수를 입력해주세요 : ");
			int num=scan.nextInt();
			if(num>com){
				System.out.println("Down");
				cnt++;
				continue;
			}
			else if(num==com) {
				System.out.println("======== 정답!!! ======== ");
				cnt++;
				System.out.println("시도횟수 : "+cnt);
				break;
			}
			else {
				System.out.println("UP");
				cnt++;
				continue;
			}
		}
	}

}
