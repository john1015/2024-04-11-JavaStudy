//6.	100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
public class 연습문제_6 {

	public static void main(String[] args) {
		int sum=0,cnt=0;
		for (int i = 100; i <= 999; i++) {
			if(i%4!=0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println("갯수 : "+cnt);
		System.out.println("합 : "+sum);
		
	}

}
