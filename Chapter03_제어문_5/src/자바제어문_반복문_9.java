/*
 * 학생 3명의 국어 영어 수학 점수 → 총점 , 평균 , 학점을 출력해라
 */

import java.util.Scanner;

public class 자바제어문_반복문_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 클래스를 메모리에 저장 = new(새로운 공간을 만든다)
		// 지역변수 → 메모리에서 관리 {}이 끝나면 자동으로 메모리에서 삭제
		// new → 프로그래머가 관리 → 자동삭제 X → 계속 메모리에 존재
		// 메모리 누수현상 → GC(garbage collection → 프로그램 종료후 회수)
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째 국어 입력 : ");
			int kor=scan.nextInt();
			System.out.print((i+1)+"번째 영어 입력 : ");
			int eng=scan.nextInt();
			System.out.print((i+1)+"번째 수학 입력 : ");
			int math=scan.nextInt();
			
			System.out.println((i+1)+" 국어점수 : "+kor);
			System.out.println((i+1)+" 영어점수 : "+eng);
			System.out.println((i+1)+" 수학점수 : "+math);
			System.out.println((i+1)+" 총점 : " +(kor+eng+math));
			System.out.printf("%d 평균 : %.2f\n",(i+1),(kor+eng+math)/3.0);
			
			// 학점
			int avg=(kor+eng+math)/30;
			
			switch(avg) {
			
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				
			}
		}
		
		
	}

}
