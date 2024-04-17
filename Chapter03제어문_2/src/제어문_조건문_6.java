/*
 * month
 * 1~12 → else(잘못된 입력인 경우)
 */

import java.util.Scanner;

public class 제어문_조건문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력(1~12) : ");
		int month = scan.nextInt();
		if(month>=1 && month<=12) {//정상적으로 입력이 됬다면
			//중첩조건문이 많이 등장
			if(month==1||month==2||month==12) System.out.println("겨울 입니다");
			if(month>=3 && month<=5)System.out.println("봄 입니다");
			if(month>=6 && month<=8)System.out.println("여름 입니다");
			if(month>=9 && month<=11)System.out.println("가을 입니다");
		}
		else System.out.println("없는 달 입니다(잘못 입력)"); //입력실수가 있거나 잘못입력이 된 경우
	}

}
