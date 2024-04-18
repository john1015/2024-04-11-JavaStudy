/*
 * 1~100까지의 합
 */
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// sum=sum+i
			sum+=i;// 누적 연산자
			System.out.println("i = "+i+", sum = "+sum);
		}
		System.out.println("1~100까지의 합 : "+sum);
		
	}

}
