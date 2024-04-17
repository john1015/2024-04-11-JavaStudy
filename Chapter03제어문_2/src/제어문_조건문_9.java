//사칙연산 → 연산을 한번만 수행 → 다중 조건문

import java.util.Scanner;

public class 제어문_조건문_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//사용변수
		int num1,num2;
		char op=' ';
		System.out.print("첫번째 정수를 입력해주세요 : ");
		num1 = scan.nextInt();
		System.out.print("연산자를 입력해주세요(+ - * /) : ");
		op = scan.next().charAt(0);
		System.out.print("두번째 정수를 입력해주세요 : ");
		num2 = scan.nextInt();
		
		if(op=='+') {
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		}
		else if(op=='-') {
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
		}
		else if(op=='*') {
			System.out.println(num1+" X "+num2+" = "+(num1*num2));
		}
		else if(op=='/') {
			if(num2 == 0) System.out.println("0으로 나눌수 없습니다");
			else System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
		}
		else {
			System.out.println("연산자가 잘못 입력되었습니다");//+ - * /가 아닌경우
		}
		
		
	}

}
