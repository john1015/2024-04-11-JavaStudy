//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

public class 연습문제_9 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i <= 12; i++) {
			if(i%2==0||i%3==0||i%6==0) sum+=i;
		}
		System.out.println("2,3의배수의합 : "+sum);
	}

}
