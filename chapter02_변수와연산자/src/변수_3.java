/*
 *  국어 영어 수학 → 총점 / 평균 / 학점 (ABCDF)
 */
public class 변수_3 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 75;
		int total = kor+eng+math;
		double avg = total/3.0; // 3만있으면 소수점 이하는 없어짐 3.0을해야 소수점 이하까지 계산이 됨
		System.out.println("국어 점수 : "+ kor);
		System.out.println("영어 점수 : "+ eng);
		System.out.println("수학 점수 : "+ math);
		System.out.println("총점 : "+ total);
		System.out.printf("평균 : %.2f\n", avg);
		
	}

}
