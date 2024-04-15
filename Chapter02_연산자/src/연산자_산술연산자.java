import java.util.*; // 자바에서 지원하는 라이브러리를 읽어 온다

public class 연산자_산술연산자 {
	/*
	 *  () : 최우선 순위 연산자
	 *   5+5*10  : * → 1번 , + → 2번
	 *   (5+5)*10 :+ → 1번 , * → 2번 
	 */

	public static void main(String[] args) {

		// 임의로 변수값을 지정 → int a =10;
		// 변수 선언
		int num1 ,num2; //사용시 오류 → 변수 초기화가 안댐
		Random r= new Random();
		// 임의의 수를 추출 
	 num1 = r.nextInt(101); // 0~100까지 사이의 정수 추출 → 마지막 제외
	 num2 = r.nextInt(101);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2); 
		
		//+ 
		int plus = num1 +num2 ;
		System.out.println("Plus = " + (num1+num2));
		
		//System.out.println(5+5*10);
		//System.out.println((5+5)*10);
		int minus = num1-num2;
		System.out.println("minus : " + minus);
		
		int mul=num1*num2;
		System.out.println("mul : "+mul);
		
		int a=10;
		int b=3;
		System.out.println(a/(double)b);
		
		System.out.println(a%b);
		System.out.println(a%-b);
		System.out.println(-a%b);
		System.out.println(-a%-b);
		
	}

}
