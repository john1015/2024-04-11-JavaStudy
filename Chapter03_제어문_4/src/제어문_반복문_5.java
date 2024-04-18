/*
 * 1~100 사이의
 * 	→ 짝수의 합
 * 	→ 홀수의 합
 *  → 전체 합 
 */
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		int even=0 ,odd=0 ,sum= 0;
		int ecnt=0,ocnt=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) { even +=i; ecnt++;}
			else  {odd+=i; ocnt++;}
			sum +=i;
		}
		System.out.println("1~100 사이의 짝수 합 : "+even+" 짝수의 개수 : "+ecnt);
		System.out.println("1~100 사이의 홀수 합 : "+odd+" 홀수의 개수 : "+ocnt);
		System.out.println("1~100 사이의 전체 합 : "+sum);
		
	}

}
