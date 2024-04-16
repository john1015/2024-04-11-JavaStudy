/*
 * 정수입력을 받는다 → 양수/음수인지 확인해서 출력
 */

import java.util.Scanner;

public class 제어문_단일조건문_1 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num=sc.nextInt();
		if(num>=0) System.out.println(num+"는(은) 양수입니다");
		if(num<0) System.out.println(num+"는(은) 음수입니다");
	}

}
