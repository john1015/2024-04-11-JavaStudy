/*
 * 초를 받아서 => 시간 / 분 / 초를 출력
 * 63 -> 1분3초 ==> 라이브러리(시간 => 초단위) 60*60*24
 */

import java.util.Scanner;

public class 자바제어문_조건문_2 {
	//구글 온라인 시험
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int num = scan.nextInt();
		
		int hour=num/3600;
		System.out.print(hour+"시간 ");
		int min=(num%3600)/60;
		System.out.print(min+"분 ");
		int sec=((num%3600)%60)%60;
		System.out.print(sec+"초");
		// 숫자분리 ==> / %
	}

}
