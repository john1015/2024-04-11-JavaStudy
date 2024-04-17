/*
 *  프로그램 형식
 *  1) 평문 : 순차적으로 처리 → 연산자 
 *  2) 조건문(선택문) → 필요에 따라서 건너뛴다 . 프로그램에 맞게 수행이 가능
 *  	→ 로그인 , 아이디 찾기 , 검색 , 상세보기
 *  	→ 종류 
 *  	 1. 단일 조건문
 *   		→ 형식 
 *   		if(조건문) → 조건(true/false) → 부정연산자 / 논리연산자 / 비교연산자
 *   		{ 조건이 true일경우에만 수행 문장 처리 }
 *   		→ 부정연산자(!) → 반대 효과
 *   		→ 논리연산자 → 조건이 2개인경우 → id가 같고 pwd가 같은경우 : && , ||
 *   		→ 비교연산자(== , != , < , > , <= , >=)
 *   		→ 프로그램 : 라이브러리 사용 / 데이터베이스(오라클) → 데이터 처리
 *   		  -------------------------------------------------------------
 *   		  사용자가 요청한 데이터만 읽기 → 출력
 *   		(조건 → 사용자 요청/처리결과물 → 사용자중심의 프로그램)
 *   		(요구사항 분석 → 필요한 데이터 저장(데이터베이스))
 *   		  (아키텍처)  	   (DBA)
 *   		→ 화면 UI → 구현(자바) → 테스트 → 배포
 *   		(퍼블리셔) (웹프로그래머) (테스터)
 *  	 2. 선택 조건문 → true/false를 나눠서 처리
 *  		→ 형식
 *  	 3. 다중 조건문 → 여러개의 조건중에 1개만 처리
 *  	 4. 선택문 → 값 1개 선택해서 처리 → 메뉴 , 키보드(게임)
 *  3) 반복문 → 같은 코딩이 여려번 나오는 경우
 *  	→ 목록 출력 , 검색결과 
 *  
 *  
 *  단일 조건문
 *   : 자바에서 제어문은 바로 밑에 있는 문장만 제어할 수 있다
 *   → if(조건문)
 *   	실행문장1 → if 소속문장
 *   	실행문장2 → if문과 관련없는 문장 → 무조건 수행
 *   → 여러개의 문장을 동시에 수행
 *   	if(조건문){ 
 *   		실행문장1
 *   		실행문장2 → if문 소속문장
 *   	}
 *   	→ 조건문 : 오류처리 / 예외처리 
 *   	
 *   	중첩 조건문
 *   	if(조건문){
 *   		if(조건문){
 *			   실행문장   		
 *   		}
 *   	}
 *   	→ if(조건문 && 조건문){
 *   		실행문장 → 조건이 true일때만 수행
 *   	}
 */

import java.util.Scanner;

public class 제어문_조건문_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//모든 클래스는 메모리에 저장할때 new → 동적메모리 할당 → 메모리에 저장
		System.out.print("1~100까지 사이의 두자리 정수를 입력하세요 : ");
		int num = scan.nextInt();//키보드로 입력된
		if(num>=10 && num<=99) {
			// 정상적으로 입력이 된 경우
			/*
			 * int a=num / 10; int b=num % 10; if(a==b) { System.out.println("같은 숫자입니다"); }
			 * if(a!=b) { System.out.println("다른 숫자입니다"); }
			 */
			if(num%11==0) {
				System.out.println("같은 숫자입니다");
			}
			if(num%11!=0) {
				System.out.println("다른 숫자입니다");
			}
		}
		if(!(num>=10 && num<=99)) {
			//오류처리 → 사용자가 잘못 입력한 경우
			System.out.println("잘못된 입력입니다");
		}
		
	}

}
