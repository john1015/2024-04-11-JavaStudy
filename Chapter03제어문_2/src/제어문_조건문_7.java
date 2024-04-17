/*
 * 1. 형식 → 어떤곳에서 사용
 * 2. 흐름 파악 → 동작 순서
 * 3. 응용 
 * -----------------------
 * 1) 제어문 : 프로그램 제어 → 요청한 내용만 출력 ,    반복 수행  , 선택된 내용만 출력 
 * 						  (필요시에 건너뛸수도 있다) (반복문)   (선택문)
 * 											  중단 → break
 * 											  다시 시작 → continue
 * 		→ 조건문 : 오류처리 , 건너뛴다 ... 사용자 요청에 맞는 내용만 출력
 * 		  = 단일 조건문 : 독립적인 문장(조건에 맞는 모든 문장을 수행)
 * 			if(조건문){
 * 				true에 수행이 되는 영역 → false면 건너뜀
 * 			}
 * 		  = 선택 조건문 : true/false → 나눠서 처리
 * 			if(조건문){
 * 				true일때 처리되는 문장
 * 			}
 * 			else {
 * 				false일때 처리되는 문장
 * 			}
 * 		  = 다중 조건문 : 여러개의 조건중에 1개만 출력 → 58page
 * 			형식)
 * 				if(조건문){ 
 * 						조건문 → true → 문장수행 종료
 * 							   false → 다음조건문으로 이동
 * 				}
 * 				else if(조건문){}
 * 				else if(조건문){}
 * 				else if(조건문){}
 * 				else{해당조건이 없는 경우에 수행문장 → 필요시에만 처리(생략가능)}
 * 		if~else → 단일 조건문 → 다중 조건문
 * 								| 게임 → 키 선택
 * 								  메뉴 → 대체 switch~case
 */
//성적 계산 → 다중 조건문 → 자주 풀어본다
import java.util.Scanner;

public class 제어문_조건문_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 클래스 메모리 저장 → new
		// System.in → 키보드 입력값
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt(); // 정수값
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		System.out.println("국어 점수 : "+kor +" 영어점수 : "+eng + " 수학점수 : "+ math);
		System.out.println("총점 : "+(kor + eng + math));
		System.out.printf("평균 : %.2f\n",((kor+eng+math)/3.0));
		//요청 → 학점 → 다중조건문
		char score='A';
		int avg=(kor+eng+math)/3;
		
		if(avg>=90) {
			score='A';
		}
		else if(avg>=80) {
			score='B';
		}
		else if(avg>=70) {
			score='C';
		}
		else if(avg>=60) {
			score='D';
		}
		else {
			score='F';
		}
		System.out.println("학점 : "+score);
		
		
	}

}
