//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class 연습문제_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("start 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("end 정수 입력 : ");
		int num2 = scan.nextInt();
		if(num1<num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(num1+"X"+i+" = "+i*num1);
			}
		}
		else {
			System.out.println("시작값이 끝값보다 큽니다!!");
		}
		
	}

}
