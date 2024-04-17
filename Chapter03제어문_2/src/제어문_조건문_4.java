/*
 *  if~else → 삼항연산자
 *  		  (조건)? 값1:값2
 *  		 true 값1
 *  		 flase 값2
 *  if(조건문){
 *  	조건 true
 *  }
 *  else{
 *  	조건 false
 *  }
 *  
 *  3개의 정수(국어 영어 수학)
 *  →A , B , C , D , F
 *  	→ A+ , A0 , A-
 *  	 100~97
 *  	 96~93
 *  	 92~90
 *	1. 국어 영어 수학 입력 → 사용자
 *	2. 조건에 맞게 → 학점 부여
 */

import java.util.Scanner;

public class 제어문_조건문_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * System.in은 키보드 입력값을 읽어 온다 → 키보드 입력값만 읽을수 있다
		 * 1) 정수 : nextInt() → int
		 * 2) 실수 : nextDouble() → double
		 * 3) 논리 : nextBoolean() → boolean
		 * 4) 문자열 : next() → String
		 * 			  문자추출 → next().charAt(6) → 'G' → char
		 */
		int kor,eng,math;
		double avg;
		System.out.print("국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요");
		math = scan.nextInt();
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		avg=(kor+eng+math)/3;
		System.out.printf("평균 : %.2f\n",avg);
		
		//학점 → 중첩 조건문
		//1. 학점 → A~F
		//2. op → + , 0 , -
		//지역변수 반드시 초기화
		char score='A';
		char op='+';
		if(avg>=90&&avg<=100) {
			score='A';
			if(avg>=97 && avg<101) System.out.println("학점은 "+score+op+" 입니다");
			if(avg>=93 && avg<97) { op='0'; System.out.println("학점은 "+score+op+" 입니다");}
			if(avg>=90 && avg<93) {op='-'; System.out.println("학점은 "+score+op+" 입니다");}
		}
		if(avg>=80&&avg<90) {
			score='B';
			System.out.println("학점은 "+score+" 입니다");
		}
		if(avg>=70&&avg<80) {
			score='C';
			System.out.println("학점은 "+score+" 입니다");
		}
		if(avg>=60&&avg<70) {
			score='D';
			System.out.println("학점은 "+score+" 입니다");
		}
		if(avg<60) {
			score='F';
			System.out.println("학점은 "+score+" 입니다");
		}
		
		
		
	}

}
