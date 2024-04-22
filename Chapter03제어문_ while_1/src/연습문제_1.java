//1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class 연습문제_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수정수(10~99)를 입력하시요 : ");
		int num = scan.nextInt();
		if(num%11==0)
			System.out.println("10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("10의 자리와 1의 자리가 같지않습니다!!");
	}

}
