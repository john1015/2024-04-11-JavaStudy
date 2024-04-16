/*
 * 연산자
 * 	단항연산자
 * 		= 증감연산자(++,--)
 * 		  전치 / 후치 ---- 무조건 1씩 증가/감소
 * 		  a++; → a에 1을 증가 연산자가 2개 이상일시 - 다른연산을 수행하고 나중에 증가
 * 		  ++a; → a에 1을 증가 연산자가 2개 이상일시 - 먼저 증가한후에 다른 연산을 수행
 * 		  ++ / -- 변수값 자체가 변경
 * 			→ 반복문에서 주로 사용
 * 			→ 웹(데이터베이스 연동) ***
 * 			
 * 		= 부정연산자(!) → boolean으로만 사용이 가능
 * 					 → true → false , false → true
 * 					 → 조건문 , 반복문 (제어문에서 주로 사용)
 * 					 boolean bCheck = false;
 * 					 !bCheck → true
 * 		= 형전환연산자(데이터형)
 * 		  형변환 : byte / char / int / long / float / double
 * 				 (int)문자 → 정수
 * 				 (double)정수 → 실수 
 * 				 (int)실수 → 정수
 * 				 (char)정수 → 문자
 * 			   1) 묵시적 형변환 → 자동 형변환
 * 			   	  작은 데이터형 → 큰데이터형     int i ='A'; A(char) → 자동으로 int 변경(65)
 * 			   	  
 * 			   2) 강제 형변환
 * 				  int a =(int)10.5     10.5 → 10(int)
 * 				 데이터형의 크기 확인
 * 						<================== 강제형변환(명시적)		
 * 				 byte < char < int < long < float < double
 * 						==================> 자동형변환(묵시적)
 * 
 * 				** 연산시 주의점 
 * 				1. 데이터형
 * 				2. 프로그램에 필요한 데이터형이 무엇인지 확인
 * 	이항연산자(연산대상 : 피연산자 → 2개)
 * 		= 산술연산자(+,-,*,/,%)
 * 		  + :
 * 			 일반 산술(덧셈)
 * 			   → 10+10=20
 * 			 문자열 결합
 * 			   → "Hello " + "Java" → "Hello Java" → 데이터저장 , 크롤링
 *  	  / : 
 *  		 0으로 나눌수 없다 : 조건 , 예외처리
 *  		 정수/정수 = 정수        파이썬,자바스크립트,오라클 → 정수/정수=실수
 *		  % : 
 *			 배수구하기 , 조건
 *			 부호가 왼쪽부호가 남는다 
 *			- *,/,% 가 +,- 보다 우선순위를 가지고 있다 
 *			- 우선순위를 변경하려면 ( )를 이용 			 
 * 		= 비교연산자(==,!=,<,>,<=,>=)
 * 			 == : 같다 (JavaScript : === , Oracle : = )
 * 			 != : 같지 않다
 * 			 < : 작다
 * 			 > : 크다
 * 			 <= : 작거나 같다 → <||==
 * 			 >= : 크거나 같다 → >||==
 * 				*** 문자/숫자(정수,실수) : 문자열은 비교가 안된다
 * 									   equals() , !equals(), compare() (크다작다)
 * 									   String → 클래스형(주소)
 * 		= 논리연산자(&&,||)
 * 			&& →
 * 			(조건) && (조건) → 조건 2개가 true 일 경우에 true → 나머지는 false 결과값 → 범위포함 대문자/소문자
 * 			(조건) || (조건) → 조건중 1개이상 true 일 경우에 true → false/false일경우 false 결과값 → 범위포함 대문자/소문자
 * 			&& : 앞에있는 조건이 false → 뒤에있는 연산은 하지 않는다(앞이 false일 확률이 많은 것)
 * 			|| : 앞에있는 조건이 true → 뒤에있는 연산은 하지 않는다(앞이 true일 확률이 많은 것)
 * 
 * 			프로그램
 * 				1) 기본문법 - 변수/데이터형/연산자/제어문
 * 				2) 묶는 연습 - 데이터묶음(배열/클래스)
 * 						   - 명령문 묶음(메소드)
 * 						   - +(클래스) → 데이터형/액션(기능 처리)
 * 						   - (패키지)
 * 				3) 재사용을 중심
 * 				4) 퍼포먼스 중심(속도) → 최적화
 * 
 * 			→ 자바는 무조건(true/false)
 * 				true : 0,0.0이 아닌수
 * 				false : 0,0.0
 * 			  → C / C++ / Python / JavaScript → 숫자
 * 		= 대입연산자(=,+=,-=)
 * 		 1) 대입연산자
 * 			int a=10
 * 			a=10+10 → 계산된 결과를 a에 저장
 * 		 2) 복합대입연산자(연산자가 두개)
 * 			++/-- → 1개증가 , 1개감소
 * 			+= → 여러개 증가, 여러개 감소
 * 			int a=10; a+=10 → a=a+10 →a=20
 * 	삼항연산자  ==> 소스가 긴 경우에 주로 사용 (HTML)
 * 		=(조건)?값1:값2
 * 		 ----
 * 		 결과값 : true → 값1
 * 			 	 false → 값2
 * 		  ex)
 * 			 int a=10;
 * 			 a%2==0?"짝수":"홀수"
 * 			-------
 * 			 true → "짝수"  false → "홀수"
 */
public class 연산자_삼항연산자 {

	public static void main(String[] args) {
		
		//자동형변환
		char c=65;// A
		System.out.println(c);
		int a=10;
		int b=55;
		char c1=(char)(a+b);
		System.out.println(c1);
		
		int num=(int)(Math.random()*100)+1;
		System.out.println("num= "+num);
		System.out.println(num%2==0?"짝수":"홀수");
	}

}
