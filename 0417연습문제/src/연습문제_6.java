//6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,60점 이하면 F를 출력하라 (다중조건문 사용)

import java.util.Scanner;

public class 연습문제_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		char c = ' ';
		if(a>=90&&a<=100) {
			c='A';
			System.out.println(c+"학점입니다");
		}
		else if(a>=80) {
			c='B';
			System.out.println(c+"학점입니다");
		}
		else if(a>=70) {
			c='C';
			System.out.println(c+"학점입니다");
		}
		else if(a>=60) {
			c='D';
			System.out.println(c+"학점입니다");
		}
		else {
			c='F';
			System.out.println(c+"학점입니다");
		}
				
		
	}

}
