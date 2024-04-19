//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
// 1~100까지 7배수,9의배수의 합

public class 연습문제_9 {

	public static void main(String[] args) {
		int sum=0;
		int a7=0,a9=0;
		for (int i = 0; i <= 12; i++) {
			if(i%2==0||i%3==0||i%6==0) sum+=i;
		}
		System.out.println("2,3의배수의합 : "+sum);
		for (int i = 1; i <=100; i++) {
			if(i%7==0) a7+=i;
			if(i%9==0) a9+=i;
		}
		System.out.println("7의 배수의합 : "+a7+" 9의 배수의 합 : "+a9);
	
	}

}
