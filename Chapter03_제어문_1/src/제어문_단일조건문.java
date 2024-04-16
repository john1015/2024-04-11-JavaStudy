/*
 *  단일 조건문 
 *  	if(조건문) → 반드시 true/false → 부정연산자 , 비교연산자,논리연산자만 사용
 *  	{
 *			실행문장 → 조건 true일때만 수행  
 *  	}
 *  1) 정수를 입력받아서 짝수/홀수 처리
 */

import java.util.Scanner;

public class 제어문_단일조건문 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("정수 입력 : ");
		
		//입력요청 → 변수에 저장
		num = scanner.nextInt();
		if(num%2==0)//짝수조건 
		{
			//true
			System.out.println(num +"는(은) 짝수입니다");
		}
		if(num%2!=0) System.out.println(num+"는(은) 홀수입니다");
	}

}
