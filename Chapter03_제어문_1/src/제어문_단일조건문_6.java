/*
 *  국어 영어 수락 점수를 입력받아서 
 *  총점을 구하고 평균을 구해라
 *  학점
 */

import java.util.Scanner;

public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor,eng,math;
		char score =' ';
		System.out.print("국어 점수를 입력해주세요");
		kor=scan.nextInt();
		System.out.print("영어 점수를 입력해주세요");
		eng=scan.nextInt();
		System.out.print("수학 점수를 입력해주세요");
		math=scan.nextInt();
		
		//학점
		int avg=(kor + eng + math)/3;
		if(avg>=90 && avg<=100) score='A';
		if(avg>=80 && avg<=89) score='B';
		if(avg>=70 && avg<=79) score='C';
		if(avg>=60 && avg<=69) score='D';
		if(avg<60) score='F';
 		
		//출력
		System.out.println("======결과값=======");
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f \n",((kor+eng+math)/3.0)); // → \n : new line, \t : tab
		System.out.println("학점 : "+score+"학점");
		
		
	}

}
