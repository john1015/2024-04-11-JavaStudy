//5.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
public class 연습문제_5 {

	public static void main(String[] args) {
		int sum=0,cnt=0;
		for (int i = 100; i <= 999; i++) {
			if(i%7==0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("7의 배수 갯수 : "+cnt);
		System.out.println("7의 배수 합 : "+sum);
		
	}

}
