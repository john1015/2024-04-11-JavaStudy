import java.util.Scanner;
// c → include
// c# → using
// python → import
// javascript → import
// 기존에 만든 클래스를 불러온다, 라이브러리 읽기
// 같은 폴더에 있는 경우에는 생략 → 다른 폴더에 있는 경우에만 사용
// 국어,영어,수락 점수를 입력받아서 → 총점 , 평균
public class 연산자_입력값처리 {

	public static void main(String[] args) {
		int kor,eng,math,total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 ,영어, 수학   :(예시:60 70 80) ");
		//System.out.printf("국어 점수 : ");
		kor=sc.nextInt();
		//System.out.printf("영어 점수 : ");
		eng=sc.nextInt();
		//System.out.printf("수학 점수 : ");
		math=sc.nextInt();
		
		total=kor+eng+math;
		avg = total/3.0;
		
		System.out.println("=====결과=====");
		System.out.println("총점 : "+total);
		System.out.printf("평균:%.2f",avg);
		
	}

}
