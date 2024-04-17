/*
 * if ~ else
 * → if 정상 수행문장
 * → else 오류,잘못된 입력일 경우
 * 
 * 사칙연산 → 연산자를 잘못 입력한 경우 ... 처리
 */

import java.util.Scanner;

public class 제어문_조건문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		char op=' ';
		
		System.out.print("첫번째 정수를 입력하시요 : ");
		num1=scan.nextInt();
		System.out.print("연산자입력(+ - * /) : ");
		op=scan.next().charAt(0);
		System.out.print("두번째 정수를 입력하시요 : ");
		num2=scan.nextInt();
		if(op=='+'||op=='-'||op=='*'||op=='/') {
			if(op=='+') System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
			if(op=='-') System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
			if(op=='*') System.out.printf("%d X %d = %d\n",num1,num2,(num1*num2));
			if(op=='/') {
				if(num2==0) System.out.println("0으로 나눌수 없습니다");
				else System.out.printf("%d / %d = %.2f\n",num1,num2,((double)num1/num2));
			}
		}
		else System.out.println("잘못된 연산자 입니다"); //연산자가 없는 경우
		
	}

}
