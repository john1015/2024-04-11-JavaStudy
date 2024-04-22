//7.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
public class 연습문제_7 {

	public static void main(String[] args) {
		int sum1=0,sum2=0;
		for (int i = 1; i <= 30; i++) {
			if(i%2==0) {
				sum1+=i;
			}
			else {
				sum2+=i;
			}
		}
		System.out.println("짝수합:"+sum1);
		System.out.println("홀수합:"+sum2);
	}

}
